import java.util.*;
public class mergeArray {
private static Scanner scan;
	public static void main(String[] args) {
	scan=new Scanner(System.in);
	System.out.print("enter the size of the array: ");
	int n=scan.nextInt();
	int array1[]=  new int[n];
	int array2[]=new int[n];
	int total[]=new int[n+n];
	System.out.print("enter the elements of first arrray: ");
	for(int i=0;i<n;i++){
		array1[i]=scan.nextInt();
	}
	System.out.print("enter the elements of second arrray: ");
	for(int i=0;i<n;i++){
		
		array2[i]=scan.nextInt();
	}
	for(int i=0;i<n;i++){
		
		total[i]=array1[i];
	}for(int j=0;j<n;j++ ){
		
		total[n+j]=array2[j];
	}
	System.out.print("the elements in merge array :");
	for(int i=0;i<n+n;i++){
		
		System.out.print(total[i]+" ");
	}
	
	}

}
