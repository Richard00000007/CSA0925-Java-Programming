import java.util.Scanner;
 class PerfectSquareRoot
 {
    public static void main(String[] args)
{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a perfect square number: ");
        int num = scanner.nextInt();
        scanner.close();
        double sqrt = Math.sqrt(num);
        if (num < 0)
 {
            System.out.println("Cannot find square root of a negative number.");
        } 
else if (Math.floor(sqrt) == sqrt) 
{
            System.out.println("Square root of " + num + " is: " + sqrt);
            System.out.println("Negative square root of " + num + " is: " + (-sqrt));
        } 
else
 {
            System.out.println(num + " is not a perfect square number.");
        }
    }
}