
final class Ani {
    private final int age;
    private final String name;

    public Ani(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;

    }

    public String getName() {
        return name;

    }
}
    public class Immutable_java {
    public static void main(String[] args){
        Ani a=new Ani(25,"aaa");
        System.out.println(a.getAge());
        System.out.println(a.getName());
    }
}
