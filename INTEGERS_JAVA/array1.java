
import java.util.*;
public class array1 {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("enter the size of the array :");
		int n = scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter the value for element "+i+":");
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.println("the value in the array "+a[i]);
		}

	}

}
