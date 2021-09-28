package geekster;
import java.util.*;

public class Voting {
	
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age");
		int age=sc.nextInt();
		sc.close();
		boolean flag=vote(age);
		if(flag) {
			System.out.println("Elegible");
		}
		else {
			System.out.println("Not Elegible");
		}
		
	}
	public static boolean vote(int n) {
		if(n>=18) {
			return true;
		}
		else {
			return false;
		}
	}

}
