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
			if(this.message==null)
				throw new MoodAnalysisException();
			else if(message == "") 
				throw new MoodAnalysisException("Empty mood is not valid");
			else if(this.message.contains("Sad"))
				return "SAD";
			else 
				return "HAPPY";
		}
		catch(MoodAnalysisException obj) {
			return obj.getMessage();
		}
		
	}			
}
