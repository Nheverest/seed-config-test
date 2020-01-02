package org.nheverest.config.interfaces.rest;

import org.seedstack.seed.Configuration;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class HelloResource {
    @GET
    public String hello() {
        return "Hello " + conf.getFirstName() + " " + conf2.getLastName() + "!";
    }

    @Configuration
    private ConfigOne conf;

    @Configuration
    private ConfigTwo conf2;
}
