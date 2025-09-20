package assignmentTwo;

class Student {
    // Fields (variables)
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

public class ClassExample {
    public static void main(String[] args) {
        Student s1 = new Student("Anik", 30);
        Student s2 = new Student("Mir monoarul Alam", 29);

        s1.displayInfo();
        s2.displayInfo();
    }
}
