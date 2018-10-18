package de.thro.inf.prg3.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State
{
    protected final Logger logger = LogManager.getLogger();
    protected Animal animal;

    private int t;
    private int duration;

    State tick()
    {
        return null;
    }

    abstract State successor();
}
