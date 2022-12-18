package dailyWorkoutGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BackDay implements Workout {

	//Dependency field.  Using annotation for field injection
	//@Autowired
	private TipsService myTipService;
	
	//Values injected from properties file
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.version}")
	private String version;
	
		
	// no arg constructor		
	public BackDay() {			
	}
	
	// define a constructor for dependency injection
	//@Autowired
	public BackDay(TipsService myTipService) {
	this.myTipService = myTipService;
	}
	
	
	@Override
	public String getWorkout() {
		return "Deadlift: 5 sets with 10, 8, 8, 6, 4\n"
				+ "Chin Up: 2 sets of 8\n"
				+ "One Arm Dumbbell Row: 3 Sets of 8\n"
				+ "Seated Row: 2 Sets of 8\n"
				+ "Close Grip Lat Pull Down: 3 sets with 10, 10, 8\n"
				+ "Standing Barbell Curl: 3 sets of 8, 8, 6\n"
				+ "Close Grip Preacher Curl: 3 sets of 8, 8, 6\n"
				+ "Incline Dumbbell Curl: 2 sets of 12-14\n"
				+ "Concentration Curl: 2 sets of 10\n"
				;
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
