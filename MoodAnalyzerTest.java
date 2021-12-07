package MoodAnalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
	
	static MoodAnalyzer obj;            // declaring an object of MoodAnalyzer class

	@Test
	public void testMoodAnalyzerSAD() {
		String message = "I am in Sad Mood" ;
		obj = new MoodAnalyzer(message);
		String myMood = obj.analyzingMood();
		assertEquals("SAD" , myMood);
	}
	
	// TC 3.1 passing null
	@Test
	public void testMoodAnalyzerHAPPYnull() {
		String message = null ;
		obj = new MoodAnalyzer(message);
		String myMood = obj.analyzingMood();
		assertEquals("HAPPY" , myMood);
	}
	
	// TC 3.2 passing empty message
	@Test
	public void testMoodAnalyzerHAPPYempty() {
		String message = "" ;
		if(message == "") {
			throw new MoodAnalysisException("Empty mood is not valid");
		}
		obj = new MoodAnalyzer(message);
		String myMood = obj.analyzingMood();
		assertEquals("HAPPY" , myMood);
	}
	
	@Test
	public void testMoodAnalyzerHAPPY() {
		String message = "I am in Happy Mood" ;
		obj = new MoodAnalyzer(message);
		String myMood = obj.analyzingMood();
		assertEquals("HAPPY" , myMood);
	}

}
