package com.inventory.management.controller;

import java.util.List;

import com.inventory.management.entity.Product;
import com.inventory.management.service.ProductService;

import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/products")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProductController {

    @Inject
    ProductService service;

    @POST
    public Uni<Response> create(Product product) {
        return service.create(product)
            .map(p -> Response.status(Response.Status.CREATED).entity(p).build());
    }

    @GET
    public Uni<List<Product>> getAll() {
        return service.getAll();
    }

    @GET
    @Path("/{id}")
    public Uni<Product> getById(@PathParam("id") Long id) {
        return service.getById(id);
    }

    @PUT
    @Path("/{id}")
    public Uni<Product> update(@PathParam("id") Long id, Product product) {
        return service.update(id, product);
    }

    @DELETE
    @Path("/{id}")
    public Uni<Response> delete(@PathParam("id") Long id) {
        return service.delete(id)
            .map(r -> Response.noContent().build());
    }
}
