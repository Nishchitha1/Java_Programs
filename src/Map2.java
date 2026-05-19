import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Person p = (Person) obj;

        return age == p.age && name.equals(p.name);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class Map2 {
    public static void main(String[] args) {

        Map<Person, String> map = new HashMap<>();

        Person p1 = new Person("Alice", 30);
        map.put(p1, "Engineer");

        Person p2 = new Person("Alice", 30);

        System.out.println(map.get(p2));
    }
}