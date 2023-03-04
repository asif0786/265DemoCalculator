import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*System.out.println("Hello world!");
        System.out.println("Program begins");
        int x = 123;
        System.out.println("Value x=");
        System.out.println(x);
        x++;
        System.out.println("Now, value x=");
        System.out.println(x);
        System.out.println("Program terminates");
    */
    /*    int a =1 ;
        int b = 2;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        double ab = 1.56;
        double cd = 2.00;
        double summ = ab + cd;
        double subt = ab - cd;
        double mult = ab * cd;
        double dive = ab / cd;
        double divi = ab / cd;

        float ef = 1.56F;
        float gh = 2.00F;
        float add = ef + gh;

        System.out.println("Addition = "+sum);
        System.out.println("Subtraction = "+sub);
        System.out.println("Multiplication = "+mul);
        System.out.println("Division of int number = "+div);
        System.out.println("Quotient of integer number = "+div);
        System.out.println("=========================================");
        System.out.println("Addition of double number = "+summ);
        System.out.println("Subtraction of double number = "+subt);
        System.out.println("Multiplication of double number = "+mult);
        System.out.println("Division of double number = "+dive);
        System.out.println("=========================================");
        System.out.println("Division of float number = "+divi);
        System.out.println("Modulous is = "+mod);

        System.out.println("Quotient of double number = "+dive);
        System.out.println("Remainder is = "+mod);
        System.out.println("Addition of float numbers = "+add);
*/
        /*
        * primitive : datatypes which are pre-defined and have some restrictions
        * int : -2,147,483,648 to 2,147,483,648
         * byte : -128 to 127
         * short : -32,768 to 32,768
         * long : -9,223,372,036,854,775,808 to 9,223,372,036,854,775,808
         * float : Single-precision floating point, 32-bit
         * double : Single-precision floating point, 64-bit
         * boolean : 2 - true or false
         * char : 0 - 65536(unicode)
        * Non-primitive : datatypes which are defined by user and are flexible */

// Program to take input from user and ask what arithmetic operation to perform
        Scanner sc = new Scanner(System.in); //scanner object
        System.out.println("Enter First Number");
        double a = sc.nextDouble();
        System.out.println("Enter Second Number");
        double b = sc.nextDouble();
        System.out.println("Enter your choice \n 1) Addition \n 2) Subtraction \n 3) Multiplication \n 4) Division \n 5) Remainder");
        int choice = sc.nextInt();

        if(choice == 1){
            double add = a+b;
            System.out.println("Addition of both numbers = "+add);
        } else if (choice == 2) {
            double sub = a-b;
            System.out.println("Subtration of both numbers = "+sub);
        } else if (choice == 3) {
            double mul = a*b;
            System.out.println("Multiplication of both numbers = "+mul);
        } else if (choice == 4) {
            double div = a/b;
            System.out.println("Quotient of both numbers = "+div);
        } else if (choice == 5) {
            double mod = a+b;
            System.out.println("Remainder of both numbers = "+mod);
        }else {
            System.out.println("Wrong Option Selected");
        }
        sc.close();










    }
}