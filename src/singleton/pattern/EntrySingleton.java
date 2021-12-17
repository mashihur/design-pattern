package singleton.pattern;

import a0StartPoint.EntryPattern;

public class EntrySingleton implements EntryPattern{

    @Override
    public void testPattern() {
        Singleton.getInstance();
        Singleton.getInstance();        
    }

}
