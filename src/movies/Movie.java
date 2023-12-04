package movies;

public class Movie {
    // Set private fields for name and category
    private String name;
    private String category;

    // Create constructor for both name and category
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // Create methods to access these properties and change them (getters and setters)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
