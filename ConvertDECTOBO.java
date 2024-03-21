import java.util.*;
class ConvertDECTOBO
{
public static void main(String args[])
{
int i=1,bin=0,n,n1,oct=0,rem,rem1,j=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
n1=n;
while(n1!=0)
{
rem=n1%2;
bin=bin+i*rem;
n1=n1/2;
i=i*10;
}
System.out.println("decimal to Binary num is:"+bin);
while(n!=0)
{
rem=n%8;
oct=oct+j*rem;
n=n/8;
j=j*10;
}
System.out.println("decimal to octal num is:"+oct);
}
}