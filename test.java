package asjessi;

public class test 
{
	test()
	{
		double r=2.43;
		double area1 = 3.142*r*r;
		System.out.println("AREA OF CIRCLE="+area1);
	}
	test(double l,double b)
	{
		double area2 = l * b;
		System.out.println("AREA OF CIRCLE="+area2);
	}
	public static void main(String[] args) 
	{
		test t1 = new test();
		test t2 = new test(4.3,3.5);
	}

}
