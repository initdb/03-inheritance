package de.thro.inf.prg3.a03.states;

import de.thro.inf.prg3.a03.Animal;
import de.thro.inf.prg3.a03.State;

/**
 * @author Peter Kurfer
 * Created on 10/13/17.
 */
public class SleepingState extends State {

    public SleepingState(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    public State successor() {
        logger.info("Yoan... getting hungry!");
        return new HungryState(animal, animal.getAwake());
    }
}