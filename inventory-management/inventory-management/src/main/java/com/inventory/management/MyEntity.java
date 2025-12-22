package com.inventory.management;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class MyEntity extends PanacheEntity {
    public String name;
}