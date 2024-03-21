import java.util.Scanner;

 class Positive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Positive Numbers:");
        printPositiveNumbers(numbers);

        System.out.println("Negative Numbers:");
        printNegativeNumbers(numbers);
    }
    public static void printPositiveNumbers(int[] numbers) {
        for (int number : numbers) {
            if (number > 0) {
                System.out.println(number);
            }
        }
    }

    public static void printNegativeNumbers(int[] numbers) {
        for (int number : numbers) {
            if (number < 0) {
                System.out.println(number);
            }
        }
    }
}
