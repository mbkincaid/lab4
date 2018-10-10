import java.util.Scanner;

public class october_10 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int i;
		int userNum;
		int numSquared;
		int numCubed;
		String userContinue;
		String spaces1 = "    ";
		String spaces2 = "  ";
		
		do {
			System.out.println("Please enter a number 1 through 9.");
			userNum = scnr.nextInt();
			
			System.out.println("Num  Sq   Cubed");
			
			for (i = 1; i <= userNum; i++) {
			numSquared = i * i;
			numCubed = i * i * i;
			if (numSquared < 10) {
				spaces2 = "    ";
			}
			else if (numSquared < 100) {
				spaces2 = "   ";
			}
			
			System.out.println(i + spaces1 + numSquared + spaces2 + numCubed);
		}
			System.out.println("Do you want to continue?");
			userContinue = scnr.next();
	
		} while (userContinue.equals("yes")); 
	}
}
