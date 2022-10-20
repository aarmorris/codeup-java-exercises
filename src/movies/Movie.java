package movies;

public class Movie {
    private String name;
    private String category;

    // Getter name
    public String getName() {
        return name;
    }

    // Setter name
    public void setName(String name) {
        this.name = name;
    }

    // Getter category
    public String getCategory() {
        return category;
    }

    // Setter category
    public void setCategory(String category) {
        this.category = category;
    }


    // Methods
    public static void getAllMovieFromCategory(String category, Movie[] movies) {    // we created this method so we dont have to be typing the same this on our switch statement
        for (Movie thisCouldBeAnything : movies) {
            String name = thisCouldBeAnything.getName();
            if (category.equals(thisCouldBeAnything.getCategory())) {
                System.out.printf("%s -- %s%n", name, category);
            }
        }
    }

    // Constructor


    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }
} // end of movie