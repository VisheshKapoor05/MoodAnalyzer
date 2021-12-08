package MoodAnalyzer;

public class MoodAnalysisException extends Exception{
	
	public MoodAnalysisException() {
		System.out.println("Null mood is not valid");
	}
	
	public MoodAnalysisException(String exception) {
		System.out.println(exception);
	}
}
