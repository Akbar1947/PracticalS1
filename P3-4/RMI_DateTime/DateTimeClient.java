import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.util.*;
public class DateTimeClient
{
	public static void main(String args[])throws Exception
	{
		DateTimeInter obj = (DateTimeInter) Naming.lookup("abc");
		String res = obj.getDateTime();
		System.out.println("Current Date and Time :"+ res);
	}
}