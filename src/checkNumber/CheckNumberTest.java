package checkNumber;

public class CheckNumberTest {
	public static void main(String args[]) {
		System.out.println("Please input a number you would like the characteristics of to be checked.");
		double targetNumber = Keyboard.getInteger(); //the number that is checked
		CheckNumber test1 = new CheckNumber(); //test object used to test class
		System.out.println("The number " + targetNumber + " is " + ((test1.isPrime(targetNumber) == true) ? "" : "not ") + "a prime number.");
		System.out.println("The number " + targetNumber + " is " + ((test1.isPositive(targetNumber) == true) ? "" : "not ") + "a positive number.");
		System.out.println("The number " + targetNumber + " is " + ((test1.isNegative(targetNumber) == true) ? "" : "not ") + "a negative number.");
		System.out.println("The number " + targetNumber + " is " + ((test1.ispalindrome(targetNumber) == true) ? "" : "not ") + "a palindrome.");
		System.out.println(test1.displayNumberChararacteristics(targetNumber));
	}
}