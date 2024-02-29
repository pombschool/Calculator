import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        double result = 0;
        double num1 = 0;
        double num2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square");
        System.out.println("6. Cube");
        System.out.println("7. Square Root");
        System.out.println("8. Cube Root");
        System.out.println("9. Give Factors");
        System.out.println("Enter operation number for the given operations:");
        int operation = scanner.nextInt();

        switch(operation) {
            case 1:
            System.out.print("Enter number 1: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter number 2: ");
            num2 = scanner.nextDouble();
            System.out.println(returnSum(num1, num2));
            break;
            case 2:
            System.out.println("Enter the numbers in the order you want the operation to be carried out.");
            System.out.print("Enter number 1: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter number 2: ");
            num2 = scanner.nextDouble();
            System.out.println(returnDifference(num1, num2));
        }
    }

    public static String returnSum(double one, double two) {
        double result = one + two;
        return one + " + " + two + " = " + result;
    }

    public static String returnDifference(double one, double two) {
        double result = one - two;
        return one + " - " + two + " = " + result;
    }
}
