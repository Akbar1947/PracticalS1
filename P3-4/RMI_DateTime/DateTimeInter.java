import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.util.*;
public interface DateTimeInter extends Remote
{	
	String getDateTime()throws Exception;
}