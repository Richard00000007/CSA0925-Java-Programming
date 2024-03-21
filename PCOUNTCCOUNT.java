import java.util.*;
class PCOUNTCCOUNT
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i,j,pcount=0,ccount=0;
System.out.println("enter the size of array");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the array elements ");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
int count=0;
for(j=1;j<=a[i];j++)
{
if(a[i]%j==0)
{ 
count++;
}
}
if(count==2)
{
 pcount++;
}
else
{
ccount++;
}
}
System.out.println("prime number count : " +pcount);
System.out.println("composite number count : "+ccount);
}
}