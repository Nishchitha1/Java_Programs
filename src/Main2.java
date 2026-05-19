interface Payment {

    void pay();  // abstract method
}
class UPI implements Payment {

    public void pay() {
        System.out.println("Payment done using UPI");
    }
}
class Card implements Payment {

    public void pay() {
        System.out.println("Payment done using Card");
    }
}
public class Main2 {
    public static void main(String[] args) {

        Payment p1 = new UPI();
        p1.pay();

        Payment p2 = new Card();
        p2.pay();
    }
}