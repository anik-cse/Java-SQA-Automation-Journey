package assignmentFive;

class Student {
    String name;
    int age;

    // Constructor 1
    Student(String name) {
        this.name = name;
    }

    // Constructor 2
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        Student s1 = new Student("Anik");
        Student s2 = new Student("Farhan", 21);

        s1.display();
        s2.display();
    }
}
