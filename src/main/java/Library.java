
//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;

public class Library {
    // library class to simply hold books

    HashMap<String, Book> library = new HashMap<String, Book>();
    // add book to collection

    public void addBook(Book bookToAdd) {
        // add to library
        library.put(bookToAdd.getTitle(), bookToAdd);
    }

    
    public Book getBook(String searchedForTitle) {
        //remove from library
        return library.get(searchedForTitle);
        
    }



}
