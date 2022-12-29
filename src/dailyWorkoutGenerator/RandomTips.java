package dailyWorkoutGenerator;

import java.util.Random;

import org.springframework.stereotype.Component;


@Component
public class RandomTips implements TipsService {
	
	//Create an array of tips
	private String[] tips = {"Focus on contracting the specific muscle group to maximize each rep.",
							 "Have a protein shake within 30 minutes of finishing your workout to aid in recovery.",
							 "Focus on your form throughout every lift to minimize injury risk.",
							 "Add 5lbs to your workouts after a solid week of easy sets.",
							 "Rest days are important to allow your muscles to repair and grow."
	};
	
	
	// Create random number generator
	Random randomTip = new Random();
	
	
	
	// Use generator to choose a tip
	@Override
	public String getTip() {
		
		int index = randomTip.nextInt(tips.length);
		
		String tip = tips[index];
		
		return "Fitness Tip: " + tip;
	}

}
