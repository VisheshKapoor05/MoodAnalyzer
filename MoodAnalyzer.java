package MoodAnalyzer;

public class MoodAnalyzer {
	
	String message;
		
	public MoodAnalyzer() {
		
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}
	
	
	public String analyzingMood() {
		try {
			if(this.message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		}
		catch(NullPointerException obj) {
			return "HAPPY";
		}
		
	}			
}
