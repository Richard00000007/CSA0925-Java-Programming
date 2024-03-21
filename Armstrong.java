import java.util.Scanner;
class Armstrong{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        
        if (sum == originalNumber) {
            System.out.println("Given number is Armstrong number");
        } else {
            System.out.println("Given number is not Armstrong number");
        }
        
        scanner.close();
    }
}
