package de.thro.inf.prg3.a03;

public class DeathState extends State
{
    public DeathState(int duration) {
        super(duration);
    }

    @Override
    State successor(Cat cat) {
        logger.info("The cat has already starved - you monster!");
        return this;
    }
}
