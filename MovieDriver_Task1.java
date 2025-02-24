
import java.util.Scanner;

public class MovieDriver_Task1 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        Movie movie = new Movie();

        System.out.println("Enter the name of the movie ");
        String name = scanner.nextLine();
        
        movie.setTitle(name);

        System.out.println("Enter the rating of the movie ");
        String rating = scanner.nextLine();
        
        movie.setRating(rating);

        System.out.println("Enter the number of tickets sold for this movie ");
        int soldTickets = scanner.nextInt();
        movie.setSoldTickets(soldTickets);

        System.out.println(movie.toString());
        System.out.print("Goodbye");

        scanner.close();
    }

}
