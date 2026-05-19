class Father {
    int age;
    int year;

    Father(int age, int year) {   // ✅ removed void
        this.age = age;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Father{ age=" + age + ", year=" + year + " }";
    }
}

class Mother extends Father {
    int age;

    Mother(int age) {             // ✅ removed void
        super(45, 1980);          // ✅ calling Father constructor
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mother{ age=" + age + " }";
    }
}

public class InheritancetoString {
    public static void main(String[] args) {
        Mother m = new Mother(20);
        System.out.println(m);    // ✅ prints both Father + Mother info
    }
}