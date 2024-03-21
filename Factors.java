import java.util.Scanner;
class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        
        int count = 0;
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                count++;
                if (i != number / i) {
                    count++;
                }
            }
        }
        
        System.out.println("Number of factors = " + count);
        scanner.close();
    }
}
