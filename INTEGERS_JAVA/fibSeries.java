import java.util.*;
public class fibSeries {
private static Scanner scan;
	public static void main(String[] args) {
		scan=new Scanner(System.in);
		System.out.print("enter an number: ");
		int n=scan.nextInt();
		System.out.print("0,1");
		int a = 0, b = 1, c=0;

		for (int i = 2; i <= n-1; i++)
		{
		    c = a + b;
		    a = b;
		    b = c;
		    System.out.print(","+c);
		}
	}
}
