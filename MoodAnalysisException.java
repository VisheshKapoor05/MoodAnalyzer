package MoodAnalyzer;

public class MoodAnalysisException extends Exception{
	
	enum Exception {
		NULL_MOOD_EXCEPTION, EMPTY_MOOD_EXCEPTION;
	}
	
//	public MoodAnalysisException() {
//		System.out.println("Null mood is not valid");
//	}
	
	public MoodAnalysisException(String exception) {
		System.out.println(exception);
	}
}
