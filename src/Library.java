public class Library {
    private final Book[] books;
    private int bookCount;

    public Library() {
        books = new Book[10];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added: " + book.getTitle() + " by " + book.getAuthor());
            return;
        }
        System.out.println("Library is full. Cannot add more books.");
    }

    public Book findBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }

    public void borrowBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            if (book.borrowBook()) {
                System.out.println("Book borrowed successfully!");
            } else {
                System.out.println("Book is not available for borrowing.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }

    public void returnBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            if (book.returnBook()) {
                System.out.println("Book returned successfully!");
            } else {
                System.out.println("Book was not borrowed.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }

    public void displayAvailableBooks() {
        System.out.println("\nAvailable books:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                books[i].displayBookInfo();
            }
        }
    }

    public void displayAllBooks() {
        System.out.println("\nAll books in Library:");
        for (int i = 0; i < bookCount; i++) {
            books[i].displayBookInfo();
        }
    }

}
