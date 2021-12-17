package singleton.pattern;
/*
 * Ensure a class has only one instance, and provide a global point of access to it
 */
public class Singleton {
    private volatile static Singleton sSIngleton = null; // volatile is used to make it Thread save
    
    private Singleton() {
        System.out.println("This is singleton class");
    }
    
    public static Singleton getInstance() {
        if (sSIngleton == null) {
            synchronized (Singleton.class) { // synchronized is used to make it Thread save
                if (sSIngleton == null) {
                    sSIngleton = new Singleton();
                }
            }
        }
        return sSIngleton;
    }
}
