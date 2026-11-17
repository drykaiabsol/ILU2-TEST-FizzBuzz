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
	private void preshot(int nbRounds) {
		for (int i = 0; i < nbRounds; i++) {
			game.next();		
		}
	}
}