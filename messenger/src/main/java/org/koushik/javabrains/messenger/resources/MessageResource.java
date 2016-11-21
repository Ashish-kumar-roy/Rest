package org.koushik.javabrains.messenger.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;



@Path("/messages")
public class MessageResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessages(){
		
		return "Hello World!";
	}

}
