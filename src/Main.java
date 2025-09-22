public class Main {
    public static void main(String[] args) {
        // Create Library
        Library library = new Library();

        // Create Books
        Book b1 = new Book("Java Programming", "John Smith", "1234567890", 2020);
        Book b2 = new Book("Data Structures", "Jane Doe", "9876543210", 2019);
        Book b3 = new Book("Web Development", "Mike Johnson", "5555666677777", 2021);


        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);


        library.displayAllBooks();


        System.out.println("\nBorrowing Java Programming...");
        library.borrowBook("1234567890");


        System.out.println("\nTrying to borrow Java Programming again...");
        library.borrowBook("1234567890");


        library.displayAvailableBooks();


        System.out.println("\nReturning Java Programming...");
        library.returnBook("1234567890");


        library.displayAvailableBooks();


        try {
            Book invalidBook = new Book("Bad Book", "No One", "123", 3000);
            library.addBook(invalidBook);
        } catch (IllegalArgumentException e) {
            System.out.println("\nTesting validation...");
            System.out.println(e.getMessage());
        }
    }
}
