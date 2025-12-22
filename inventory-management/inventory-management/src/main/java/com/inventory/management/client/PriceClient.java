package com.inventory.management.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.inventory.management.dto.PriceResponse;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.PathParam;


@RegisterRestClient(configKey = "price-api")
@Path("/price")
public interface PriceClient {

    @GET
    @Path("/{productName}")
    Uni<PriceResponse> validatePrice(@PathParam("productName") String productName);
}
