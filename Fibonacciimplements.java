class Fibonacciimplements
{
    private int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int a = 0, b = 1;
        System.out.print("Fibonacci series for " + n + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
            try {
                Thread.sleep(500); // Add some delay for visualization
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 5; // Sample input
        Thread thread = new Thread(new Fibonacci(n));
        thread.start();
    }
}
