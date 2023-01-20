import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
interface UppercaseInter extends Remote
{
	String upprecaseMethod(String str)throws Exception;
}