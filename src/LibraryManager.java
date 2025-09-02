import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    ArrayList<String> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public LibraryManager() {
        books.add("Java Programming");
        books.add("Web Development");
        books.add("Database Design");
    }

    public void showBooks() {
        try {
            System.out.println("\n--- Current Books ---");
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Display operation completed.\n");
        }
    }

    public void addBook() {
        try {
            System.out.print("Enter book title to add: ");
            String title = scanner.nextLine();

            if (title == null || title.equals("")) {
                throw new IllegalArgumentException("Book title cannot be empty!");
            }
            if (title.length() < 3) {
                throw new IllegalArgumentException("Book title must be at least 3 characters long!");
            }

            books.add(title);
            System.out.println("Book '" + title + "' added successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Add book operation completed.\n");
        }
    }

    public void removeBook() {
        try {
            System.out.print("Enter book number to remove (1-" + books.size() + "): ");
            String input = scanner.nextLine();

            int index = Integer.parseInt(input);

            if (index < 1 || index > books.size()) {
                throw new IndexOutOfBoundsException("Invalid book number! Please enter between 1 and " + books.size() + ".");
            }

            String removed = books.remove(index - 1);
            System.out.println("Book '" + removed + "' removed successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Remove book operation completed.\n");
        }
    }
}

