package MoodAnalyzer;

public class MoodAnalyzer {
	
	String message;
		
	public MoodAnalyzer() {
		this.message = "I am in Sad Mood";
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyzingMood() {
		if(this.message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}

}
