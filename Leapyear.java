import java.util.*;
class Leapyear
{
public static void main(String arg[])
{
int n=2021;
String result=(n%4==0)?" is leap year":"is not a leap year";
System.out.println(n+" "+result);
}
}