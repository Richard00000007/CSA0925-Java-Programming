import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        Set<Character> uniqueChars = findUniqueCharacters(inputString);
        
        System.out.print("Unique characters in the string: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }
        
        scanner.close();
    }
    
    public static Set<Character> findUniqueCharacters(String str) {
        Set<Character> uniqueChars = new HashSet<>();
        Set<Character> repeatedChars = new HashSet<>();
        
        for (char ch : str.toCharArray()) {
            if (!uniqueChars.contains(ch)) {
                uniqueChars.add(ch);
            } else {
                repeatedChars.add(ch);
            }
        }
        
        uniqueChars.removeAll(repeatedChars);
        
        return uniqueChars;
    }
}
