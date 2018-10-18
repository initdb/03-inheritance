package de.thro.inf.prg3.a03;
import de.thro.inf.prg3.a03.*;

public class DigestingState extends State
{
    public DigestingState(Animal animal) {
        super(animal);
    }

    @Override
    State successor() {
        logger.info("Getting in a playful mood!");
        return new PlayfulState(this.animal);
    }
}
