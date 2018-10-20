package de.thro.inf.prg3.a03;
import de.thro.inf.prg3.a03.*;

public class HungryState extends State
{
    public HungryState(int duration) {
        super(duration);
    }

    @Override
    State successor(Cat cat)
    {
        return new DeathState(0);
    }

    @Override
    State feed(Cat cat)
    {
        logger.info("You feed the cat...");
        return new DigestingState(cat.getDigest());
    }
}
