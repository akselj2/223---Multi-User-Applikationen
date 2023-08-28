package main.java.org.acme;

import javax.annotation.processing.Generated;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/calculator")
public class CalculatorResource {

    @Path("/add/{val1}/{val2}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String calculate(int val1, int val2) {
        int result = val1 + val2;
        return val1 + " and " + val2 + " = " + result;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello2() {
        return "Hello, you forgot to include 2 values in the URL. Try: localhost:8080/calculator/add/x/y";
    }
}
