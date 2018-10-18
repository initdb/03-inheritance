package de.thro.inf.prg3.a03;
import de.thro.inf.prg3.a03.*;

public class SleepingState extends State
{
    public SleepingState(Animal animal) {
        super(animal);
    }

    @Override
    State successor() {
        return new HungryState(this.animal);
    }
}
