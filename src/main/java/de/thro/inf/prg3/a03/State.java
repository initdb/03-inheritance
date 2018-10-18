package de.thro.inf.prg3.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State
{
    protected final Logger logger = LogManager.getLogger();
    protected Animal animal;

    private int time = 0;
    private int duration = 0;

    State tick()
    {
        return this.successor();
    }

    abstract State successor();

    public int getTime() {
        return time;
    }

    public int getDuration() {
        return duration;
    }
}
