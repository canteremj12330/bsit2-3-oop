public class Book {
    String title;
    String author;
    int pages;
    boolean isAvailable;

    public Book(String bookTitle, String bookAuthor, int bookPages) {
        title = bookTitle;
        author = bookAuthor;
        pages = bookPages;
        isAvailable = true;
        System.out.println("A new book" + title + "by" + author + " has been added to the library!");
    }

    public void displayInfo() {
        System.out.println("Book Info");
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Pages     : " + pages);
        System.out.println("Available : " + (isAvailable ? "Yes" : "No"));
        System.out.println("________________________________");
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book Borrowed");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Book Returned");
    }
}