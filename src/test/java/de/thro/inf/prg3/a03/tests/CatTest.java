package de.thro.inf.prg3.a03.tests;

import de.thro.inf.prg3.a03.Cat;
import de.thro.inf.prg3.a03.DigestingState;
import de.thro.inf.prg3.a03.SleepingState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Peter Kurfer
 * Created on 10/7/17.
 */
public class CatTest {

	private static final int Sleep = 10;
	private static final int Awake = 15;
	private static final int Digest = 10;

	private Cat cat;

	@BeforeEach
	void setUp() {
		cat = new Cat("Blue", Sleep, Awake, Digest);
	}

	@Test
	void testFeedHungryAnimal() {
		IntStream.range(0, Sleep).forEach(i -> cat.currentState.tick(cat));
		assertEquals(cat.currentState.getClass().getName(), SleepingState.class.getName());
		cat.currentState.tick(cat);
		cat.feed();
		//assertTrue(cat.isDigesting());
        assertEquals(cat.currentState.getClass().getName(), DigestingState.class.getName());
	}

	@Test
	void testFeedNotHungryAnimal(){
		//assertFalse(cat.isHungry());
		//assertThrows(IllegalStateException.class, () -> cat.feed());
	}

	@Test
	void testAnimalGettingPlayful() {
		//Waiting while cat is sleeping
		//IntStream.range(0, Sleep).forEach(i -> cat.tick());
		//cat.feed();
		//Waiting while cat is digesting
		//IntStream.range(0, Digest).forEach(i -> cat.tick());
		//assertTrue(cat.isPlayful());
	}

	@Test
	void testAnimalDying(){
		//Waiting while cat is sleeping and awake before it's going to die
		//IntStream.range(0, Sleep + Awake).forEach(i -> cat.tick());
		//assertTrue(cat.isDead());
	}

	@Test
	void testAnimalIsGoingToSleepAgain(){
		//Waiting while cat is sleeping
		//IntStream.range(0, Sleep).forEach(i -> cat.tick());
		//cat.feed();
		//Waiting while cat is digesting and in playful mood
		//IntStream.range(0, Awake).forEach(i -> cat.tick());
		//assertTrue(cat.isAsleep());
	}
}
