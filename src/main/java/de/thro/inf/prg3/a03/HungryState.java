package de.thro.inf.prg3.a03;
import de.thro.inf.prg3.a03.*;

public class HungryState extends State
{
    private static int timeSinceFeed = 0;
    private static final int DEATH_THRESHOLD = 5;

    @Override
    State successor()
    {
        if(timeSinceFeed >= DEATH_THRESHOLD) {
            return new DeathState();
        }
        else
        {
            timeSinceFeed++;
            return this;
        }
    }

    State feed()
    {
        return new DigestingState();
    }
}
