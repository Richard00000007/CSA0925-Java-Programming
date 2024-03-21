import java.util.*;

class Palindrome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Choose option:");
        System.out.println("1. Given string is palindrome or not");
        System.out.println("2. Given number is palindrome or not");
        System.out.print("Enter the choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                String str, rev = "";
                System.out.print("Enter the string: ");
                str = sc.next();
                int n = str.length();
                for (int i = n - 1; i >= 0; i--) {
                    rev = rev + str.charAt(i);
                }
                if (rev.equals(str)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not palindrome");
                }
                break;
            case 2:
                int rem, revn= 0, Num1;
                System.out.print("Enter the number: ");
                Num1 = sc.nextInt();
                int num = Num1;
                while (num != 0) {
                    rem = num % 10;
                    revn = revn * 10 + rem;
                    num = num/10;
                }
                if (Num1 == revn) {
                    System.out.println("It is a palindrome");
                } else {
                    System.out.println("It is not a palindrome");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}