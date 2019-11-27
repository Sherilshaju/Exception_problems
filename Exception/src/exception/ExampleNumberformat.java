package exception;

import java.util.Scanner;

public class ExampleNumberformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    try
	    {
	    	String str="abc";
	    	int l=Integer.parseInt(str);
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	
	}

}
