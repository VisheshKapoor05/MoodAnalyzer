package MoodAnalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
	
	static MoodAnalyzer obj;            // declaring an object of MoodAnalyzer class

	@BeforeClass
	public static void instantiation() { 
		obj = new MoodAnalyzer();       // instance of the MoodAnalyzer before the test classes execute
	}
	
	@Test
	public void testMoodAnalyzerSAD() {
		String message = "I am in Sad Mood" ;
		String myMood = obj.analyzingMood(message);
		assertEquals("SAD" , myMood);
	}
	
	@Test
	public void testMoodAnalyzerHAPPY() {
		String message = "I am in Any Mood" ;
		String myMood = obj.analyzingMood(message);
		assertEquals("HAPPY" , myMood);
	}

}
