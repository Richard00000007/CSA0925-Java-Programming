public class Overload {
    
    public void assignValues(int value1) {
        System.out.println("Value 1: " + value1);
    }

    public void assignValues(int value1, int value2) {
        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);
    }

    public void assignValues(int value1, int value2, int value3) {
        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);
        System.out.println("Value 3: " + value3);
    }

    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.assignValues(10);
        overload.assignValues(20, 30);
        overload.assignValues(40, 50, 60);
    }
}
