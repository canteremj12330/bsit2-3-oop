import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Borrowable> items;

    public LibraryManager() {
        this.items = new ArrayList<>();
    }

    public void addItem(Borrowable item) {
        items.add(item);
    }

    public void displayAllItems() {
        for (Borrowable b : items) {
            LibraryItem li = (LibraryItem) b;
            System.out.println(li.getItemInfo() + " (" + b.getBorrowingStatus() + ")");
        }
    }

    public boolean borrowItem(String itemId, String borrowerName) {
        for (Borrowable b : items) {
            LibraryItem li = (LibraryItem) b;
            if (li.itemId.equals(itemId)) {
                if (!b.isAvailable()) return false;
                b.borrowItem(borrowerName);
                return true;
            }
        }
        return false;
    }

    public boolean returnItem(String itemId) {
        for (Borrowable b : items) {
            LibraryItem li = (LibraryItem) b;
            if (li.itemId.equals(itemId)) {
                if (b.isAvailable()) return false;
                b.returnItem();
                return true;
            }
        }
        return false;
    }

    public void displayAvailableItems() {
        for (Borrowable b : items) {
            if (b.isAvailable()) {
                LibraryItem li = (LibraryItem) b;
                System.out.println(li.getItemInfo() + " (" + b.getBorrowingStatus() + ")");
            }
        }
    }

    public double calculateTotalLateFees(int daysLate) {
        double total = 0.0;
        for (Borrowable b : items) {
            LibraryItem li = (LibraryItem) b;
            total += li.calculateLateFee(daysLate);
        }
        return total;
    }
}
