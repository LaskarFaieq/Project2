package nestedclass;

public class OuterClass {
    //outer class variables
    int outerNum1 = 10;
    //outer class constructor
    public OuterClass(){

    }
    InnerA innerA = new InnerA();


    //outer class methods
    public void outerMethodA(){
        System.out.println("outer class method A");
    }
    public void outerMethodB(){
        System.out.println("outer class method B");
    }
    //inner class A
    public class InnerA{
        //inner class contructor
       public InnerA(){
       }
       //inner class variables
        int numA = 6;
       //inner class methods
        public void innerMethodA(){
            System.out.println("this is InnerA method");
        }
    }
    //inner class B
    public class InnerB{
        //inner B class constructor
        public InnerB(){

        }
    //inner B class variables
        int numB = 9;
        // inner b class methods
        public void innerMethodB(){
            System.out.println("this is InnerB method");
        }
    }
}
