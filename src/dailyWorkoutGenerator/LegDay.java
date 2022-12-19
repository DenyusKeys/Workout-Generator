package dailyWorkoutGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LegDay implements Workout {
	
	//Dependency field.  Using annotation for field injection
	//@Autowired
	private TipsService myTipService;
	
	//Values injected from properties file
	@Value("${foo.email}")
	private String email;
		
	@Value("${foo.version}")
	private String version;
	
	
	//No arg constructor
	public LegDay() {};
	
	// Constructor for dependency
	//@Autowired
	public LegDay(TipsService myTipService) {
		this.myTipService=myTipService;
	}
	

	@Override
	public String getWorkout() {
		return "Squat: 5 sets of 10, 8, 8, 6, 4\n"
				+ "Leg Extension: 3 sets of 12\n"
				+ "Leg Curl: 3 sets of 12\n"
				+ "Standing Calf Raise: 4 sets of 12\n"
				+ "Seated Calf Raise: 2 sets of 12\n"
				+ "Stretch with lunges and butterflies\n";
				
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
