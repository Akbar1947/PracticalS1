import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
class UpprecaseImpl extends UnicastRemoteObject implements UppercaseInter
{
	public UpprecaseImpl() throws Exception
	{
		super();
	}
	
	public String upprecaseMethod(String str)throws Exception
	{
		String res = str.toUpperCase();
		return res;
	}
}
