import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // your code here
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        while(true){
            //int i = 0;
            System.out.println("Select 1: to add a book or Select 2: to look up an existing book");
            String user = scanner.nextLine();
            if(Objects.equals(user, "1")){
                //call method to add book
                System.out.println("Enter title: ");
                String title = scanner.nextLine();
                System.out.println("Enter genre; ");
                String genre = scanner.nextLine();
                System.out.println("Enter number of pages; ");
                String numOfPages = scanner.nextLine();
                Book bookFromUser = new Book(title,genre,numOfPages);
                library.addBook(bookFromUser);
            }else{
                //call method to look book
                System.out.println("Enter title: ");
                String title = scanner.nextLine();
                System.out.println("Your book is " + library.getBook(title));
            }
            System.out.println("Do you want to continue: Y or N");
            String user1 = scanner.nextLine();
            if(Objects.equals(user1, "N"))
            break;
            }

}//close main method

}//close main class
