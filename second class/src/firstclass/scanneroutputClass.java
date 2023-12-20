package firstclass;

import java.util.Scanner;

public class scanneroutputClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter your first  number : ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();


        System.out.println("your number is "+number1);
        System.out.println("your second is "+number2);

    }
}
