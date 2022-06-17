import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {

System.out.println("Welcome to C-Hop's Casino!!!");

List<Integer>winningTicketNumbers = new ArrayList();
//We used "Random" to tell the computer to generate Random numbers for the user.
Random random = new Random();
for (int i = 0; i<8; i++) {
	while (true) {
		int winningTicketNumber = random.nextInt(99) + 1;
		//By using .contain and .add you essentially tell the program hey if that number is not already generated on the ticket number then add it and keep going until we get 8 numbers.
		if (!winningTicketNumbers.contains(winningTicketNumber)) {
			winningTicketNumbers.add(winningTicketNumber);
	break;
			}
		}
	}
//In case you want to test the winning scenario then uncomment the statement below

//System.out.println(winningTicketNumbers);
System.out.println("Test Your luck and enter 8 numbers from between 1-99!!!");
Scanner scanner = new Scanner (System.in);

List<Integer> BuyersNumbers = new ArrayList<>();
for (int i = 0; i<8; i++) {
	System.out.println("Your current ticket is " + BuyersNumbers);
	System.out.println("Continue trying your luck!!");
	while (true){
		//a try catch was used in case the used inputs anything besides a number, it then send the message in the catch block.
		try {
	String numberString = scanner.nextLine();
	int number = Integer.parseInt(numberString);
	if (number >= 1 && number <= 99) {
	BuyersNumbers.add(number);
	break;
	}
	else { 
		System.out.println( number + " is not between 1 and 99. Refer back to kindergarten!!!");
		
	}
	}
		catch(NumberFormatException nfe) {
			System.out.println("That is not a number in any continent on Earth.");
		}
		
	}
}
	System.out.println("The winning lottery numbers are: " + winningTicketNumbers);
	System.out.println("Your numbers are: " + BuyersNumbers);
	
	//.retainAll was used to pull the matching numbers from the winning ticket and the users ticket
	BuyersNumbers.retainAll(winningTicketNumbers);
	System.out.println("The following numbers are a match: " + BuyersNumbers);
	
	if (BuyersNumbers.containsAll(winningTicketNumbers)) {
		System.out.println("Go to work and tell your boss you've quit. You have just won the lottery at C-Hop's casino!!!!");
		
	}
	
	else {
		System.out.println("You lost, I guess your job will be seeing you at work tommorow.");
	}
	scanner.close();
	}

}
