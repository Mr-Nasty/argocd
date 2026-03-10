package com.example;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 */
@Path("microservice")
public class MicroService {

    @Context
    private UriInfo context;

    public MicroService() {
    }

    // Base endpoint
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Jax-RS Microservice - DockerReady";
    }

    // Status endpoint
    @GET
    @Path("status")
    @Produces(MediaType.APPLICATION_JSON)
    public String status() {
        return "{\"status\":\"healthy\",\"service\":\"microservice\"}";
    }

    // PUT method
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public void putText(String content) {
    }
}
