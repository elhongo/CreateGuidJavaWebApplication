package com.elhongo.rest;

import java.util.UUID;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author elhongo
 */
@Path("guid")
public class GuidResource {

    @Context
    private UriInfo context;

    public GuidResource() {
    }
    
    @GET
    @Produces("application/json")
    public String getJson() {
        return UUID.randomUUID().toString();
    }
}
