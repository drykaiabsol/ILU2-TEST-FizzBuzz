package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

class GameTest {
	Game game;
	
	@BeforeEach
	void setUp() throws Exception{
		game = new Game();
	}
	
	@Test
	void firstRoundTest() {
		assertEquals("1", game.next());
	}
	
	@Test
	void firstSecondRoundTest() {
		game.next();
		assertEquals("2", game.next());
	}
	
	@Test
	void firstFizzTest() {
		game.next();
		game.next();
		assertEquals("Fizz", game.next());
	}
	
	@Test
	void fourthTest() {
		preshot(3);
		assertEquals("4", game.next());
	}
	
	@Test
	void firstBuzz() {
		preshot(4);
		assertEquals("Buzz", game.next());
	}
	private void preshot(int nbRounds) {
		for (int i = 0; i < nbRounds; i++) {
			game.next();
		}
	}
	
	@Test
	void someValues() {
		preshot(6);
		assertEquals("7", game.next());
		assertEquals("8", game.next());
		preshot(2);
		assertEquals("11", game.next());
	}
	
	@Test
	void someMoreFizz() {
		preshot(5);
		assertEquals("Fizz", game.next());//6
		preshot(5);
		assertEquals("Fizz", game.next());//12
		preshot(2);
		assertEquals("Fizz", game.next());//15
	}
	
	@Test
	void someMoreBuzz() {
		preshot(9);
		assertEquals("Buzz", game.next());//10
		preshot(39);
		assertEquals("Buzz", game.next());//50
	}
}