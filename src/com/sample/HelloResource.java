package com.sample;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloResource {

	@GET
	@Produces("application/json")
	public Employee sample() {
		return new Employee(9999, "sample", "sales", new Date(), 500, 10);
	}

}
