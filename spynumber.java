import java.util.Scanner;
public class Main {
  public boolean isSpyNumber(int num) {
        int sum = 0;
        int product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }
    public static void main(String[] args) {       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a  number: ");
        int number = scanner.nextInt();
        boolean isSpyNumber = isSpyNumber(number);
        System.out.println("Is it a SPY number? " + isSpyNumber);
    }
}
