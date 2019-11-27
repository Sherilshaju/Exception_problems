package exception;

import java.util.Scanner;

public class Examplethrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=10;
		int b=12;
		if(a<b)
		{
			throw new ArithmeticException("B is greater");
		}
		else
		{
			throw new ArithmeticException("A is greater");
		}
	}

}
