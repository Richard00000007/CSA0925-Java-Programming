import java.util.*;
 class Squares
 {
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 int s;
 System.out.print(" ENTER START RANGE ");
 s=sc.nextInt();
 int e;
 System.out.print(" ENTER END RANGE ");
 e=sc.nextInt();
 int i=0,n=1;
 while(i<e)
 {
 int sum=0;
 int sq=n*n;
 int temp=sq;
 while(sq!=0)
 {
 int rem=sq%10;
 sum=sum+rem;
 sq=sq/10;
 }
 if(sum<10)
 {
 System.out.print(temp+" ");
 }
 i=n*n;
 n++;
 }
 }
}