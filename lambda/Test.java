package lambda;

public class Test {

    public static void main(String[] args) {
        System.out.println("Lambda tutorial");

        // Hello h = new Implementor();
        // h.sayHi();
        // This is the conventional approach

        // Hello h = new Hello() {
        // public void sayHi() {
        // System.out.println("This is say Hi method in the Test class");
        // }
        // };

        Hello h1 = () -> System.out.println("This is Hello from Hello Interface using lambda");
        h1.sayHi();
    }
}
