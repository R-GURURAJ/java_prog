import java.util.Scanner;


public class sumOfArray {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.print("enter the size of the array :");
		int n = scan.nextInt();
		int count=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter the value for element "+i+":");
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++){
			count+=a[i];
		}
		System.out.println("the sum of all element in the array is :"+count);
	}



}
