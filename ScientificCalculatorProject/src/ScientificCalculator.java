import java.util.Scanner;
import java.util.InputMismatchException;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            displayMenu();
            System.out.print("Choose an option (0 to exit): ");
            int choice = -1;

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1: performAddition(scanner); break;
                case 2: performSubtraction(scanner); break;
                case 3: performMultiplication(scanner); break;
                case 4: performDivision(scanner); break;
                case 5: performSquareRoot(scanner); break;
                case 6: performPower(scanner); break;
                case 7: performSine(scanner); break;
                case 8: performCosine(scanner); break;
                case 9: performTangent(scanner); break;
                case 10: performNaturalLogarithm(scanner); break;
                case 11: performLogarithmBase10(scanner); break;
                case 12: performAbsoluteValue(scanner); break;
                case 13: performRound(scanner); break;
                case 14: performCeiling(scanner); break;
                case 15: performFloor(scanner); break;
                case 16: performMin(scanner); break;
                case 17: performMax(scanner); break;
                case 0:
                    keepRunning = false;
                    System.out.println("Calculator exited.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("\n Scientific Calculator Menu ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("7. Sine");
        System.out.println("8. Cosine");
        System.out.println("9. Tangent");
        System.out.println("10. Natural Logarithm (ln)");
        System.out.println("11. Logarithm Base 10");
        System.out.println("12. Absolute Value");
        System.out.println("13. Round");
        System.out.println("14. Ceiling");
        System.out.println("15. Floor");
        System.out.println("16. Minimum of two numbers");
        System.out.println("17. Maximum of two numbers");
        System.out.println("0. Exit");
    }


    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
        return a / b;
    }


    public static double calculateSquareRoot(double num) {
        if (num < 0) {
            System.out.println("Cannot calculate square root of a negative number.");
            return Double.NaN;
        }
        return Math.sqrt(num);
    }

    public static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double calculateSine(double degrees) {
        return Math.sin(Math.toRadians(degrees));
    }

    public static double calculateCosine(double degrees) {
        return Math.cos(Math.toRadians(degrees));
    }

    public static double calculateTangent(double degrees) {
        // Handle undefined tangent for 90 + k*180 degrees
        double angle = degrees % 180;
        if (Math.abs(angle - 90) < 1e-10) {
            System.out.println("Tangent undefined at " + degrees + " degrees.");
            return Double.NaN;
        }
        return Math.tan(Math.toRadians(degrees));
    }

    public static double calculateNaturalLogarithm(double num) {
        if (num <= 0) {
            System.out.println("Natural logarithm undefined for zero or negative numbers.");
            return Double.NaN;
        }
        return Math.log(num);
    }

    public static double calculateLogarithmBase10(double num) {
        if (num <= 0) {
            System.out.println("Log base 10 undefined for zero or negative numbers.");
            return Double.NaN;
        }
        return Math.log10(num);
    }

    public static double calculateAbsoluteValue(double num) {
        return Math.abs(num);
    }

    public static long roundNumber(double num) {
        return Math.round(num);
    }

    public static double ceilingNumber(double num) {
        return Math.ceil(num);
    }

    public static double floorNumber(double num) {
        return Math.floor(num);
    }

    public static double findMin(double a, double b) {
        return Math.min(a, b);
    }

    public static double findMax(double a, double b) {
        return Math.max(a, b);
    }

    private static void performAddition(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();
            System.out.println("Result: " + add(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid number input. Please try again.");
            scanner.nextLine();
        }
    }

    private static void performSubtraction(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();
            System.out.println("Result: " + subtract(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid number input. Please try again.");
            scanner.nextLine();
        }
    }

    private static void performMultiplication(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();
            System.out.println("Result: " + multiply(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid number input. Please try again.");
            scanner.nextLine();
        }
    }

    private static void performDivision(Scanner scanner) {
        try {
            System.out.print("Enter numerator: ");
            double a = scanner.nextDouble();
            System.out.print("Enter denominator: ");
            double b = scanner.nextDouble();
            System.out.println("Result: " + divide(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid number input. Please try again.");
            scanner.nextLine();
        }
    }

    private static void performSquareRoot(Scanner scanner) {
        try {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            System.out.println("Square root: " + calculateSquareRoot(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid number input. Please try again.");
            scanner.nextLine();
        }
    }

    private static void performPower(Scanner scanner) {
        try {
            System.out.print("Enter base: ");
            double base = scanner.nextDouble();
            System.out.print("Enter exponent: ");
            double exponent = scanner.nextDouble();
            System.out.println("Result: " + calculatePower(base, exponent));
        } catch (InputMismatchException e) {
            System.out.println("Invalid number input. Please try again.");
            scanner.nextLine();
        }
    }

    private static void performSine(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double degrees = scanner.nextDouble();
            System.out.println("Sine: " + calculateSine(degrees));
        } catch (InputMismatchException e) {
            System.out.println("Invalid number input. Please try again.");
            scanner.nextLine();
        }
    }

    private static void performCosine(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double degrees = scanner.nextDouble();
            System.out.println("Cosine: " + calculateCosine(degrees));
        } catch (InputMismatchException e) {
            System.out.println("Invalid number input. Please try again.");
            scanner.nextLine();
        }
    }

    private static void performTangent(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double degrees = scanner.nextDouble();
            System.out.println("Tangent: " + calculateTangent(degrees));
        } catch (InputMismatchException e) {
            System.out.println("Invalid number input. Please try again.");
            scanner.nextLine();
        }
    }

    private static void performNaturalLogarithm(Scanner scanner) {
        try {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            System.out.println("Natural Logarithm (ln): " + calculateNaturalLogarithm(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid number input. Please try again.");
            scanner.nextLine();
        }
    }

    private static void performLogarithmBase10(Scanner scanner) {
        try {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            System.out.println("Logarithm base 10: " + calculateLogarithmBase10(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid number input. Please try again.");
            scanner.nextLine();
        }
    }

    private static void performAbsoluteValue(Scanner scanner) {
        try {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            System.out.println("Absolute Value: " + calculateAbsoluteValue(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid number input. Please try again.");
            scanner.nextLine();
        }
    }

    private static void performRound(Scanner scanner) {
        try {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            System.out.println("Rounded: " + roundNumber(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid number input. Please try again.");
            scanner.nextLine();
        }
    }

    private static void performCeiling(Scanner scanner) {
        try {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            System.out.println("Ceiling: " + ceilingNumber(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid number input. Please try again.");
            scanner.nextLine();
        }
    }

    private static void performFloor(Scanner scanner) {
        try {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            System.out.println("Floor: " + floorNumber(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid number input. Please try again.");
            scanner.nextLine();
        }
    }

    private static void performMin(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();
            System.out.println("Minimum: " + findMin(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid number input. Please try again.");
            scanner.nextLine();
        }
    }

    private static void performMax(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();
            System.out.println("Maximum: " + findMax(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid number input. Please try again.");
            scanner.nextLine();
        }
    }
}
