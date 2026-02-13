
import java.util.ArrayList;
import java.util.Scanner;

// 2. Main Program — LibraryManager.java
public class LibraryManager {

    // Use an ArrayList to store multiple Book objects
    ArrayList<Book> library = new ArrayList<>();
    
    // add books to the library
    public static void addBook(Scanner scanner) {
        String title = "";
        String author = "";
        String isbn = "";
        boolean available = false;
        String availableInput = "";

        System.out.println("Enter book title:");
        title = scanner.nextLine();
        while (title == null || title.isEmpty()) {
            System.out.println("Title cannot be empty. Enter book title:");
            title = scanner.nextLine();
        }

        System.out.println("Enter book author:");
        author = scanner.nextLine();
        while (author == null || author.isEmpty()) {
            System.out.println("Author cannot be empty. Enter book author:");
            author = scanner.nextLine();
        }
    
        System.out.println("Enter book ISBN:");
        isbn = scanner.nextLine();
        while (isbn == null || (isbn.length() != 10 && isbn.length() != 13)) {
            System.out.println("ISBN must be 10 or 13 characters. Enter book ISBN:");
            isbn = scanner.nextLine();
        }
        System.out.println("Is the book available? (true/false):");
        availableInput = scanner.nextLine();
        while (!availableInput.equalsIgnoreCase("true") && !availableInput.equalsIgnoreCase("false")) {
            System.out.println("Enter either true or false. Is the book available? (true/false):");
            availableInput = scanner.nextLine();
        }
        if (availableInput.equalsIgnoreCase("true")) {
            available = true;
        }
    }
    // Provide a menu-driven interface for the user:
    
    public static void libraryDisplay(Scanner scanner) {
        // 1.  Add a new book
        
        
    }

    

    

}
// public static void main(String[] args) {
    // private boolean running = true;

// while (running == true) {
//         // Display menu and handle user input
//     }

// }


// 2. Display all books

// 3. Display all available books

// 4. Search books by author

// 5. Check out a book (set available to false)

// 6. Return a book (set available to true)

// 7. Exit

// 3. Menu Functionality (Control & Iteration)

// Use loops to continuously show the menu until the user chooses Exit
// Use if-else or switch to handle menu options
// Validate all user input using loops and conditionals
// 4. Additional Features (Arrays & ArrayLists)

// When displaying books, show the count of available vs checked-out books
// Optional: Sort the ArrayList by title before displaying


