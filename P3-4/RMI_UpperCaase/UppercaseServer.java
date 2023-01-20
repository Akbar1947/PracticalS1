import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
class UppercaseServer
{
	public static void main(String args[])throws Exception
	{
		UpprecaseImpl obj = new UpprecaseImpl();
		Naming.rebind("abc",obj);
		System.out.println("Waiting for Client");
	}	
}