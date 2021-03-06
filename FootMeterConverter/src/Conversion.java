
/*
* Class: CMSC201
* Instructor: Monshi
* Description: this program practices using method calls in order to convert feet to meters or meters to feet
* Due: 02/27/2016
* I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
 Brandon Tennyson
*/

import java.util.Scanner;
/**
 * 
 * this method shows the options and reads an input and returns it
 *
 */
public class Conversion {

	public static int showOption() { //method that shows output for options
		Scanner input = new Scanner(System.in);

		System.out.println("choose an option:");
		System.out.println("1. Convert meter to foot");
		System.out.println("2. Convert foot to meeter");
		System.out.println("3. Exit");

		int a = input.nextInt(); //get users answer

		return a; // return answer
	}

	/*
	 * this method converts meters to feet
	 */
	public static double meterToFoot(double meter) {
		double f = meter * 3.279; // convert meters to feet

		return f; // return the value
	}
	/*
	 * this method converts feet to meters
	 */
	public static double footToMeter(double foot) {
		double m = foot * 0.305; // convert feet to meters

		return m; // return the value
	}

	public static void main(String[] args) { // start of program

		Scanner input = new Scanner(System.in);

		// Initialization
		
		double foot;
		double meter;
		
		//user choice is returned as a value into the variable answer
		int answer = showOption();

		
		if (answer <= 3 && answer >= 1) { // for all valid choices
			// if user chooses 1 do a method call to meterToFoot and return the value and display it
			if (answer == 1) {
				System.out.println("Enter a value");
				meter = input.nextDouble(); // prompt user to enter meters value
				foot = meterToFoot(meter); //pass the value to the method and return the converted value
				System.out.println(meter + " meter is " + foot + "foot");
			} else {
				// if user chooses 2 do a method call to footToMeter and return the value and display it
				if (answer == 2) {
					System.out.println("Enter a value");
					foot = input.nextDouble();// prompt user to enter meters value
					meter = footToMeter(foot);//pass the value to the method and return the converted value
					System.out.println(foot + " foot is " + meter + " meter");

				} else { // if user chooses to end the program, say bye
					if (answer == 3) {
						System.out.println("BYE!");

					}
				}
			}
		} else { // for invalid choices
			System.out.println("that is an invalid choice");
		}

	}

}
