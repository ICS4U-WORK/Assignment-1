package checkNumber;
import java.io.*; //tell the java compiler that we'll be doing 	i/o


public class Keyboard {
	private static BufferedReader inputStream = new BufferedReader(new 	InputStreamReader(System.in));

	/** Get an integer from the user and return it. 
	 * Insist they give an integer,
	 * don't take no for an answer, keep them their until they
	 * give you an INTEGER, nothing else, no periods, no letters, no compromises
	 * @return int no matter what
	 * @author macdja38 and unknown, mostly macdja38
	 *  */
	public static int getInteger() {
		while(true) {
			try {
				return(Integer.valueOf(inputStream.readLine().trim()).intValue());
			} catch (Exception e) {
				System.out.println("please try again");
			}
		}
	}
		
	/* Get a double from the user and return it */
	public static double getDouble() {
		try {
			return(Double.valueOf(inputStream.readLine().trim()).doubleValue());
		} catch (Exception e) {
				e.printStackTrace();
				return 0.0;
		}
	}
	
	/* Get a float from the user and return it */
	public static float getFloat() {
		try {
			return(Float.valueOf(inputStream.readLine().trim()).floatValue());
		} catch (Exception e) {
			e.printStackTrace();
			return 0.0f;
		}
	}
	
	/* Get a string of text from the user and return it */
	public static String getString() {
		try {
			return inputStream.readLine();
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	
	/* Get a char from the user and return it */
	public static char getCharacter() {
		try {
			String in = inputStream.readLine().trim();
			if (in.length() == 0)
				return (char)0;
			else
				return (in.charAt(0));
		} catch (Exception e) {
			e.printStackTrace();
			return (char)0;
		}
	}
	
	/* Get a boolean from the user and return it */
	public static boolean getBoolean() {
		try {
			return(Boolean.valueOf(inputStream.readLine().trim()).booleanValue());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
