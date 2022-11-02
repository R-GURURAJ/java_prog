import java.util.*;
public class shuffle {
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
	//check your test cases here
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
	
//	String sorttt=sortt(str)
	output.add(0,"JAN");
	output.add(1,"FEB");
	output.add(2,"MAR");
	output.add( 3,"APR");
	output.add( 4,"MAY");
	output.add(5,"JNU");
	output.add(6, "JUL");
	output.add( 7,"AUG");
	output.add( 8,"SEP");
	output.add( 9,"OTC");
	output.add( 10,"NOV");
	output.add(11,"DEC");
	
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
	    



// public static void shuf(int num) {
//	     int [] arr=new int[5];
//	     int z=num;
//	     for (int i = 0; i < 4; i++) {
//	         arr[i]=z%10;
//	         z=z/10;
//	     }
//	     Integer[] intArray = {1,2,3,4};

//	     List<Integer> intList = Arrays.asList(intArray);

//	     Collections.shuffle(intList);

//	     intList.toArray(intArray);

//	     System.out.println(Arrays.toString(intArray));
// }