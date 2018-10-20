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
public class CatTest
{

	private static final int Sleep = 10;
	private static final int Awake = 15;
	private static final int Digest = 10;

	private Cat cat;

	@BeforeEach
	void setUp()
    {
		cat = new Cat("Blue", Sleep, Awake, Digest);
	}

	@Test
	void testFeedHungryAnimal()
    {
		for(int i = 0; i < cat.getSleep()-1; i++)
        {
            cat.tick();
        }
		assertTrue(cat.isAsleep());
		cat.tick();
		cat.feed();
		assertTrue(cat.isDigesting());
	}

	@Test
	void testFeedNotHungryAnimal()
    {
		assertFalse(cat.isHungry());
        cat.feed();
        assertFalse(cat.isHungry());
	}

	@Test
	void testAnimalGettingPlayful()
    {
		//Waiting while cat is sleeping
        for(int i = 0; i < cat.getSleep(); i++)
        {
            cat.tick();
        }
        assertTrue(cat.isHungry());
		cat.feed();
		//Waiting while cat is digesting
        for(int i = 0; i < cat.getDigest(); i++)
        {
            cat.tick();
        }
        assertTrue(cat.isPlayful());
	}

	@Test
	void testAnimalDying()
    {
        //Waiting while cat is sleeping
        for(int i = 0; i < cat.getSleep(); i++)
        {
            cat.tick();
        }
        assertTrue(cat.isHungry());
        //Waiting while cat is starving
        for(int i = 0; i < cat.getAwake(); i++)
        {
            cat.tick();
        }
        //finish the cat off
        cat.tick();
		assertTrue(cat.isDead());
	}

	@Test
	void testAnimalIsGoingToSleepAgain(){
		//Waiting while cat is sleeping
        for(int i = 0; i < cat.getSleep(); i++)
        {
            cat.tick();
        }
        assertTrue(cat.isHungry());
        cat.feed();
		assertTrue(cat.isDigesting());
		//Waiting while cat is digesting and in playful mood
        for(int i = 0; i < cat.getAwake(); i++)
        {
            cat.tick();
        }
		assertTrue(cat.isAsleep());
	}
}
