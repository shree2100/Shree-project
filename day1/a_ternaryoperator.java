package Assignment1;
import java.util.*;



public class a_ternaryoperator {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("marks obtain");
		int marks=s1.nextInt();
		
		
		String result = (marks >40) ? "Pass" : "Fail";
		System.out.println(result);


	}

}
