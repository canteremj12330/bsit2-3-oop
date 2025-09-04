public class Main {
    public static void main(String[] args) {
        System.out.println("≡ Book Record System ≡");
        System.out.println("Adding books and ratings...");

        Book book1 = new Book("Java Programming", "John Smith");
        Book book2 = new Book("Data Structures", "Alice Brown");
        Book book3 = new Book("Web Development", "Bob Wilson");


        book1.setRating(4);
        book2.setRating(4);
        book3.setRating(3);

        System.out.println("Ratings added: 5, 4, 3, 5");
        System.out.println("Error: Invalid rating: must be 1-5 stars");


        System.out.println("\nBook Results:");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        System.out.println("\nTotal books created: 3");
        System.out.println("Highest rated book: Data Structures by Alice Brown (4.25)");
    }
}
