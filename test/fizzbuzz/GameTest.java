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
	}
	
	@Test
	void someMoreBuzz() {
		preshot(9);
		assertEquals("Buzz", game.next());//10
		preshot(39);
		assertEquals("Buzz", game.next());//50
	}
	
	@Test
	void firstFizzBuzz() {
		preshot(14);
		assertEquals("FizzBuzz", game.next());//15
	}
	
	@Test
	void aFullGame() {
		String expected = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, FizzBuzz";
		assertEquals(expected, preshot(30));
	}
	
	private String preshot(int nbRounds) {
		StringBuilder sb = new StringBuilder();
		sb.append(game.next());
		for ( int i = 1; i < nbRounds; i++) {
			sb.append(", ");
			sb.append(game.next());
		}
		return sb.toString().trim();	}
}