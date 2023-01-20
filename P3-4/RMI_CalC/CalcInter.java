// Step1 : Create an Interface file
import java.io.*;
import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
public interface CalcInter extends Remote
{
	double add(double n1, double n2)throws Exception;
	double sub(double n1, double n2)throws Exception;
	double mult(double n1, double n2)throws Exception;
	double div(double n1, double n2)throws Exception;
}