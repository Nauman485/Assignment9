package geekster;
import java.util.*;

public class calculator {
	public static void main(String []args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter number1");
	   int a=sc.nextInt();
	   System.out.println("Enter number2");
	   int b=sc.nextInt();
	   System.out.println("Enter Operation");
	   sc.nextLine();
	   String str1=sc.nextLine();
	   sc.close();
	   String str2="sum";
	   String str3="multiply";
	   if(str1.equals(str2)) {
		   int s=sum(a,b);
		   System.out.println("sum="+s);
	   }
	   if(str1.equals(str3)) {
		   int m=mul(a,b);
		   System.out.println("multiply="+m);
	   }
	}
	public static int sum(int a,int b) {
		return a+b;
	}
	public static int mul(int a,int b) {
		return a*b;
	}

}
