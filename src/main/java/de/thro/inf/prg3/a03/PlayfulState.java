package de.thro.inf.prg3.a03;

public class PlayfulState extends State
{
    @Override
    State successor(Cat cat) {
        return new SleepingState();
    }
}
