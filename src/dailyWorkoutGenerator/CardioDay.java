package dailyWorkoutGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CardioDay implements Workout {
	
	//Dependency field.  Using annotation for field injection
	//@Autowired
	private TipsService myTipService;
	
	//Values injected from properties file
	@Value("${foo.email}")
	private String email;
		
	@Value("${foo.version}")
	private String version;
	

	//No arg constructor
	public CardioDay() {};
	
	
	// Constructor with dependency
	//@Autowired
	public CardioDay(TipsService myTipService) {
		this.myTipService=myTipService;
	}
	

	
	
	@Override
	public String getWorkout() {
		return "Going for a 30 minute treadmill workout:\n"
				+ "Walk at a slight incline for 3 minutes\n"
				+ "Increase incline by 10-15% for another 3 minutes\n"
				+ "Bring incline flat and run for 1-2 minutes\n"
				+ "Repeat 6 times\n";				
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
