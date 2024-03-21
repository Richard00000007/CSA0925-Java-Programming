import java.util.Scanner;

public class DecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Decimal Number: ");
        int decimalNumber = scanner.nextInt();
        scanner.close();

        String binaryNumber = Integer.toBinaryString(decimalNumber);
        String octalNumber = Integer.toOctalString(decimalNumber);

        System.out.println("Binary Number = " + binaryNumber);
        System.out.println("Octal = " + octalNumber);
    }
}
