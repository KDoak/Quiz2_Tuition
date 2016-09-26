import java.util.Scanner;

public class Tuition {
//Created by Kevin Doak for Quiz 2.
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		//Taking input on starting tuition and interest rate.
		System.out.println("Please input your initial tuition cost during freshman year.");
		double tuition = input.nextDouble();
		
		System.out.println("Please input the yearly intrest rate on your tuition. (EX: 3.1% = 3.1)"); 
		//EX: 3.1 for %3.1 percent interest. Interest does not apply to first freshman year.
		double RATE = (input.nextDouble()/100)+1;
		input.close();
		double tuitionSum = tuition;
		//Applies building interest to the next three years and adds it with initial tuition for a final sum.
		for(int x=1; x <= 3; x++){
			tuition = tuition * (Math.pow(RATE, x));
			tuitionSum += tuition;
		}
		System.out.printf("The total tuition for a standard four year degree would be: $%.2f", tuitionSum);
	}

}
