public class ArithmeticOperations {
    public static void main(String[] args) {
        int operand1 = 10;
        int operand2 = 0;

        try {
            int addition = operand1 + operand2;
            System.out.println("Addition: " + addition);

            int subtraction = operand1 - operand2;
            System.out.println("Subtraction: " + subtraction);

            int multiplication = operand1 * operand2;
            System.out.println("Multiplication: " + multiplication);

            if (operand2 == 0) {
                throw new ArithmeticException("Division by zero");
            }
            int division = operand1 / operand2;
            System.out.println("Division: " + division);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred: " + e.getMessage());
        }
    }
}
