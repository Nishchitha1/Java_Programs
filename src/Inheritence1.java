
class Animal {
    void sound() {
        System.out.println("animal sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog sounds");
        super.sound();
    }
}
public class Inheritence1 {
    public static void main(String[] args) {

        Animal a=new Animal();
        Dog d = new Dog();
        d.sound();


    }
}


//class Animal {
//    void sound() {
//        System.out.println("animal sound");
//    }
//}
//class Dog extends Animal{
//    void sound(){
//        System.out.println("Dog sounds");
//        super.sound();
//    }
//}
//class Cat extends Dog{
//    void sound(){
//        System.out.println("cat sounds");
//
//    }
//}
//public class Inheritence1 {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.sound();
//        Cat c=new Cat();
//        c.sound();
//
//
//    }
//}
//
//class Animal {
//    void sound() {
//        System.out.println("animal sound");
//    }
//}
//class Dog extends Animal{
//    void sound(){
//        System.out.println("Dog sounds");
//        super.sound();
//    }
//}
//class Cat extends Animal{
//    void sound(){
//        System.out.println("cat sounds");
//
//    }
//}
//public class Inheritence1 {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.sound();
//        Cat c=new Cat();
//        c.sound();
//
//
//    }
//}

