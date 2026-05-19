class Student {

    // private variable
    private int marks;

    // setter method
    void setMarks(int m) {
        marks = m;
    }

    // getter method
    int getMarks() {
        return marks;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        // creating object
        Student s1 = new Student();

        // setting value using setter
        s1.setMarks(95);

        // getting value using getter
        System.out.println("Marks = " + s1.getMarks());
    }
}
