import java.util.*;
class 	SUMOFDIGIT
{
public static void main(String[] args)
{
int sum=0,rem;
Scanner sc=new Scanner(System.in);
System.out.println("enter N value");
int n=sc.nextInt();
System.out.println("enter the " +n+" digit value ");
int n1=sc.nextInt();
while(n1!=0)
{
rem=n1%10;
sum=sum+rem;
n1=n1/10;
}
System.out.println("the sum of digit  value : " +sum);
}
}