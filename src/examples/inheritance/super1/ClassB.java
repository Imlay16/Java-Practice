package examples.inheritance.super1;

public class ClassB extends ClassA {

    public ClassB(int a) {
        this(10, 20);
        System.out.println("ClassB 생성, a = " + a);
    }

    public ClassB(int a, int b) {
        //super();
        System.out.println("ClassB 생성, a = " + a + " b = " + b);
    }
}
