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
		catch(Exception obj) {
			if(this.message==null)
				throw new MoodAnalysisException();
			else
				return message;
		}
		
	}			
}
