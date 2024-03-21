public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            int[] array = {1, 2, 3};
            int value = array[5];
            String str = null;
            int length = str.length();

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Exception occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
