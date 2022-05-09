import java.util.ArrayList;
import java.util.Scanner;

public class MovieList {
    static ArrayList<Movie> movies = new ArrayList<>() {{
        add(new Movie("Tangled", "animated"));
        add(new Movie("Frozen", "animated"));
        add(new Movie("Dune", "drama"));
        add(new Movie("The Godfather", "drama"));
        add(new Movie("The Mummy", "horror"));
        add(new Movie("The Conjuring", "horror"));
        add(new Movie("A Quiet Place", "horror"));
        add(new Movie("Avatar", "scifi"));
        add(new Movie("Inception", "scifi"));
        add(new Movie("The Matrix", "scifi"));
    }};
 
    public static void main(String[] args) {
        System.out.println("Welcome to the Movie List Application\n");
        System.out.println("There are " + movies.size() + " movies in this list");
        Scanner sc = new Scanner(System.in);
        boolean shouldContinue = true;
 
        while (shouldContinue) {
            System.out.println("What category are you interested in?");
            String category = sc.nextLine();
            if (category.equals("animated") || category.equals("drama") || category.equals("horror") || category.equals("scifi")) {
                for(Movie movie : movies) {
                    if(movie.getCategory().equals(category)) {
                        System.out.println(movie.getTitle());
                    }
                }
            } else {
                System.out.println("Invalid Category!!!");
                continue;
            }
 
            System.out.println("");
 
 
            while(true) {
                System.out.println("Continue?(y/n)");
                String choice = sc.nextLine().toLowerCase();
 
                if (choice.equals("y") || choice.equals("n")) {
                    if (choice.equals("n")) shouldContinue = false;
                    break;
                } else {
                    System.out.println("Invalid Input!!!");
                }
 
            }
 
        }
 
    }
}