package examples.acess.a;

public class AccessMain {
    public static void main(String[] args) {

        PublicClass publicClass = new PublicClass();
        publicClass.print();

        DefaultClass defaultClass = new DefaultClass();
        defaultClass.print();

        DefaultClass2 defaultClass2 = new DefaultClass2();
        defaultClass2.print();
    }
}
