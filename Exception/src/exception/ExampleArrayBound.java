package exception;

import java.util.Scanner;

public class ExampleArrayBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		    try
		    {
		    	int arr[]= {1,3,5,7};
		    	System.out.println(arr[10]);
		    }
		    catch(ArrayIndexOutOfBoundsException e)
		    {
		    	System.out.println(e);
		    }
		
		
		
		
		

	}

}
