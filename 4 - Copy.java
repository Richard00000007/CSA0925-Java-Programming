import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Date (dd/mm/yyyy): ");
        String date = scanner.nextLine();
        String[] parts = date.split("/");
        int year = Integer.parseInt(parts[2]);

        if (isLeapYear(year)) {
            System.out.println("Given year is Leap Year");
        } else {
            System.out.println("Given year is Non Leap Year");
        }
        
        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
