package de.thro.inf.prg3.a03;

public class DeathState extends State {
    @Override
    State successor() {
        return this;
    }
}