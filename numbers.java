import java.lang.*;
import java.util.*;
class complexnumbers
{
	double real;
	double img;
	complexnumbers(double a,String b)
	{
		this.real=a;
		String x[]=b.split("|i");
		this.img=Integer.parseInt(x[0]);
	}
}
class numbers
{
	static void add(complexnumbers a,complexnumbers b)
	{
           double x=a.real+b.real;
           double y=a.img+b.img;
           System.out.println(x+" + "+y+'i');
	}
	static void subtract(complexnumbers a,complexnumbers b)
	{
		double x=a.real-b.real;
		double y=a.real-b.real;
		System.out.println(x+"+"+y+'i');
	}
	static void multiply(complexnumbers a,complexnumbers b)
	{
		double x=a.real*b.real-a.img*b.img;
		double y=a.real*b.img+a.img*b.real;
		System.out.println(x+"+"+y+'i');
	}
	public static void main(String[] args) 
	{
		complexnumbers a=new complexnumbers(1,"2i");
		complexnumbers b=new complexnumbers(2,"3i");
		System.out.println("Addition of the complexnumbers :");
		add(a,b);
		System.out.println("Subtraction of the complexnumbers :");
		subtract(a,b);
		System.out.println("Multiplication of the complexnumbers :");
		multiply(a,b);

	}
}