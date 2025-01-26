import java.util.Scanner;

public class Demo041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The character is a vowel.");
        } else if ((ch >= 'a' && ch <= 'z')) {
            System.out.println("The character is a consonant.");
        } else {
            System.out.println("The input is not a valid alphabet.");
        }
    }
}