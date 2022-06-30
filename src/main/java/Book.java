public class Book {
     // instance fields
     private String title;
     private String genre;
     private String numOfPages;
 
     //constructor method
     public Book(String bookName, String typeGenre, String numofBookPages){
         this.title = bookName;
         this.genre = typeGenre;
         this.numOfPages = numofBookPages;
     }//close constructor

     public String getTitle (){
            return this.title;
     }


    @Override
    public String toString() {
        return "Book [genre=" + genre + ", numOfPages=" + numOfPages + ", title=" + title + "]";
    }
 
     
 
    
}
