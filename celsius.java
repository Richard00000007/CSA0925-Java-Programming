import java.util.*;
class celsius
{ 
public static void main(String[] args) 
{ 
int c,f;
Scanner s= new Scanner(System.in);
System.out.println("Enter the celsius:"); 
c=s.nextInt();
f = (c * 9/5) + 32; 
System.out.println(" value of temperature in fahrenheit:"+ f); 
} 
}