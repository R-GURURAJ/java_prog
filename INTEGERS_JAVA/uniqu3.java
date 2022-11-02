import java.util.Scanner;


public class uniqu3 {
	private static Scanner scan;
	public static void main(String[] args) {
			scan = new Scanner(System.in);
			System.out.print("enter the size of the array: ");
			int n = scan.nextInt();

			int arr[]=new int[n];
			for(int i=0;i<n;i++){
				
				arr[i]=scan.nextInt();
			}
			for(int i=0;i<n;i++){
				int count=0;
				for(int j=0;j<n;j++){
					if(arr[i]==arr[j]){
						count++;				
					}
				}
				System.out.println("the element "+arr[i]+" appeared "+count+" times");
				
				
			}

			}




	}

