public class secondclass {
    public static void main(String[] args) {
        int grade =89;


//        int num1 = 10;
//        int num2 = 20;
//        int num3 = 199;
//        int num4 = num3 + num1 + 2;
//
//        if (num1 > num2) {
//            System.out.println(num1 + "is larger");
//        } else {
//            System.out.println(num2 + "is larger");
//
//
//            if (num1 > num2 && num1 > num3) {
//                System.out.println(num1 + "is the largest");
//            } else if (num2 > num1 && num2 > num3) {
//                System.out.println(num2 + "is largest");
//            } else {
//                System.out.println(num3 + "is the larget");
//            }
//        }

        if (grade >= 90 && grade <= 100) {
            System.out.println("grade is A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("grade is B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("grade is C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("garde is D");
        } else {
            System.out.println("grade is F");


        }
    }
}