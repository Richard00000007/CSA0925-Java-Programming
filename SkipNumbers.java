import java.util.Scanner;
 class SkipNumbers
 {
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number M: ");
        int M = scanner.nextInt();
        System.out.print("Enter the ending number N: ");
        int N = scanner.nextInt();System.out.print("Enter the number of skips K: ");
        int K = scanner.nextInt();
        System.out.println("Numbers from " + M + " to " + N + " skipping " + K + " numbers in between:");
        printNumbersWithSkips(M, N, K);
         scanner.close();
    }

    public static void printNumbersWithSkips(int start, int end, int skip)
 {
        for (int i = start; i <= end; i += skip + 1)
 {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}