package de.thro.inf.prg3.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State
{
    protected static final Logger logger = LogManager.getLogger();

    private int time = 0;
    private int duration = 0;

    protected State(int duration)
    {
        this.duration = duration;
    }

    final State tick(Cat cat)
    {
        if(duration < 0)
        {
            return this;
        }
        else if(++time == duration)
        {
            return successor(cat);
        }
        else
        {
            logger.info(getClass().getName());
            return this;
        }
    }

    abstract State successor(Cat cat);
}
