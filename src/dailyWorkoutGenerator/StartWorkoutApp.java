package dailyWorkoutGenerator;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartWorkoutApp {

	public static void main(String[] args) {
		
		// load spring configuration file
		ClassPathXmlApplicationContext context = new 
						ClassPathXmlApplicationContext("applicationContext.xml");
				
				
		// retrieve bean from spring container
		Workout theChestWorkout = context.getBean("chestDay", Workout.class);
		
				
				
				
		// call methods on the bean
		System.out.println(theChestWorkout.getWorkout());
		
				
				
			
				
		// call our new methods
		System.out.println(theChestWorkout.getTip());
		
				
				
		// close the context
		context.close();
		}

	

}
