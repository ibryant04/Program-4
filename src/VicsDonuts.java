import java.util.Scanner;

public class VicsDonuts {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double Plain = 0.33;
		double Chocolate = 0.50;
		double Cake = 0.45;
		int selection;
		int amount;
		
		do {
		System.out.println("1) plain (0.33)/ea or 3.75/dozen");
		System.out.println("2) chocolate (0.50/ea or 5.50/dozen");
		System.out.println("3) cake (0.45/ea or 5.25/dozen");
		System.out.println("4) exit");
		
		System.out.print("Please make your selection: ");
			selection = scnr.nextInt();
		System.out.print("Enter amount: ");
			amount = scnr.nextInt();	
		
		} while (selection < 5); 
			
		}
		
		
		
	}

