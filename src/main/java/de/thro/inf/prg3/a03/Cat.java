package de.thro.inf.prg3.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cat
{
	private static final Logger logger = LogManager.getLogger();

	// initially, animals are sleeping
	private State currentState;

	// currentState durations (set via constructor), ie. the number of ticks in each currentState
	private final int sleep;
	private final int awake;
	private final int digest;

	private final String name;

	private int time = 0;
	//private int timeDigesting = 0;

	public Cat(String name, int sleep, int awake, int digest) {
		this.name = name;
		this.sleep = sleep;
		this.awake = awake;
		this.digest = digest;
		currentState = new SleepingState(getSleep());
	}

	public void tick()
	{
		currentState = currentState.tick(this);
	}

	public void feed()
	{
		currentState = currentState.feed(this);
	}

	public boolean isAsleep() {
		if(currentState.getClass().getName() == SleepingState.class.getName())
			return true;
		else
			return false;
	}

	public boolean isPlayful() {
		if(currentState.getClass().getName() == PlayfulState.class.getName())
			return true;
		else
			return false;
	}

	public boolean isHungry() {
		if(currentState.getClass().getName() == HungryState.class.getName())
			return true;
		else
			return false;
	}

	public boolean isDigesting() {
		if(currentState.getClass().getName() == DigestingState.class.getName())
			return true;
		else
			return false;
	}

	public boolean isDead() {
		if(currentState.getClass().getName() == DeathState.class.getName())
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public int getAwake() {
		return awake;
	}

	public int getDigest() {
		return digest;
	}

	public int getSleep() {
		return sleep;
	}
}
