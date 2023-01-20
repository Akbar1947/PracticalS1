import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.util.*;
public class DateTimeServer
{
	public static void main(String args[])throws Exception
	{
		DateTimeImpl obj = new DateTimeImpl();
		Naming.rebind("abc",obj);
		System.out.println("Waiting for client");
	}
}