package Assignment1;
import java.util.*;

public class ifelse_practice {
	
	public static void main(String[]args)
	{
		Scanner s= new Scanner (System.in);
		System.out.println("enter your department");
		
		int deptno=s.nextInt();
		
		if (deptno==10)
			System.out.println("dept is managment");
		
		else if (deptno==20)
			System.out.println("dept is selling");
		
		else 
			System.out.println("wrong dept");
			
		
		
	}
	
		

	

}
