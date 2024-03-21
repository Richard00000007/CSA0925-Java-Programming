import java.util.*;
class athread extends Thread
{
	public void run()
	{
	int rev=0, rem, no;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number");
	no=s.nextInt();
	int x=no;
        while (no != 0) {
            rem = no % 10;
            rev = rev * 10 + rem;
            no = no / 10;
        }
	if(x==rev)
	{
        	System.out.println(x+" is a palindrome ");
	}
	else
	{
        	System.out.println(x+" is not a palindrome ");
	}	
		
	}
}
class bthread extends Thread
{
	public void run()
	{
		String str="malayalam";
		String rev="";
		char ch;
		int n=str.length();
		for(int i=n-1;i>=0;i--)
		{
			ch=str.charAt(i);
			rev=rev+ch;
		}
		if(rev.equals(str))
		{
			System.out.println(str+" is a Palindrome");
		}
		else
		{
			System.out.println(str+" is not a Palindrome");
		}
	}
}
class threadtest
{
	public static void main(String arg[])
	{
		athread p = new athread();
		p.start();
		bthread p1 = new bthread();
		p1.start();		
	}
}
