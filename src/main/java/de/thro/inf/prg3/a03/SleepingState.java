package de.thro.inf.prg3.a03;
import de.thro.inf.prg3.a03.*;

public class SleepingState extends State
{
    public SleepingState(int duration) {
        super(duration);
    }

    @Override
    State successor(Cat cat)
    {
        logger.info("Yawn... getting hungry!");
        return new HungryState(cat.getAwake());
    }
}
