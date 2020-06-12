package Calculator;

import java.util.Scanner;
import java.io.*;

public class Calculator{
	public static void main(String [] args) throws IOException{
		Scanner input = new Scanner(System.in);
		PrintWriter output = new PrintWriter("Calculator.txt");
		
		char operation;// Used to choose operation
		double num1 = 0;
		double num2 = 0;
		
		output.println("Operation log");
		output.println("=============================\n");
		
		prompt();// Gives the menu section with the operations
		
		operation = input.next().charAt(0);; // Gets filled in by the keyboard
		
		do {
			switch(operation) {
			
				case '+': 
					System.out.println("Operation: Addition\n");
					addition(num1, num2, input, output);
					break;
					
				case '-': 
					System.out.println("Operation: Subtraction\n");
					subtraction(num1, num2, input, output);
					break;
					
				case '*': 
					System.out.println("Operation: Multiplication\n");
					multiplication(num1, num2, input, output);
					break;
					
				case '/': 
					System.out.println("Operation: Division\n");
					division(num1, num2, input, output);
					break;
					
				case '%': 
					System.out.println("Operation: Remainder\n");
					module(num1, num2, input, output);
					break;
					
				case 'a': 
					System.out.println("Operation: Average\n");
					average(num1, num2, input, output);
					break;
					
				case 'x': 
					System.out.println("Operation: Maximum\n");
					maximum(num1, num2, input, output);
					break;
					
				case 'm': 
					System.out.println("Operation: Minimum\n");
					minimum(num1, num2, input, output);
					break;
					
				case 's':
					System.out.println("Operation: Square\n");
					square(num1, input, output);
					break;
					
				default: 
					output.println();
					output.println(operation + " is an invalid input");
					System.out.println("Invalid input");
						
			}// End of the switch loop
			
			System.out.println();
			System.out.println("Type in another operation again or Q to quit");
			prompt();
			operation = input.next().charAt(0);
		
		}while(operation != 'q');
		
		output.close();// Closing the PrintWriter output
	
	}// End of the main method
	
	public static void prompt() {
		
		System.out.println("+: Addition");
		System.out.println("-: Subtraction");
		System.out.println("*: Multiplication");
		System.out.println("/: Division");
		System.out.println("%: Module");
		System.out.println("A: For Finding average");
		System.out.println("X: representing the maximum of two numbers");
		System.out.println("M: representing the minimum of two numbers");
		System.out.println("S: representing the square of a number");
		System.out.println("Q: indicating the user wants to quit the program");
	
	}// End of the prompt method
	
	public static void addition(double num1, double num2, Scanner input, PrintWriter output) {
		double sum;
		
		System.out.println("Type in your first number:");
		num1 = input.nextDouble();
		
		System.out.println("Type in your second number");
		num2 = input.nextDouble();
		
		sum = num1 + num2;
		
		output.println("Operation: Addition");
		output.println("num1: " + num1);
		output.println("num2 " + num2);
		output.println("sum: " + sum);
		output.println();
	
	}// End of the addition method
	
	public static void subtraction(double num1, double num2, Scanner input, PrintWriter output) {
		double difference;
		
		System.out.println("Type the larger number first if you're looking for a positive number");
		System.out.println("Type in your first number:");
		num1 = input.nextDouble();
		
		System.out.println("Type in your second number");
		num2 = input.nextDouble();
		
		difference = num1 - num2;
		
		output.println("Operation: Subtraction");
		output.println("num1: " + num1);
		output.println("num2 " + num2);
		output.println("difference: " + difference);
		output.println();
	
	}// End of the subtraction method
	
	public static void multiplication(double num1, double num2, Scanner input, PrintWriter output) {
		double product;
		
		System.out.println("Type the larger number first if you're looking for a positive number");
		System.out.println("Type in your first number:");
		num1 = input.nextDouble();
		
		System.out.println("Type in your second number");
		num2 = input.nextDouble();
		
		product = num1 * num2;
		
		output.println("Operation: Multiplication");
		output.println("num1: " + num1);
		output.println("num2 " + num2);
		output.println("product: " + product);
		output.println();
		
	}// End of the subtraction method

	public static void division(double num1, double num2, Scanner input, PrintWriter output) {
		double quotient;
		
		System.out.println("If you want an answer > 1, put the larger number first");
		
		System.out.println("Type your first number");
		num1 = input.nextDouble();
		
		System.out.println("Type in your second number");
		num2 = input.nextDouble();
		
		quotient = num1/num2;
		
		output.println("Operation: Division");
		output.println("num1: " + num1);
		output.println("num2: " + num2);
		output.println("Quotient: " + quotient);
		output.println();
	
	}// End of the quotient method
	
	public static void module(double num1, double num2, Scanner input, PrintWriter output) {
		double remainder;
		
		System.out.println("Type the larger number first for better results");
		System.out.println("Type your first number");
		num1 = input.nextDouble();
		
		System.out.println("Type in your second number");
		num2 = input.nextDouble();
		
		remainder = num1 % num2;
		
		output.println("Operation: Remainder");
		output.println("num1: " + num1);
		output.println("num2: " + num2);
		output.println("Remainder: " + remainder);
		output.println();
	
	}// End of the quotient method
	
	public static void average(double num1, double num2, Scanner input, PrintWriter output) {
		double avg;
		
		System.out.println("Take your first number: ");
		num1 = input.nextDouble();
		
		System.out.println("Type your second number");
		num2 = input.nextDouble();
		
		avg = (num1 + num2)/2.0;
		
		output.println("Operation: Average");
		output.println("num1: " + num1);
		output.println("num2: " + num2);
		output.println("Average: " + avg);
		output.println();
	
	}// End of the average method
	
	public static void maximum(double num1, double num2, Scanner input, PrintWriter output) {
		double max;
		
		System.out.println("Maximum\n");
		
		System.out.println("Type your first number");
		num1 = input.nextDouble();
		
		System.out.println("Type your second number");
		num2 = input.nextDouble();
		
		if (num1 > num2) {
			max = num1;
		} else {
			max = num2;
		}// End of the if-else statement
		
		output.println("Operation: Maximum");
		output.println("num1: " + num1);
		output.println("num2: " + num2);
		output.println("The maximum is: " + max);
		output.println();
	
	}// End of the maximum method
	
	public static void minimum(double num1, double num2, Scanner input, PrintWriter output) {
		double min;
		
		System.out.println("Type your first number");
		num1 = input.nextDouble();
		
		System.out.println("Type your second number");
		num2 = input.nextDouble();
		
		if (num1 < num2) {
			min = num2;
		} else {
			min = num1;
		}// End of the if-else statement
		
		output.println("Operation: Minimum");
		output.println("num1: " + num1);
		output.println("num2: " + num2);
		output.println("The minimum is: " + min);
		output.println();
	}// End of the minimum method
	
	public static void square(double num, Scanner input, PrintWriter output) {
		double sq;
		
		System.out.println("Type the number");
		num = input.nextDouble();
		
		sq = num * num;
		
		output.println("Operation: Square");
		output.println("num: " + num);
		output.println("The square is: " + sq);
		output.println();
	}// End of the minimum method
	
}// End of the Calculator class