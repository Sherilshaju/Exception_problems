package exception;

import java.util.Scanner;

public class ExampleArith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    try
    {
    	int n=30/0;
    }
    catch(ArithmeticException e)
    {
    	System.out.println(e);
    }
	}

}
