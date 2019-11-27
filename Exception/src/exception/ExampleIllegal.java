package exception;

import java.util.Scanner;

public class ExampleIllegal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
		
	    try
	    {
	    	Eg obj=new Eg();
	    	int a=5,b=10;
	    	obj.dis(a,b);
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }

	}

}
class Eg{
	public void dis(int a,int b)
	
	{
		System.out.println("Blaaaaaaaaaaaa");
		
	}
}
