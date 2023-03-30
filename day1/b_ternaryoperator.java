package Assignment1;
import java.util.*;

public class b_ternaryoperator {

	public static void main(String[] args) {
		
		Scanner s1= new Scanner(System.in);
		System.out.print("Enter number :");
		int num=s1.nextInt(); 
		
		String result = num>0 ? "Positive number" : "Negative number";
		System.out.print("This umber is "+result);

	}

}
