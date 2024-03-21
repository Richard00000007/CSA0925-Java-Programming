class PrimeCheckerimplement
{
    private int number;

    public PrimeChecker(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        boolean isPrime = isPrime(number);
        if (isPrime) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is not Prime");
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        int number = 5; // Sample input
        Thread thread = new Thread(new PrimeChecker(number));
        thread.start();
    }
}
