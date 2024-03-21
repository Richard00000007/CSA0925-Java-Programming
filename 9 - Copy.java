import java.util.*;

public class CommonElementsInArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 4, 5, 6, 7};
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : arr1) {
            set1.add(num);
        }
        
        for (int num : arr2) {
            set2.add(num);
        }
        
        set1.retainAll(set2);
        
        List<Integer> commonElements = new ArrayList<>(set1);
        
        System.out.println("Common elements:");
        System.out.println(commonElements);
    }
}
