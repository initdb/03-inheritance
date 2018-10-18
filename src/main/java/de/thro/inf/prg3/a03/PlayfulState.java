package de.thro.inf.prg3.a03;

public class PlayfulState extends State
{
    protected PlayfulState(int duration) {
        super(duration);
    }

    @Override
    State successor(Cat cat) {
        logger.info("Yawn... my job here is done!");
        return new SleepingState(cat.getSleep());
    }
}
