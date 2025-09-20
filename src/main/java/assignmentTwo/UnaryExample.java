package assignmentTwo;

public class UnaryExample {
    public static void main(String[] args) {
        int x = 10;

        System.out.println("Original x: " + x);

        System.out.println("Post-increment (x++): " + (x++));
        System.out.println("After Post-increment: " + x);

        System.out.println("Pre-increment (++x): " + (++x));

        System.out.println("Post-decrement (x--): " + (x--));
        System.out.println("After Post-decrement: " + x);

        System.out.println("Pre-decrement (--x): " + (--x));

        System.out.println("Unary minus (-x): " + (-x));
    }
}
