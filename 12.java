import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int numberCount = 0;
        
        char ch;
        do {
            System.out.print("Enter a character (* to end): ");
            ch = scanner.next().charAt(0);
            
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            }
        } while (ch != '*');
        
        System.out.println("Uppercase count: " + uppercaseCount);
        System.out.println("Lowercase count: " + lowercaseCount);
        System.out.println("Number count: " + numberCount);
        
        scanner.close();
    }
}
