import java.util.Scanner;

//author: D.H.
//Date 6/11/16
//this program calculates a persons Basal Metabolic Rate based on weight, height, and age
public class BasalMetabolicRateCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		// welcome the user to the app
	System.out.println("Welcome to the Basal Metabolic RateCalculator!\n\nThis app will calculate your"
			+ " bmr based on the height, age and weight that you input.\nPlease be sure to input"
			+ " your accurate weight, age and height.\n");
	System.out.println("Please enter your age:");
	
	double age = Validator.readValidInt();	
	
	// request user input of height and weight
		System.out.println("Please enter your height in inches:");
			double height = Validator.readValidInt();
			
			//
		System.out.println("Please enter your weight in pounds:");
			double weight = Validator.readValidInt();	
		
		
	
	}

}
