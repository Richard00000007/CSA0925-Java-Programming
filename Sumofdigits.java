import java.util.Scanner;
class Sumofdigits{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N value: ");
        int n = scanner.nextInt();
        System.out.print("Enter " + n + " digit number: ");
        int number = scanner.nextInt();
        int sum = findSumOfDigits(number);
        while (sum > 9) {
            sum = findSumOfDigits(sum);
        }
        System.out.println("Sum of digits: " + sum);
        
        scanner.close();
    }
    private static int findSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
