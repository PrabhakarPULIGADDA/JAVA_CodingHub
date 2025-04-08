class Abstraction
{
	public static void main(String args[])
	{
		//Parent parent=new child();
		child c=new child();
		System.out.println(c.add());
		System.out.println(c.sub());
		System.out.println(c.mul());
		System.out.println(c.div());	
	}
}


/*
abstract class Parent
{
	abstract void m1();
	void m2()
	{
		System.out.println("im the parent method without abstraction");
	}
}

class child extends Parent
{
	@Override
	void m1()
	{
		System.out.println("Hey im child...implementation of parent abstraction method");
	}

}
*/


abstract class Parent
{
	abstract int a;
		int b;

	Parent()
	{
		a=5;
		b=10;
	}


	int add()
	{
		return a+b;
	}


	abstract int sub();


	int mul()
	{
		return a*b;
	}

}




class child extends Parent
{
	int x,y;

	child()
	{
		x=15;
		y=5;
	}

	int div()
	{
		return x/y;

	}

	@Override
	
	int sub()
	{
		return x-y;
	}
}
	


