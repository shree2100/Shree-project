package Assignment1;
import java.util.*;
public class user_inputex {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String msg;
	int count;
	
	System.out.println("enter the message");
	msg=sc.next();
	
	System.out.println("enter how many times do you want to print message");
	count = sc.nextInt();
	
	for ( int i=1;i<=count;i++)
	{	System.out.println(msg);}
	
		

		System.out.println("********End of program*******");
	}
	
 }


