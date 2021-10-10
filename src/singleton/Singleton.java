package singleton;

public class Singleton {
    private static Singeton singleton = new Singleton();//we created a single object

    private Singleton(){

    }



    public void doWork(){
        System.out.println("do my work");
    }
}
