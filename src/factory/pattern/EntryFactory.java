package factory.pattern;

import a0StartPoint.EntryPattern;
/*
 * Define an interface for creating an object, but let subclasses decide which class to instantiate. The Factory method lets a class defer instantiation it uses to subclasses.
 */
public class EntryFactory implements EntryPattern{
    private CityInterface factory;

    @Override
    public void testPattern() {
        factory = new London();
        factory.getProduct("A").printDescription();

        factory = new Berlin();
        factory.getProduct("B").printDescription();
    }
}
