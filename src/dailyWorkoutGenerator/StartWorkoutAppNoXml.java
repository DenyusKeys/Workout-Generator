package dailyWorkoutGenerator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StartWorkoutAppNoXml {

	public static void main(String[] args) {
		
		// load spring configuration file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(WorkoutConfig.class);
		
				
		// retrieve bean from spring container
		BackDay theBackWorkout = context.getBean("backDay", BackDay.class);
		ChestDay theChestWorkout = context.getBean("chestDay", ChestDay.class);
		
				
				
				
		// call methods on the bean
		System.out.println(theBackWorkout.getWorkout());
		System.out.println(theBackWorkout.getTip() + "\n");
		System.out.println(theBackWorkout.getEmail());
		System.out.println(theBackWorkout.getVersion() + "\n");
		
		System.out.println(theChestWorkout.getWorkout());
		System.out.println(theChestWorkout.getTip() + "\n");
		System.out.println(theChestWorkout.getEmail());
		System.out.println(theChestWorkout.getVersion() + "\n");
		
				
				
			
				
		// call our new methods
		//System.out.println(theBackWorkout.getTip());
		
				
				
		// close the context
		context.close();
		}

	

}
