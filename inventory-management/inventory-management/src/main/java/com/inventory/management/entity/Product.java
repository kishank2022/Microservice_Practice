package com.inventory.management.entity;

import java.math.BigDecimal;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product extends PanacheEntity{

	@Column(nullable = false)
    private String name;

	private String description;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private BigDecimal price;

    private String supplier;

	public Product(String name, String description, Integer quantity, BigDecimal price, String supplier) {
		super();
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.supplier = supplier;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
    
	
}
