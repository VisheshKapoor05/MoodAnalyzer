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
				throw new MoodAnalysisException(MoodAnalysisException.Exception.NULL_MOOD_EXCEPTION + "Null is not valid mood");
			else if(message == "") 
				throw new MoodAnalysisException(MoodAnalysisException.Exception.EMPTY_MOOD_EXCEPTION + "Empty mood is not valid");
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
