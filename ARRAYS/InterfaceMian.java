class InterfaceMian
{
	public static void main(String args[])
	{

		SecondImpl first=new SecondImpl();
		first.Add();
		first.Sub();

	}
}

interface First
{
	static final int a=20;
	abstract void Add();
	void Sub();
}

class SecondImpl implements First
{

	public void Add()
	{
		System.out.println("addition is:  "+(a+30));
	}


	public void Sub()
	{
		System.out.println("Subtraction is: "+(100-a));
	}
}