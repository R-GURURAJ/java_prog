import java.util.Scanner;
public class copyAnArray {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("enter the size of the array :");
		int n = scan.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter the value for element "+i+":");
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.println("the element in array a "+a[i]);
			
		}
		for(int i=0;i<n;i++){
			b[i]=a[i];
		}
		System.out.println("");

		for(int i=0;i<n;i++){
			System.out.println("the element in array b "+a[i]);
			
		}


	}

}
