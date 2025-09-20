package assignmentFour;

public class LoopAndJumpingExample {
    public static void main(String[] args) {
        System.out.println("For loop with continue and break:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // skip 3
            }
            if (i == 5) {
                break; // stop loop when 5
            }
            System.out.println("i = " + i);
        }

        System.out.println("\nWhile loop:");
        int j = 1;
        while (j <= 3) {
            System.out.println("j = " + j);
            j++;
        }

        System.out.println("\nDo-while loop:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 2);
    }
}
