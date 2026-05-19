abstract class Animal1 {
    abstract void display();


    void sound(){
            System.out.println("sound");
        }

    }
    class Dog1 extends Animal1{

void display(){
    System.out.println("hii");
}

}
public class Abstact11{
    public static void main(String[] args){
        Dog1 d=new Dog1();
        d.display();



    }
}

//interface Animal2{
//    inter
//}