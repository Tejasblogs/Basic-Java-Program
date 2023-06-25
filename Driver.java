import java.util.Scanner;
class Driver {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int i = 1;

        while ( i != 5 ) {

            
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int a = sc.nextInt();

            if (a==1) {
                Calculator.addition();
            }
            else if (a==2) {
                Calculator.substraction();
            }
            else if (a==3) {
                Calculator.multiplication();
            }
            else if (a==4) {
                Calculator.division();
            }
            else {
                i = 5;
            }
        }
    }
}