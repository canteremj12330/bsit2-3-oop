
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("2025 Kings", "Martin Luther King Jr.", 298);
        Book book2 = new Book("Lebron James", "NBA", 523);
        Book book3 = new Book("MessiRonaldo", "Soccer", 180);

        System.out.println();

        book1.displayInfo();
        book2.borrowBook();
        book2.displayInfo();
        book3.returnBook();
        book3.displayInfo();
    }
}
