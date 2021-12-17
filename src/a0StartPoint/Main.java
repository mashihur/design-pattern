package a0StartPoint;

import factory.pattern.EntryFactory;
import singleton.pattern.EntrySingleton;


public class Main { 

    public static void main(String[] args) {
//    	EntryPattern pattern = new EntrySingleton();
    	EntryPattern pattern = new EntryFactory();
        
    	pattern.testPattern();                
          
    }

}
