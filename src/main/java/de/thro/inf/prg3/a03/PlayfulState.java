package de.thro.inf.prg3.a03;

public class PlayfulState extends State
{
    public PlayfulState(Animal animal) {
        super(animal);
    }

    @Override
    State successor() {
        return new SleepingState(this.animal);
    }
}
