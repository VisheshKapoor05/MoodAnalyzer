package MoodAnalyzer;

public class MoodAnalyzer {
	
	public String analyzingMood(String message) {
		if(message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}

}
