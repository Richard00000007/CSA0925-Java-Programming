class Adderimplements
{
    private int operand1;
    private int operand2;

    public Adder(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public void run() {
        System.out.println("Addition result: " + (operand1 + operand2));
    }
}

class Subtractor implements Runnable {
    private int operand1;
    private int operand2;

    public Subtractor(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public void run() {
        System.out.println("Subtraction result: " + (operand1 - operand2));
    }
}

class Multiplier implements Runnable {
    private int operand1;
    private int operand2;

    public Multiplier(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public void run() {
        System.out.println("Multiplication result: " + (operand1 * operand2));
    }
}

class Divider implements Runnable {
    private int operand1;
    private int operand2;

    public Divider(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public void run() {
        if (operand2 != 0) {
            System.out.println("Division result: " + ((double) operand1 / operand2));
        } else {
            System.out.println("Division by zero error");
        }
    }
}

public class CalculatorOperations {
    public static void main(String[] args) {
        Thread addThread = new Thread(new Adder(10, 5));
        Thread subtractThread = new Thread(new Subtractor(10, 5));
        Thread multiplyThread = new Thread(new Multiplier(10, 5));
        Thread divideThread = new Thread(new Divider(10, 5));

        addThread.start();
        subtractThread.start();
        multiplyThread.start();
        divideThread.start();
    }
}
