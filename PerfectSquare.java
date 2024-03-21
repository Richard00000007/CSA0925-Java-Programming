import java.util.ArrayList;
import java.util.List;
class PerfectSquare
 {
    public static void main(String[] args)
 {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 100; i++)
 {
            int sqrt = (int) Math.sqrt(i);
            if (sqrt * sqrt == i && digitSum(i) < 10)
 {
                result.add(i);
            }
        }
        System.out.println("Perfect squares with sum of digits less than 10:");
        result.forEach(System.out::println);
    }

    public static int digitSum(int num)
 {
        int sum = 0;
        while (num > 0) 
{
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}