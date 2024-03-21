class athread implements Runnable
{
	public void run()
	{
		for(int i = 1; i<=5; i++) 
		{
			System.out.println(i+" X 7 = "+i*7);
		}		
	}
}
class bthread implements Runnable
{
	public void run()
	{
		for(int i = 1; i<=5; i++) 
		{
			System.out.println(i+" X 9 = "+i*9);
		}
	}
}
class multithreadtest1
{
	public static void main(String arg[])
	{
		athread a = new athread();
		Thread t1=new Thread(a);
		bthread b = new bthread();
		Thread t2=new Thread(b);
		t1.start();
		t2.start();		
	}
}
