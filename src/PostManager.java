import java.util.*;

public class PostManager {

    int calculateEngagement(int... interactions) {
        if (interactions.length == 0) {
            return 0;
        }
        int total = 0;
        for (int i : interactions) {
            total += i;
        }
        return total;
    }

    String getCategoryRating(int score) {
        if (score >= 1000) return "Viral";
        if (score >= 500) return "Popular";
        if (score >= 100) return "Good";
        if (score >= 50) return "Low";
        return "Poor";
    }

    void displayPostStats(int score, String category) {
        System.out.println("Post: " + "Java Programming Tips");
        System.out.println("Engagement Score: " + score);
        System.out.println("Category: " + category);
    }

    ArrayList<String> manageHashtags(String[] hashtags) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5 && i < hashtags.length; i++) {
            if (!list.contains(hashtags[i])) {
                list.add(hashtags[i]);
            }
        }
        return list;
    }

    LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> scores) {
        LinkedList<String> trending = new LinkedList<>();
        for (String p : posts) {
            if (scores.get(p) > 500) {
                trending.add(p);
            }
        }
        return trending;
    }

    LinkedHashSet<String> getUniqueAuthors(String... authors) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (String a : authors) {
            set.add(a);
        }
        return set;
    }

    public static void main(String[] args) {
        PostManager pm = new PostManager();

        int score = pm.calculateEngagement(150, 75, 25);
        String category = pm.getCategoryRating(score);

        System.out.println("━━━ Social Media Post Manager ━━━");
        pm.displayPostStats(score, category);
        System.out.println();

        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = pm.manageHashtags(hashtags);

        ArrayList<String> posts = new ArrayList<>();
        posts.add("Java Programming Tips");
        posts.add("Advanced Java Tutorial");
        posts.add("Spring Boot Guide");

        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Java Programming Tips", score);
        scores.put("Advanced Java Tutorial", 1200);
        scores.put("Spring Boot Guide", 800);

        LinkedList<String> trending = pm.findTrendingPosts(posts, scores);
        LinkedHashSet<String> authors = pm.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");

        System.out.println("Unique Hashtags: " + uniqueHashtags);
        System.out.println("Trending Posts: " + trending);
        System.out.println("Unique Authors: " + authors);
    }
}

