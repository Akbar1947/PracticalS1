import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.util.*;

public class DateTimeImpl extends UnicastRemoteObject implements DateTimeInter
{
	public DateTimeImpl()throws Exception
	{
		super();
	}	
	public String getDateTime()throws Exception
	{
		Date d = new Date();
		return d.toString();
	}
}