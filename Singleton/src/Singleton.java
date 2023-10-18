public class Singleton {
    private static Singleton singleInstance=new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return singleInstance;
    }
}
