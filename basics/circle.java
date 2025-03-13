package labexperiments;

import java.util.Scanner;
import java.lang.Math;
class circle
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		double radius,area=0,perimeter=0;
		System.out.println("enter the radius");
		radius=obj.nextDouble();
		area=Math.PI*radius*radius;
		perimeter=Math.PI*radius;
		System.out.println("area is "+area);
		System.out.println("perimeter is "+perimeter);
		obj.close();
	}
}
		