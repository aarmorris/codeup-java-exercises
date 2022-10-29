package movies;
import util.InputMoreBetter;


public class MoviesApplication {
    public static void main(String[] args) {
        InputMoreBetter input = new InputMoreBetter();

        Movie[] movies = MoviesArray.findAll();    // This will assign all the movies to the variable
        String userChoice = "timmmmmeh"; // We put timmehh because if  can equal to anything
        while (!userChoice.equals("0")){   // while the user choice does not equal to 0 it can do any of the options
            System.out.println("What would you like to do");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("6 - add a movie to the list");

            userChoice = input.getString("Enter your choice:");

            switch (userChoice){
                case "0":
                    //do this
                case "1":
                    for (Movie thisCouldBeAnything : movies){
                        String name = thisCouldBeAnything.getName();
                        String category = thisCouldBeAnything.getCategory();
                        System.out.printf("%s -- %s%n", name, category);
                    }
                    break;
                case "2":
                    for (Movie thisCouldBeAnything : movies){           // We created the getAllMovieFromCategory so we dont have to do this for loop on each case
                        String category = thisCouldBeAnything.getCategory();
                        String name = thisCouldBeAnything.getName();
                        if (category.equals("animated")){
                            System.out.printf("%s -- %s%n", name, category);
                        }
                    }
                    break;
                case "3":
                    Movie.getAllMovieFromCategory("drama", movies);
                    break;
                case "4":
                    Movie.getAllMovieFromCategory("horror", movies);

                    break;
                case "5":
                    Movie.getAllMovieFromCategory("scifi", movies);

                    break;
                case "6":
                    Movie.getAllMovieFromCategory("drama", movies);

                    break;
                default:
                    System.out.println("BE MORE SMARTER! FOLLOW DIRECTONS");
            }

        }





    } // end of main
} // end of movieapp