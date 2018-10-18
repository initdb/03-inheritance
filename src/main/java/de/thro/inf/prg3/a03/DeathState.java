package de.thro.inf.prg3.a03;

public class DeathState extends State
{
    public DeathState(Animal animal) {
        super(animal);
    }

    @Override
    State successor() {
        return this;
    }
}
