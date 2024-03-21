import java.util.*;
class triangle 
{
public static void main(String args[]) 
{
int b,h,area;   
Scanner s= new Scanner(System.in);
System.out.println("Enter the width of the Triangle:");
b= s.nextInt();
System.out.println("Enter the height of the Triangle:");
h=s.nextInt();
area = (b*h)/2;
System.out.println("Area of Triangle is: " + area);      
}
}