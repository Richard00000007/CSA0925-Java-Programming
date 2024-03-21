import java.util.*;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element" + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        
        Set<Integer> set = new HashSet<>();
        List<Integer> nonDuplicates = new ArrayList<>();
        
        for (int num : arr) {
            if (!set.contains(num)) {
                nonDuplicates.add(num);
                set.add(num);
            }
        }
        
        System.out.println("Non-duplicate items:");
        System.out.println(nonDuplicates);
        
        scanner.close();
    }
}
