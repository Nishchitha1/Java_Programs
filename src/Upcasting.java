class Animal3{
    void sound(){
        System.out.println("animal sound");
    }
}
class Dog4 extends Animal3{
    void display(){
        System.out.println("dog sound");
    }
}


public class Upcasting {
    public static void main(String[] args){
        Animal3 a=new Dog4();
        a.sound();
        Dog4 d=(Dog4) a;
        d.display();
    }
}
