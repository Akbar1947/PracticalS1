// Createa Server File
import java.io.*;
import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
public class CalcServer
{
	public static void main(String args[])throws Exception
	{
		CalcImpl obj = new CalcImpl();
		Naming.bind("calc",obj);
		System.out.println("Waiting for Client");
	}
}