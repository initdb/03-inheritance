package de.thro.inf.prg3.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State
{
    protected static final Logger logger = LogManager.getLogger();

    private int time = 0;
    private int duration = 0;

    State tick(Cat cat)
    {
        return successor(cat);
    }

    abstract State successor(Cat cat);

    public int getTime() {
        return time;
    }

    public int getDuration() {
        return duration;
    }
}
