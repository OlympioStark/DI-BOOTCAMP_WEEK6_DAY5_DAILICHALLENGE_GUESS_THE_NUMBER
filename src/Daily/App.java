package Daily;

import java.util.Random;
import java.util.Scanner;

public class App {
	
	public static void choicePlay(int number, int n) {
		System.out.println("Computer number is : " + n);
		
		if (number == n) {
			System.out.println("You are win");
		} else {
			System.out.println("You are lose");
		}
	}
	
	public static void main(String[] args) throws Exception {
		// Random number
		Random random = new Random();
		int n = random.nextInt(100);
		
		// User number choice
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your number : ");
		int number = scanner.nextInt();
		
		//Comparison execution
		choicePlay(number, n);
	}

}
