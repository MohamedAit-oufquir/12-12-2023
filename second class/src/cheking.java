import java.util.Scanner;

public class cheking {

    public class CheckConditions {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter we are good: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter WE ARE OK: ");
            int num2 = scanner.nextInt();

            if (num1 < 25 && num2 > 15) {
                System.out.println("We are good");
            } else if (num1 > 30 && num2 < 50) {
                System.out.println("We are ok");
            } else {
                System.out.println("Conditions not met");
            }
        }
    }
}


