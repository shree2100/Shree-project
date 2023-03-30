package Assignment1;
import java.util.*;

public class day4_forloop {

	public static void main(String[] args)
	    {
		System.out.println("What do you want to print");
		Scanner sc=new Scanner(System.in);
		String msg=sc.nextLine();
		System.out.println("How many times do you want to print the message");
		Scanner abc=new Scanner(System.in);
		int no=abc.nextInt();
		
		
		 
		{
			System.out.println("msg:"+msg);
			System.out.println("number is:"+no);
		}
		
		for(int i=1;i<=no;i++)
		{
			System.out.println(msg);
		}
		
			//System.out.println(k);

	}

}
