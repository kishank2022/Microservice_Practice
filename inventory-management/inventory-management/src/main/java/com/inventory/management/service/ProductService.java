package com.inventory.management.service;

import java.util.List;

import com.inventory.management.client.PriceClient;
import com.inventory.management.entity.Product;
import com.inventory.management.exception.ExternalServiceException;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.quarkus.hibernate.reactive.panache.common.WithTransaction;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.NotFoundException;




@ApplicationScoped
public class ProductService {

	    @Inject
	    @RestClient
	    PriceClient priceClient;

	    @WithTransaction
	    public Uni<Product> create(Product product) {
	    	// in this method we are calling PriceClient before persist the data in database
	        return priceClient.validatePrice(product.getName())
	            .onFailure()
	            .transform(e ->
	                new ExternalServiceException("Price service unavailable")
	            )
	            .onItem()
	            .transform(price -> {
	                if (!price.isValid()) {
	                    product.setPrice(price.getSuggestedPrice());
	                }
	                return product;
	            })
	            .flatMap(p ->
	                p.persist()
	                 .replaceWith(p)
	            );
	    }
	    
	    @WithTransaction
	    public Uni<Product> create_old(Product product) {
	        // Directly persist the product without calling PriceClient
	        return product.persist()
	                      .replaceWith(product);
	    }

	    public Uni<List<Product>> getAll() {
	        return Product.listAll();
	    }

	    public Uni<Product> getById(Long id) {
	        return Product.findById(id);
	    }

	    @WithTransaction
	    public Uni<Product> update(Long id, Product updated) {
	        return Product.<Product>findById(id)
	            .onItem().ifNull().failWith(
	                new NotFoundException("Product not found"))
	            .onItem().transform(p -> {
	                p.setName(updated.getName());
	                p.setQuantity(updated.getQuantity());
	                p.setPrice(updated.getPrice());
	                p.setSupplier(updated.getSupplier());
	                p.setDescription(updated.getDescription());
	                return p;
	            });
	    }

	    @WithTransaction
	    public Uni<Boolean> delete(Long id) {
	        return Product.deleteById(id);
	    }
}
