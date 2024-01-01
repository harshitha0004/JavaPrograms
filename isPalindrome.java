import java.util.Scanner;
public class Main {
    public static String reverse(String str) {
        String reverseStr = "";
        char ch;
        for (int i = str.length() - 1; i >= 0; i--) {
            ch = str.charAt(i);
            reverseStr = reverseStr + ch;
        }
        return reverseStr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inputInt = scanner.nextInt();
        String inputString = Integer.toString(inputInt);
        String reversedString = reverse(inputString);
        if (reversedString.equals(inputString)) {
            System.out.println("The integer is a palindrome.");
        } else {
            System.out.println("The integer is not a palindrome.");
        }
    }
}
