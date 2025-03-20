

class Default
{
	void demo()
	{
		System.out.println("Default ");
	}
	
	void demo(int a,int b)
	{
		System.out.println("Two arguments are "+a+" "+b);
	}
	
	void demo(int a,int b,int c)
	{
		System.out.println("three arguemts are "+a+""+b+""+c);
	}

	void demo(int a,int b,int c,String s)
	{
		System.out.println(a+" "+b+" "+c+s);
	}
}


public class Model3 {

	public static void main(String[] args) {
		Default d=new Default();
		//d.demo();
		//d.demo(12,13);
		//d.demo(1,2,3);
		d.demo(1,3,5,"Are Primes");

	}

}
