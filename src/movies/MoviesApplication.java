package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();

        // command loop that will respond to that choice until it chooses to exit
        // 0. loop until the user chooses to exit (using an infinite loop)
        while (true) {
            // 1. display menu (use function when you identify something very specific and let that function deal with it not just using sout)
            printMenu();
            // 2. wait for the user to choose a menu option
            int choice = getUserChoice();
            private static int getUserChoice () {
                int choice = -1;
                while (choice < 0 || choice > 5) {
                    System.out.print("Enter your choice: ");
                    if (scanner.hasNextInt()) {
                        choice = scanner.nextInt();
                    } else {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // Clear the invalid input
                    }
                }
//                return choice;
            }

            // 3. validate the choice, if no good then go back to 1
            // 4. do the choice
            switch (choice) {
                case 0:
                    System.out.println("See ya!");
                    System.exit(0);
                    break;
                case 1:
                    // view all movies
                    viewAllMovies(movies);
                    System.out.println("View all movies");
                    break;
                case 2:
                    viewAllMoviesByCategory(movies, "animated");
//                    System.out.println("View all animated movies");
                    break;
                case 3:
                    viewAllMoviesByCategory(movies, "drama");
//                    System.out.println("View all drama movies");
                    break;
                case 4:
                    System.out.println("View all horror movies");
                    break;
                case 5:
                    System.out.println("View all scifi movies");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        private static void viewAllMovies (Movie[]movies){
            for (Movie movie : movies) {
                System.out.println(movie.getName() + " - " + movie.getCategory());
            }
        }

        private static void viewMoviesByCategory (Movie[]movies, String category){
            for (Movie movie : movies) {
                if (movie.getCategory().equalsIgnoreCase(category)) {
                    System.out.println(movie.getName());
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
        }
    }
}