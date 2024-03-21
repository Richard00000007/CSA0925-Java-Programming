import java.util.Scanner;
 class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of M: ");
        int m = scanner.nextInt();
        System.out.print("Enter value of N: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " x " + m + " = " + (i * m));
        }
        
        scanner.close();
    }
}
