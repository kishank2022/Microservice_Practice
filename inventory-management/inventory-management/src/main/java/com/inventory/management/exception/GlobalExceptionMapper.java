package com.inventory.management.exception;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class GlobalExceptionMapper implements ExceptionMapper<ExternalServiceException> {

    @Override
    public Response toResponse(ExternalServiceException e) {
        return Response.status(503)
                .entity(e.getMessage())
                .build();
    }
}
