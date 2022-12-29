package dailyWorkoutGenerator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:workout.properties")
public class WorkoutConfig {
	
	//Define dependency service
	@Bean
	public TipsService randomTips() {
		return new RandomTips();
	};
	
	//Define object to inject dependency
	@Bean
	public Workout legDay() {
		return new LegDay(randomTips());
	}
	
	@Bean
	public Workout cardioDay() {
		return new CardioDay(randomTips());
	}
	
	@Bean
	public Workout backDay() {
		return new BackDay(randomTips());
	}
	
	@Bean
	public Workout chestDay() {
		return new ChestDay(randomTips());
	}

}
