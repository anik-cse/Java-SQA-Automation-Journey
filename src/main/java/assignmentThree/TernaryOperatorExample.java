package assignmentThree;

public class TernaryOperatorExample {
    public static void main(String[] args) {
        int a = 15, b = 25;

        int min = (a < b) ? a : b;
        int max = (a > b) ? a : b;

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
