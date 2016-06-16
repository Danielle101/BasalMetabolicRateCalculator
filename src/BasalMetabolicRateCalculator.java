import java.util.Scanner;

//author: D.H.
//Date 6/11/16
//this program calculates a persons Basal Metabolic Rate based on weight, height, and age
public class BasalMetabolicRateCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		// welcome the user to the app
	System.out.println("Welcome to the Basal Metabolic RateCalculator!\n"
			+"\nBasal metabolic rate (BMR) is the amount of energy expended while at rest in a neutrally temperate\n"
			+ "environment, in the post-absorptive state (meaning that the digestive system is inactive, which requires \nabout twelve hours of fasting)."
			+ " \n\nThis app will calculate you bmr based on the gender, height, age and weight that you input.\nPlease be sure to input"
			+ " your accurate gender, weight, age and height.");
	
				String gender = Validator.getString("\nPlease enter your gender (male/female?):") ;

	System.out.println("Please enter your age:");
	//get user input for age
	double age = Validator.readValidInt();	
	
	// request user input of height and weight
		System.out.println("Please enter your height in inches:");
			double height = Validator.readValidInt();
			
			//
		System.out.println("Please enter your weight in pounds:");
			double weight = Validator.readValidInt();
			
			if (gender.equalsIgnoreCase("female") ){
			
			double bmr =  (655 + ( weight * 4.35 ) + (height * 4.7 ) - ( age * 4.7));

		System.out.println("Well ma'am, your BMR is "+bmr+". That's the number of calories your body needs just to fuel"
				+ " itself for involuntary needs \nsuch as heart, digestion, kidney, brain and other organ function.");
			}
			else if (gender.equalsIgnoreCase("male") ) {
				double bmr =  (66 + ( weight * 6.23 ) + (height * 12.7 ) - ( age * 6.8));
				System.out.println("Well sir, your BMR is "+bmr+". That's the number of calories your body needs just to fuel"
						+ " itself for involuntary needs \nsuch as heart, digestion, kidney, brain and other organ function.");
					}
				System.out.println("Thank you for using the BMR Calculator!");
			}
	
	}


