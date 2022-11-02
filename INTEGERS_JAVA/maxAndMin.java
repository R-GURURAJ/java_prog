import java.util.*;
public class maxAndMin {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("enter the array size:");
		int a=scan.nextInt();
		int arr[]= new int [a];
		
		for(int i=0;i<a;i++){
			arr[i]=scan.nextInt();
		}
		int max=0,min=arr[0];
		for(int i=0;i<a;i++){
			if(arr[i]>max){
			max=arr[i];
			}
			if(min>arr[i]){
				min=arr[i];
			}

		}
		System.out.println("the max element is "+max);
		System.out.println("the min element is "+min);
		
	}

}
