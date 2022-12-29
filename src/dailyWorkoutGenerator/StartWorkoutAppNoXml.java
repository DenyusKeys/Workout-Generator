package dailyWorkoutGenerator;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StartWorkoutAppNoXml {

	public static void main(String[] args) {
		
		// load spring configuration file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(WorkoutConfig.class);
		
				
		// retrieve bean from spring container based on user input
	
		Scanner input = new Scanner(System.in);
		System.out.println("What muscle group are you interested in getting a workout plan for?" + "\n" + 
				"Chest and Triceps - 1" + "\n" + 
				"Back and Biceps - 2" + "\n" + 
				"Legs - 3" + "\n" + 
				"Cardio day - 4" + "\n" + 
				"Make a selection and hit enter or choose 0 to quit.");
		
		// Get User input
		String selection = input.next();
		System.out.println("Your selection was: " + selection);
		
		if(selection.equals("1")) {
			ChestDay theChestWorkout = context.getBean("chestDay", ChestDay.class);
			System.out.println("Here is your chest and tricep workout: " + "\n" + "\n"
								+ theChestWorkout.getWorkout());	
		} else if(selection.equals("2")) {
			BackDay theBackWorkout = context.getBean("backDay", BackDay.class);
			System.out.println("Here is your back and bicep workout: " + "\n" + "\n"
								+ theBackWorkout.getWorkout());
		} else if(selection.equals("3")) {
			LegDay theLegWorkout = context.getBean("legDay", LegDay.class);
			System.out.println("Here is your leg workout: " + "\n" + "\n"
								+ theLegWorkout.getWorkout());
		} else if(selection.equals("4")) {
			CardioDay theCardioWorkout = context.getBean("cardioDay", CardioDay.class);
			System.out.println("Here is your cardio workout: " + "\n" + "\n"
								+ theCardioWorkout.getWorkout());
		} else if(selection.equals("0")) {
			System.out.println("Ending program");
			System.exit(0);
		} else {
			System.out.println("Invalid choice, try again"); 			
		}
		
		// Close the context
		context.close();
	}
}
