package de.thro.inf.prg3.a03;
import de.thro.inf.prg3.a03.*;

public class DigestingState extends State
{
    int remainingDayTime;

    public DigestingState(int duration, int remainingDayTime) {
        super(duration);
        this.remainingDayTime = remainingDayTime;
    }

    @Override
    State successor(Cat cat)
    {
        logger.info("Getting in a playful mood!");
        return new PlayfulState(remainingDayTime - cat.getDigest());
    }
}
