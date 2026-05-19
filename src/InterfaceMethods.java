interface Animal5{

    // abstract
    void sound();

    // default
    default void sleep() {
        System.out.println("Sleeping");
    }

    // static
    static void info() {
        System.out.println("Animal interface");
    }

    // private
    private void test() {
        System.out.println("Private method");
    }

    default void callPrivate() {
        test();
    }
}

class Dog5 implements Animal5 {

    public void sound() {
        System.out.println("Dog barking");
    }
}

public class InterfaceMethods {

    public static void main(String[] args) {

        Dog5 d = new Dog5();

        d.sound();

        d.sleep();

        d.callPrivate();

        Animal5.info();
    }
}
