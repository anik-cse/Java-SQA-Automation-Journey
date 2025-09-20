package assignmentFour;

class Student {
    // Fields
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void displayInfo() {
        System.out.println("Student: " + name + ", Age: " + age);
    }
}

public class ClassMethodObjectExample {
    public static void main(String[] args) {
        // Create objects
        Student s1 = new Student("Anik", 23);
        Student s2 = new Student("Farhan", 21);

        // Call methods
        s1.displayInfo();
        s2.displayInfo();
    }
}
