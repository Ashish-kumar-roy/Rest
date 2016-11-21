package org.koushik.javabrains.messenger;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.koushik.javabrains.messenger.model.Message;
import org.koushik.javabrains.messenger.service.MessageService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

   MessageService messageService=new MessageService();
   
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getIt() {
        return messageService.getAllMessages();
    }
}
