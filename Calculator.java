import java.util.Scanner;
class Calculator {
    public static void addition () {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("The additon is = " + (a+b));
    }

    public static void substraction () {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("The substraction is = " + (a-b));        
    }

    public static void multiplication () {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        System.out.println("The multiplication is = " + (a*b));
    }

    public static void division () {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        System.out.println("The division is = " + (a/b));
    }
}