import java.util.Scanner;
class Binary{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        String binary = scanner.next();
        int decimal = binaryToDecimal(binary);
        System.out.println("Decimal Number: " + decimal);
        String octal = decimalToOctal(decimal);
        System.out.println("Octal: " + octal);
    }

    public static int binaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return decimal;
    }

    public static String decimalToOctal(int decimal) {
        String octal = Integer.toOctalString(decimal);
        return octal;
    }
}
