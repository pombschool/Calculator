import java.util.Scanner;

class Main {
    double result = 0;
    double num1 = 0;
    double num2 = 0;
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Main main = new Main();

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
        int operation = main.scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.println(Addition());
                break;
            case 2:
                System.out.println(Subtraction());
                break;
            case 3:
                System.out.println(Multiplication());
                break;
            case 4:
                System.out.print("Enter number 1: ");
                main.num1 = main.scanner.nextDouble();
                System.out.print("Enter number 2: ");
                main.num2 = main.scanner.nextDouble();
                if (main.num2 != 0) {
                    main.result = main.num1 / main.num2;
                    System.out.print(main.num1 + " / " + main.num2 + " = ");
                    System.out.println(main.result);
                } else {
                    System.out.println("Error: Division by zero.");
                    System.exit(0);
                }
                break;
            case 5:
                System.out.print("Enter the number you want squared: ");
                main.num1 = main.scanner.nextDouble();
                main.result = Math.pow((main.num1), 2);
                System.out.print(main.num1 + " * " + main.num1 + " = ");
                System.out.println(main.result);
                break;
            case 6:
                System.out.print("Enter the number you want cubed: ");
                main.num1 = main.scanner.nextDouble();
                main.result = Math.pow((main.num1), 3);
                System.out.print(main.num1 + " * " + main.num1 + " * " + main.num1 + " = ");
                System.out.println(main.result);
                break;
            case 7:
                System.out.print("Enter the number you want to square root: ");
                main.num1 = main.scanner.nextDouble();
                main.result = Math.sqrt(main.num1);
                System.out.print("sqrt(" + main.num1 + ") = ");
                System.out.println(main.result);
                break;
            case 8:
                System.out.print("Enter the number you want to cube root: ");
                main.num1 = main.scanner.nextDouble();
                main.result = Math.cbrt(main.num1);
                System.out.print("cbrt(" + main.num1 + ") = ");
                System.out.println(main.result);
                break;
            case 9:
                System.out.print("Enter the number you want factors of: ");
                main.num1 = main.scanner.nextDouble();
                for (int i = 1; i <= main.num1; i++) {
                    if ((main.num1 % i) == 0) {
                        String factors = "";
                        factors += "Factors: " + i;
                        System.out.println(factors);
                    }
                }
            default:
                System.out.print("Error");
        }
    }

    public static String Addition() {
        Main main = new Main();

        System.out.print("Enter number 1: ");
        main.num1 = main.scanner.nextDouble();
        System.out.print("Enter number 2: ");
        main.num2 = main.scanner.nextDouble();
        main.result = main.num1 + main.num2;
        return main.num1 + " + " + main.num2 + " = " + main.result;
    }

    public static String Subtraction() {
        Main main = new Main();

        System.out.println("Enter numbers in the order you want to have it be calculated!!");
        System.out.print("Enter number 1: ");
        main.num1 = main.scanner.nextDouble();
        System.out.print("Enter number 2: ");
        main.num2 = main.scanner.nextDouble();
        main.result = main.num1 - main.num2;
        return main.num1 + " - " + main.num2 + " = " + main.result;
    }

    public static String Multiplication() {
        Main main = new Main();

        System.out.print("Enter number 1: ");
        main.num1 = main.scanner.nextDouble();
        System.out.print("Enter number 2: ");
        main.num2 = main.scanner.nextDouble();
        main.result = main.num1 * main.num2;
        return main.num1 + " * " + main.num2 + " = " + main.result;
    }
}