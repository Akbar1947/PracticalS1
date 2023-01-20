import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
class UppercaseClient
{
	public static void main(String args[])throws Exception
	{
		UppercaseInter cobj = (UppercaseInter)Naming.lookup("abc");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The String :");
		String str = br.readLine();

		String res = cobj.upprecaseMethod(str);
		System.out.println("Response =" + res);
	}
}