package de.thro.inf.prg3.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State
{
    protected static final Logger logger = LogManager.getLogger();

    private int time = 0;
    private int duration = 0;

    public State(int duration)
    {
        this.duration = duration;
    }

    public final State tick(Cat cat)
    {
        logger.info("tick()" + time);
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

    State feed(Cat cat)
    {
        logger.info("Can't stuff a cat...");
        return this;
    }

    public int getDuration() {
        return duration;
    }

    public int getTime() {
        return time;
    }
}
