// Step4 Create a client file
import java.io.*;
import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
public class CalcClient
{
	public static void main(String args[])throws Exception
	{
		CalcInter obj = (CalcInter) Naming.lookup("calc");

		System.out.println("Enter The TWO Numbers :");
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		
		System.out.println("Addition ="+obj.add(n1,n2));
		System.out.println("Subtraction ="+obj.sub(n1,n2));
		System.out.println("Multiplication ="+obj.mult(n1,n2));
		System.out.println("Division ="+obj.div(n1,n2));
	}
}