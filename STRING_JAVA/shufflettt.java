import java.util.*;
public class shufflettt {
	static Scanner s= new Scanner(System.in);
	public static ArrayList<String> output1=new ArrayList<String>();
	public static ArrayList<String> output= new ArrayList<String>();
	public static ArrayList<String> output2=new ArrayList<String>();
	static int q=0;
	public static void main(String[] args) {
		
	ArrayList<String> input1 = new ArrayList<String>();
	System.out.println("enter the Starting year:");
	String aa=s.nextLine();
	input1.add(aa);
	System.out.println("enter the ending year:");
	aa=s.nextLine();
	input1.add(aa);
	System.out.println("enter the year and month:");
	aa=s.nextLine();
	input1.add(aa);
	output2.addAll(monthYear (input1 ));

	System.out.println(output2);
	System.out.println(q);

	}
	public static ArrayList<String> monthYear( ArrayList<String> input1 ){
		
	String a=input1.get(2);
	a=a.toUpperCase();
	System.out.println(a);
	String num=a.replaceAll("[^0-9]","");
	String st=input1.get(0);
	String stnum=st.replaceAll("[^0-9]","");
	int startnum = Integer.parseInt(stnum);

	String end=input1.get(1);
	String ennum=end.replaceAll("[^0-9]","");
	int endnum = Integer.parseInt(ennum);
	
	String str= a.replaceAll("[^A-Z]", "");
	
	 String[] year= {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
	  String ch1="";
	  for(int i=0;i<year.length;i++) {
	   String sam=year[i];
	   for(int j=0;j<sam.length();j++) {
	    for(int k=0;k<str.length();k++) {
	     if(str.charAt(k)==sam.charAt(j)) {
	      ch1+=sam.charAt(j);
	     }
	    }
	   }
	   if(ch1.equals(sam)) {
		   str=ch1;
	    break;
	   }
	   else {
	    ch1="";
	   }
	  }
	
	  
	
	HashSet<Integer> arr=new HashSet<>();
	for(int i=0;i<10000;i++) {
		String ss=shuffleString(num) ;
		arr.add(Integer.parseInt(ss));
	}
	q=0;
	for (int i : arr) {
		if(i>startnum&&i<endnum) {
			String hh=String.valueOf(i);
			q++;
			output1.add(str+"/"+hh);
		}
	}
	Collections.sort(output1);
	return output1;
	}


	public static String sortt(String a){
	char[] ar = a.toCharArray();
	Arrays.sort(ar);
	String sorted = new String(ar); 
	return sorted;
	}

	public static String shuffleString(String num)
	{
	  List<String> letters = Arrays.asList(num.split(""));
	  Collections.shuffle(letters);
	  String shuffled = "";
	  for (String letter : letters) {
	    shuffled += letter;
	  }
	  return shuffled;
	}

	
}