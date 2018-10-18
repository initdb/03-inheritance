package de.thro.inf.prg3.a03;
import de.thro.inf.prg3.a03.*;

public class HungryState extends State
{
    @Override
    State successor(Cat cat)
    {
        return new DeathState();
    }

    State feed()
    {
        return new DigestingState();
    }
}
