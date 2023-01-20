// Step2 : Create an Implementation file
import java.io.*;
import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
public class CalcImpl extends UnicastRemoteObject implements CalcInter
{
	public CalcImpl()throws Exception
	{
		super();
	}
	public double add(double n1, double n2)throws Exception
	{
		return(n1+n2);
	}
	public double sub(double n1, double n2)throws Exception
	{
		return(n1-n2);
	}
	public double mult(double n1, double n2)throws Exception
	{
		return(n1*n2);
	}
	public double div(double n1, double n2)throws Exception
	{
		return(n1/n2);
	}
}