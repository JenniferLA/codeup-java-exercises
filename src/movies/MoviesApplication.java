package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
//    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();

        // command loop that will respond to that choice until it chooses to exit
        // 0. loop until the user chooses to exit (using an infinite loop)
        while (true) {
            // 1. display menu (use function when you identify something very specific and let that function deal with it not just using sout)
            printMenu();
            // 2. wait for the user to choose a menu option
            int choice = input.getInt(0, 5, "Enter your choice: ");
            if (choice == 0) {
                break;
            }
//                return choice;
            doMenuChoice(choice, movies);
        }
        System.out.println("See you later!");
    }


            // 3. validate the choice, if no good then go back to 1
            // 4. do the choice
    private static void doMenuChoice(int choice, Movie[] movies) {
            switch (choice) {
                case 1 -> viewAllMovies(movies);
                case 2 -> viewMoviesByCategory(movies, "animated");
                case 3 -> viewMoviesByCategory(movies, "drama");
                case 4 -> viewMoviesByCategory(movies, "horror");
                case 5 -> viewMoviesByCategory(movies, "scifi");
            }
        }

        private static void viewAllMovies (Movie[] movies){
            viewMoviesByCategory(movies, "all");
        }

        private static void viewMoviesByCategory (Movie[]movies, String category) {
            for (Movie movie : movies) {
                if (category.equalsIgnoreCase("all") ||
                        movie.getCategory().equalsIgnoreCase(category)) {
                    System.out.println(movie.toPrettyString());
                }
            }
            System.out.println();
        }

                private static void printMenu () {
                    System.out.println("What would you like to do?\n" +
                            "\n" +
                            " 0 - exit\n" +
                            " 1 - view all movies\n" +
                            " 2 - view movies in the animated category\n" +
                            " 3 - view movies in the drama category\n" +
                            " 4 - view movies in the horror category\n" +
                            " 5 - view movies in the scifi category\n");
                }

            }
