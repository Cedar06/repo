import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	GradeBook gb1;
	GradeBook gb2;
	
	@BeforeEach
	void setUp() throws Exception {
		gb1 = new GradeBook(5);
		gb2 = new GradeBook(5);
		gb1.addScore(78);
		gb1.addScore(83);
		gb1.addScore(95);
		gb2.addScore(94);
		gb2.addScore(91);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		gb1 = null;
		gb2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(gb1.toString().equals("78.0 83.0 95.0"));
		assertTrue(gb2.toString().equals("94.0 91.0"));
		assertEquals(3,gb1.getScoresSize());
		assertEquals(2,gb2.getScoresSize());
	}

	@Test
	void testSum() {
		assertEquals(256,gb1.sum());
		assertEquals(185,gb2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(78,gb1.minimum());
		assertEquals(91,gb2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(178,gb1.finalScore());
		assertEquals(94,gb2.finalScore());
	}

}
