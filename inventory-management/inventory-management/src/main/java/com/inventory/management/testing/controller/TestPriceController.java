package com.inventory.management.testing.controller;

import java.math.BigDecimal;
import java.util.Set;

import com.inventory.management.dto.PriceResponse;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/price")
public class TestPriceController {

    @GET
    @Path("/{name}")
    public PriceResponse mock(@PathParam("name") String name) {
        PriceResponse res = new PriceResponse();
        res.setValid(false);
        res.setSuggestedPrice(BigDecimal.valueOf(1000));
        return res;
    }
}