

package com.inventory.management;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import io.quarkus.hibernate.reactive.panache.common.WithTransaction;
import io.smallrye.mutiny.Uni;

import jakarta.ws.rs.NotFoundException;

@Path("/entities")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MyEntityResource {

	@GET
    public Uni<List<MyEntity>> getAll() {
        return MyEntity.listAll();
    }

	@GET
	@Path("/{id}")
	public Uni<MyEntity> getById(@PathParam("id") Long id) {
	    return MyEntity.<MyEntity>findById(id)
	            .onItem().ifNull()
	            .failWith(() -> new NotFoundException("Entity not found"));
	}


    @POST
    public MyEntity create(MyEntity entity) {
        entity.persist();
        return entity;
    }

    @PUT
    @Path("/{id}")
    @WithTransaction
    public Uni<MyEntity> update(@PathParam("id") Long id, MyEntity updated) {
        return MyEntity.<MyEntity>findById(id)
            .onItem().ifNull()
            .failWith(() -> new NotFoundException("Entity not found"))
            .onItem().transform(entity -> {
                entity.name = updated.name;
                entity.persist(); // persist changes reactively
                return entity;
            });
    }

    @DELETE
    @Path("/{id}")
    @WithTransaction
    public Uni<Void> delete(@PathParam("id") Long id) {
        return MyEntity.<MyEntity>deleteById(id)
                .flatMap(deleted -> {
                    if (!deleted) {
                        return Uni.createFrom().failure(
                                new NotFoundException("Entity not found"));
                    }
                    return Uni.createFrom().voidItem();
                });
    }
}
