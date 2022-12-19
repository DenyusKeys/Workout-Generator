package dailyWorkoutGenerator;

import java.util.Random;

import org.springframework.stereotype.Component;


@Component
public class RandomTips implements TipsService {
	
	//Create an array of tips
	private String[] tips = {"Focus on contracting the muscles.",
							 "Have a protein shake within 30 minutes of finishing your workout.",
							 "Keep your form throughout every lift.",
							 "Add 5lbs to your workouts after a solid week of easy sets.",
				 			 "Make sure to have recovery days to let your muscles repair.",
							 "Warm up a bit before stretching with a walk or slight jog on the treadmill."
	};
	
	
	// Create random number generator
	Random randomTip = new Random();
	
	
	
	// Use generator to choose a tip
	@Override
	public String getTip() {
		
		int index = randomTip.nextInt(tips.length);
		
		String tip = tips[index];
		
		return "Tip: " + tip;
	}

}
