package checkNumber;

/**
 * Group of checks that can be used to determine characteristics of a number.
 * Checks for: positive, negative, palindrome and prime
 * @author macdja38
 */
public class CheckNumber {
	/**
	 * Checks to see if Number is Positive
	 * @param victim number to check
	 * @return true of false
	 */
	public boolean isPositive(double victim) {
		return (victim>0) ? true : false;
	}
	/**
	 * Checks to see if Number is Negative
	 * @param victim number to check
	 * @return true of false
	 */
	public boolean isNegative(double victim) {
		return (victim<0) ? true : false;
	}
	/**
	 * Check to see if the given number is prime
	 * @author macdja38 & Oscar_Sanchez(code taken from http://www.mkyong.com/java/how-to-determine-a-prime-number-in-java/)
	 * @param victim to test for Primeness
	 * @return true or false
	 */
	public boolean isPrime(double victim) {
	    for(int i=2;i<(victim/2);i++) {
	        if(victim%i==0) {
	            return false;
	        }
	    }
	    return true;
	}
	/**
	 * Check to see if Number is a palindrome
	 * @param victim
	 * @return true of false
	 */
	public boolean ispalindrome(int victim) {
		String victimString = String.valueOf(victim);
		return((new StringBuilder(victimString).reverse().toString()).equals(victimString));
	}
	/**
	 * returns everything
	 * @param victim
	 * @return everything about the variable
	 */
	public String displayNumberChararacteristics(int victim) {
		String parsedOutput;
		parsedOutput = "The number is " + ((new CheckNumber().isPositive(victim) == true) ? "" : "not ") + "a positive number";
		parsedOutput += " and it is " + ((new CheckNumber().isNegative(victim) == true) ? "" : "not ") + "a negative number";
		parsedOutput += " and it is " + ((new CheckNumber().isPrime(victim) == true) ? "" : "not ") + "a prime number";
		parsedOutput += " and it is " + ((new CheckNumber().ispalindrome(victim) == true) ? "" : "not ") + "a palindrome.";
		return parsedOutput;
	}
}
 