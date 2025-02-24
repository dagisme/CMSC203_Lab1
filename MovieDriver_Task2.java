
import java.util.Scanner;

public class MovieDriver_Task2 {

  public static void main(String[] args) {
		char tryAgain = 'y';
		Scanner scanner = new Scanner(System.in);
		
	while(tryAgain == 'y') {

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

        scanner.nextLine();
        
        System.out.println(movie.toString());
        System.out.println("Do you want to enter another? (y or n)");
        tryAgain = scanner.nextLine().charAt(0);

		}
        scanner.close();
		System.out.println("GoodBye");

    }

}
