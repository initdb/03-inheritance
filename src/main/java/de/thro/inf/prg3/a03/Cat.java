package de.thro.inf.prg3.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cat {
	private static final Logger logger = LogManager.getLogger();

	// valid states
	/*public enum State {SLEEPING, HUNGRY, DIGESTING, PLAYFUL, DEAD}*/

	// initially, animals are sleeping
	public State currentState = new SleepingState(getSleep());

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
	}

	/*
	public void tick(){
		logger.info("tick()");
		time = time + 1;

		switch (currentState) {
			case SLEEPING:
				if (time == sleep) {
					logger.info("Yoan... getting hungry!");
					currentState = HUNGRY;
					time = 0;
				}
				break;
			case HUNGRY:
				if(time == awake){
					logger.info("I've starved for a too long time...good bye...");
					currentState = DEAD;
				}
				break;
			case DIGESTING:
				timeDigesting = timeDigesting + 1;
				if (timeDigesting == digest) {
					logger.info("Getting in a playful mood!");
					currentState = PLAYFUL;
				}
				break;
			case PLAYFUL:
				if (time >= awake) {
					logger.info("Yoan... getting tired!");
					currentState = SLEEPING;
					time = 0;
				}
				break;

			case DEAD:
				break;
			default:
				throw new IllegalStateException("Unknown cat currentState " + currentState.name());
		}

		logger.info(currentState.name());

	}
	*/

	public void feed(){
		if (currentState.getClass().getName()!=HungryState.class.getName())
			throw new IllegalStateException("Can't stuff a cat...");

		logger.info("You feed the cat...");
	}

	/*public boolean isAsleep() {
		return currentState.equals(State.SLEEPING);
	}

	public boolean isPlayful() {
		return currentState.equals(State.PLAYFUL);
	}

	public boolean isHungry() {
		return currentState.equals(State.HUNGRY);
	}

	public boolean isDigesting() {
		return currentState.equals(State.DIGESTING);
	}

	public boolean isDead() {
		return currentState == State.DEAD;
	}*/

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
