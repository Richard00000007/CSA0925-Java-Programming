class Vehicle
{
	String licenceplate;
	String owner;
}
class Car extends Vehicle
{
	String name="Seltos";
	String Model="KIA";
	String color="Red";
	double price=1800000.00;
	int Tyres=5;
	void display()
	{
		licenceplate="AP12AB8666";
		owner="Mr.Parthasarathy";
		System.out.println("Car Details:");
		System.out.println(owner+" "+licenceplate+" "+name+" "+Model+" "+color+" "+price+" "+Tyres+" ");
	}
}
class MotorCycle extends Vehicle
{
	String name="Jupiter";
	String Model="ZX";
	String color="Green";
	double price=100000.00;
	int Tyres=2;
	void display()
	{
		licenceplate = "AP04CH0876";
		owner = "Ms.Pushpaja";
		System.out.println("Motorcycle Details:");
		System.out.println(owner+" "+licenceplate+" "+name+" "+Model+" "+color+" "+price+" "+Tyres+" ");
	}
}
class Truck extends Vehicle
{
	String name="Bharath Benz";
	String Model="3528C";
	String color="White";
	double price=7000000.00;
	int Tyres=9;
	void display()
	{
		licenceplate = "AP34AD6478";
		owner = "Mr.Jyothish";
		System.out.println("Truck Details:");
		System.out.println(owner+" "+licenceplate+" "+name+" "+Model+" "+color+" "+price+" "+Tyres+" ");
	}
}
class Vehicledisplay
{
 	public static void main(String a[])
 	{
		Car c=new Car();
		MotorCycle MC=new MotorCycle();
		Truck Tr=new Truck();
		c.display();
		MC.display();
		Tr.display();	
 	}
}
