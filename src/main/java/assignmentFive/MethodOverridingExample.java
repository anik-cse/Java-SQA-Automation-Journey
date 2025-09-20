package assignmentFive;

class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle...");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Circle();

        s1.draw(); // Shape version
        s2.draw(); // Circle version (overridden)
    }
}
