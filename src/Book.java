    private final String title;
    private final String author;
    private int averageRating;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        averageRating = 0;
    }

    public void displayInfo() {
        String ratingLevel = getRatingLevel();
        System.out.println("Book: " + title + " by " + author + ", Average Rating: " + averageRating + ", Level: " + ratingLevel);
    }

    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            averageRating = rating;
            System.out.println("Rating " + rating + " added successfully");
        } else {
            System.out.println("Error: Invalid rating: must be 1-5 stars");
        }
    }

    private String getRatingLevel() {
        if (averageRating >= 4) {
            return "Good";
        } else if (averageRating >= 3) {
            return "Average";
        } else {
            return "Poor";
        }
    }
}
