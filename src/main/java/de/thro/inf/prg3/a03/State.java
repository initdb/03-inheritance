package de.thro.inf.prg3.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State
{
    protected static final Logger logger = LogManager.getLogger();
    protected static Animal animal;

    private int time = 0;
    private int duration = 0;

    public State(Animal animal)
    {
        this.animal = animal;
    }

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
