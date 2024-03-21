import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        String resultString = removeVowels(inputString);
        
        System.out.println("The string without vowels is: " + resultString);
        
        scanner.close();
    }
    
    public static String removeVowels(String str) {
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";
        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) == -1) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
