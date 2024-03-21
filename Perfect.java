import java.util.Scanner;
class Perfect{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        if (sum == number) {
            System.out.println("It’s a Perfect Number");
        } else {
            System.out.println("It’s not a Perfect Number");
        }
        
        scanner.close();
    }
}
