/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowerUpper;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author devan
 */
@Path("lowerupper")
public class LowerUpper {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of LowerUpper
     */
    public LowerUpper() {
    }

    /**
     * Retrieves representation of an instance of lowerUpper.LowerUpper
     * @return an instance of java.lang.String
     */
    @GET
    @Path("lower")
    @Produces("text/plain")
    public String toLowerCase(@QueryParam("lower")String text){
        return text.toLowerCase();
    }
    
    @GET
    @Path("upper")
    @Produces("text/plain")
    public String toUpperCase(@QueryParam("upper")String text){
        return text.toUpperCase();
    }

    /**
     * PUT method for updating or creating an instance of LowerUpper
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/plain")
    public void putText(String content) {
    }
}
