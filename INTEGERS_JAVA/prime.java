import java.util.Scanner;
public class prime {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int a;
		
		System.out.println("enter an positive number :");
		a=scan.nextInt();
		
		if(a==0 || a==1){
			System.out.println("the given input is not a prime");
		}else {
			for (int i = 2; i <= a / 2;) {
				if (a % i == 0) {
					System.out.println("the given input is not a prime");
					break;
				}else{
					System.out.println("the given input is a prime");
					break;
				}
			}
		}
	}
}

	