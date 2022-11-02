import java.util.*;

public class shuffel_month {
public static ArrayList<String> output1;
public static ArrayList<String> output= new ArrayList<String>();
public static ArrayList<String> output2;
public static void main(String[] args) {
ArrayList<String> input1 = new ArrayList<String>();
input1.add("1000");
input1.add("3000");
input1.add("J1N2A34");
monthYear (input1 );
//check your test cases here

}
public static ArrayList<String> monthYear( ArrayList<String> input1 ){
String a=input1.get(2);
String num=a.replaceAll("[^0-9]","");
String str= a.replaceAll("[^A-Z]", "");
String sorttt=sortt(str);
int number = Integer.parseInt(num);
output.add(0,"AJN");
output.add(1,"BEF");
output.add(2,"AMR");
output.add( 3,"APR");
output.add( 4,"AMY");
output.add(5,"JNU");
output.add(6, "JLU");
output.add( 7,"AGU");
output.add( 8,"EPS");
output.add( 9,"COT");
output.add( 10,"NOV");
output.add(11,"CDE");

System.out.println(num);
System.out.println(str);
System.out.println(sorttt);
if(output.contains(sorttt)){
    System.out.println(a+" is in array:");
}
String ss=shuffleString(num) ;
System.out.println(ss);


return output2;
}


public static String sortt(String a){
char[] ar = a.toCharArray();
Arrays.sort(ar);
String sorted = new String(ar); 
return sorted;
}
// public static void shuf(int num) {
//     int [] arr=new int[5];
//     int z=num;
//     for (int i = 0; i < 4; i++) {
//         arr[i]=z%10;
//         z=z/10;
//     }
//     Integer[] intArray = {1,2,3,4};

//     List<Integer> intList = Arrays.asList(intArray);

//     Collections.shuffle(intList);

//     intList.toArray(intArray);

//     System.out.println(Arrays.toString(intArray));
// }

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
    
