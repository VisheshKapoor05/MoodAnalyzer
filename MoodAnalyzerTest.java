package MoodAnalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
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
	
	@Test
	public void testMoodAnalyzerHAPPY() {
		String message = "I am in Any Mood" ;
		obj = new MoodAnalyzer(message);
		String myMood = obj.analyzingMood();
		assertEquals("HAPPY" , myMood);
	}

}
