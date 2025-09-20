package assignmentThree;

public class IfStatementExample {
    public static void main(String[] args) {
        int number = 15;

        // Simple if
        if (number > 10) {
            System.out.println("Number is greater than 10");
        }

        // if-else
        if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

        // if-else-if ladder
        if (number < 0) {
            System.out.println("Number is Negative");
        } else if (number == 0) {
            System.out.println("Number is Zero");
        } else {
            System.out.println("Number is Positive");
        }

        // Nested if
        if (number > 0) {
            if (number < 20) {
                System.out.println("Number is between 1 and 19");
            }
        }
    }
}
