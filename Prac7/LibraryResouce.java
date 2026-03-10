package com.library;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("books")

public class LibraryResource {
    private static List<Book> library = new ArrayList<>();
    
    static{
        library.add(new Book(1,"Learn Java", "Devansh", "1111"));
        library.add(new Book(2,"Learn C++", "Dhroov", "2222"));
    }
    
@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Book> getBooks(){
    return library;
}

@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public Response addBook(Book b){
    library.add(b);
    return Response.status(Response.Status.CREATED).entity(b).build();
}
}
