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
}