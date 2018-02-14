package com.iqmsoft.resource;

import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.iqmsoft.model.Greeting;

@Path("/hello-wildflydocker")
@Stateless
public class TestResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response doGet() {

        final Greeting greeting = new Greeting();
        greeting.setMessage("Hello from WildFly Swarm!");

        return Response.ok(greeting).build();
    }

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response doPost(final String name) {

        final Greeting greeting = new Greeting();
        greeting.setMessage(String.format("Hello %s from WildFly Swarm!", name));

        return Response.ok(greeting).build();
    }
}