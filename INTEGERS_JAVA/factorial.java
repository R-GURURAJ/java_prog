import java.util.*;
public class factorial {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int a=1;
		System.out.print("enter an number for factorial:");
		int n=scan.nextInt();
		for(int i=n;i>0;i--){
			a*=i;
		}
		System.out.println("the factorial of "+n+" is :"+a);
	}

}
