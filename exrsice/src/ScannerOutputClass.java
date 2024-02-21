import java.util.Scanner;

public class ScannerOutputClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("enter your first number : ");
        int number1 = scanner.nextInt();

        System.out.println("Enter your second number "+ number1);
        int number2 = scanner.nextInt();

//        System.out.println("enter your thrid number : ");
//        int number3 = scanner.nextInt();
//
//        if(number1>number2 && number1>number3){
//            System.out.println(number1+ "is the largest");
//        } else if (number2>number1 &&number2>number3) {
//            System.out.println(number2+"is the largest");
//        }else {
//            System.out.println(number3+"is the largest");
//
//        }

//        System.out.println("your number is "+number1);
//        System.out.println("your second number is "+number2);
//        System.out.println();
        if(number1<25 && number2>15){
            System.out.println("we are good");
        }else if (number2>30 && number2<50){
            System.out.println("we are ok");

        }


    }
}
