import java.util.Scanner;
public class Main {
    public String weekName(int number) {
        switch (number) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Invalid day";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();
        if (userNumber >= 1 && userNumber <= 7) {
            String weekday = weekNamee(userNumber);
            System.out.println( weekday);
        } else {
            System.out.println("Invalid input");
        }
    }

}
