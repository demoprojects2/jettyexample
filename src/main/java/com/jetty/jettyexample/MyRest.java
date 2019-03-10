package com.jetty.jettyexample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/rest")
public class MyRest {

    @GET
    @Path("rest2")
    public Response index() {
        return Response.ok("hi").build();
    }
}
