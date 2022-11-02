import java.util.Scanner;
public class numOfTerms {
private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int count=0;
		System.out.println("enter an positive number :");
		int n = scan.nextInt();
		while(n!=0){
			n=n/10;
			count++;
		}
		System.out.println("there are "+count+" number of terms");
	}

}
