package de.thro.inf.prg3.a03;
import de.thro.inf.prg3.a03.*;

public class DigestingState extends State
{

    public DigestingState(int duration) {
        super(duration);
    }

    @Override
    State successor(Cat cat)
    {
        logger.info("Getting in a playful mood!");
        return new PlayfulState(cat.getAwake());
    }
}
