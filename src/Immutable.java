final class Employee {

    private final int id;
    private final String name;

    public Employee(int id, String name) {

        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Immutable {

    public static void main(String[] args) {

        Employee e = new Employee(101, "Nish");

        System.out.println(e.getId());
        System.out.println(e.getName());
    }
}
