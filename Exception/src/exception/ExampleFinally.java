package exception;

import java.util.Scanner;

public class ExampleFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
	    try
	    {
	    	int arr[]= {1,3,5,7};
	    	System.out.println(arr[10]);
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	finally
	{
		System.out.println("Program closed");
	}

	}

}
