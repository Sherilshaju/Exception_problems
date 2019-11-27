package exception;

import java.util.Scanner;

public class ExampleNullPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    try
	    {
	    	String str=null;
	    	int l=str.length();
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	
	}

}
