package com.mycompany.libraryrest.resource;

import com.mycompany.libraryrest.db.BookDAO;
import com.mycompany.libraryrest.model.Book;
import com.mycompany.libraryrest.model.Book;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookResource {

    @GET
    public List<Book> getAllBooks() {
        return BookDAO.getAllBooks();
    }

    @GET
    @Path("/{id}")
    public Book getBookById(@PathParam("id") long id) {
        return BookDAO.getBookById(id);
    }

    @POST
    public Book addBook(Book book) {
        BookDAO.addBook(book);
        return book;
    }

    @DELETE
    @Path("/{id}")
    public String deleteBook(@PathParam("id") long id) {
        BookDAO.deleteBook(id);
        return "Book deleted";
    }
}
