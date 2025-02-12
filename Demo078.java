public class EvenOddSeparation {
    public static void main(String[] args) {
        // Define the range of numbers you want to check
        int start = 1;
        int end = 20;

        // Loop through the numbers
        System.out.println("Even numbers on the left side and Odd numbers on the right side:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");  // Print even numbers on the left
            }
        }

        System.out.print("   ");  // Space between even and odd numbers

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");  // Print odd numbers on the right
            }
        }
    }
}
