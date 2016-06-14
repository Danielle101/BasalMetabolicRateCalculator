import java.util.*;
	public class Validator {
		static Scanner s = new Scanner (System.in);
		 
		public static String get_String(String prompt) {
	    String s = "";
	    boolean isValid = false;
	    Scanner sc = new Scanner(System.in);
	    while (!isValid){ // loops until user enters a non-blank line

	    System.out.print(prompt);
	    s = sc.nextLine();
	    if (!s.equals(""))
	    isValid = true;
	}

	    return s;

	}
	       
	public static String getString(String prompt)
	{

	        String s = null;
	        boolean isValid = false;
	        while (!isValid)

	   {
	        s = get_String(prompt);
	        if (s.compareTo("Female") == 0 || s.compareTo("female") == 0 || s.compareTo("male") == 0 || s.compareTo("Male") == 0)
	        isValid = true;
	        else
	        System.out.println("\nError! You must enter 'male' or 'female'!");
	   }

	        return s;
	 }


	public static int readValidInt() {
	while (!s.hasNextInt()) {
		s.nextLine();
		System.out.print("Please make a valid selection! Enter a number: ");
	}
	int x = s.nextInt();
	s.nextLine();
	return x;
	}
	public static int getValidInt(int min, int max) {
	int input = readValidInt();
	while (input < min || input > max) {
		System.out.print("Please pick a number within range (1-130):");
		input = readValidInt();
	}
	return input;
	}
	}
