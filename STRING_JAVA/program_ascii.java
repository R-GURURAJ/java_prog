import java.util.*;
public class program_ascii {
	static Scanner s=new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("enter an string :");
		String ans=s.nextLine();
		for (int i = 0; i < ans.length(); i++) {
			char ss=ans.charAt(i);
			int a=ss;
			System.out.println("index: "+a+" values :"+ss);
		}
		System.out.println("\n\nprime values are :\n");
		for (int i = 0; i < ans.length(); i++) {
			char ss=ans.charAt(i);
			int a=ss;
		int ans2=prime(a);
		if(ans2==0) {
			System.out.println("index: "+a+" values :"+ss);
			}
		}
		
	}
	public static int prime(int a) {
		int r=0;
	for(int i=2;i<a/2;i++) {
		if(a%i==0) {
			r=1;
		}
	}
	return r;
	}

}
