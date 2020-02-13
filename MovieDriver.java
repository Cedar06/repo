import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Movie m = new Movie();
		String title = "";
		String rating = "";
		int tickets = 0;
		String cont = "y";
		
		while(cont.equals("y")) {
		System.out.println("Enter the title of the movie: ");
		title = in.nextLine();
		m.setTitle(title);
		System.out.println("Enter the movie's rating: ");
		rating = in.nextLine();
		m.setRating(rating);
		System.out.println("Enter the number of tickets sold: ");
		tickets = in.nextInt();
		m.setSoldTickets(tickets);
		
		System.out.println(m.toString());
		in.nextLine();
		
		System.out.println("Do you want to enter another? (y/n): ");
		cont = in.nextLine();
		}


	}

}

//Create a new object of type Scanner that reads from the keyboard
//Create a new movie object
//Prompt the user to enter the title of a movie 
//Read in the line that the user types
//Set the title in the movie object
//Prompt the user to enter the movie’s rating
//Read in the line that the user types
//Set the rating in the movie object
//Prompt the user to enter the number of tickets sold at a (unnamed) theater
//Read in the integer that the user types
//Set the number of tickets sold in the movie object
//Print out the information using the movie’s toString method
