class Fibonaccithread
{
    @Override
    public void run() {
        int n = 10; // Number of terms to display
        int a = 0, b = 1;
        System.out.print("Fibonacci series: ");
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

class ReverseCounter implements Runnable {
    @Override
    public void run() {
        System.out.print("Reverse order: ");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
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
        Thread fibonacciThread = new Thread(new FibonacciThread());
        Thread reverseCounterThread = new Thread(new ReverseCounter());

        fibonacciThread.start();
        reverseCounterThread.start();
    }
}
