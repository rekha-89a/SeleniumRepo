package week3.day2;

public class Calculator {
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
public void mul(double d,double e)
{
	System.out.println(d*e);
}
public void mul(float d , float e)
{
	System.out.println(d*e);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal=new Calculator();
		cal.add(6, 9);
		cal.add(4, 78, 98);
		cal.mul(78.9d, 33.0d);
		cal.mul(6.9f, 99.9f);
		
	}

}
