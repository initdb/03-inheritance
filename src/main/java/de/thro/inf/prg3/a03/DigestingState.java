package de.thro.inf.prg3.a03;
import de.thro.inf.prg3.a03.*;

public class DigestingState extends State
{
    private int timeDigesting = 0;

    protected DigestingState(int duration) {
        super(duration);
    }

    @Override
    State successor(Cat cat)
    {
        if(timeDigesting == cat.getDigest())
        {
            logger.info("Getting in a playful mood!");
            return new PlayfulState(cat.getAwake());
        }
        else
        {
            logger.info("Digesting in progress...");
            timeDigesting++;
            return this;
        }
    }
}
