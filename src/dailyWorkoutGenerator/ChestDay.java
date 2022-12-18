package dailyWorkoutGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ChestDay implements Workout {
	
	//define a private field for the dependency
	//@Autowired
	private TipsService myTipService;
	
	//Values injected from properties file
	@Value("${foo.email}")
	private String email;
		
	@Value("${foo.version}")
	private String version;
	
		
		
	// no arg constructor		
	public ChestDay() {			
	}
	
	// define a constructor for dependency injection
	//@Autowired
	public ChestDay(TipsService myTipService) {
	this.myTipService = myTipService;
	}

	@Override
	public String getWorkout() {
		return "Barbell Bench Press: 4 sets with 10, 8, 8, 6\n"
				+ "Incline Bench Press: 3 sets of 8, 8, 6\n"
				+ "Decline Bench Press: 3 sets of 8, 8, 6\n"
				+ "Dumbbell Flys: 2 sets of 10\n"
				+ "Dumbbell Pullover: 2 sets of 8\n"
				+ "Tricep Extension: 4 sets of 10, 8, 8, 6\n"
				+ "Tricep Dip: 3 sets of 10\n"
				+ "Tricep Bench Dip: 3 sets of 8\n";
	}
	
	@Override
	public String getTip() {	
		return myTipService.getTip();
	}

	public String getEmail() {
		return email;
	}

	public String getVersion() {
		return version;
	}
	
	

}
