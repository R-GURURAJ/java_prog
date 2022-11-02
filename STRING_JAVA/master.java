public class master {
	public static void main(String arg[]) {
        String s1="guru";
        String s2="raj";
        int len=s1.length()+s2.length();
        int res=0,c=0;
        char [] arr=s1.toCharArray();
        char [] brr=s2.toCharArray();
        for(int i=0;i<arr.length;i++) {
            res=0;
        for(int j=0;j<brr.length;j++) {
            if(arr[i]==brr[j]) {
                res=1;
                brr[j]=0;
                break;
            }
        }
        if(res!=0) {
            c++;
        }
        }
            len=len-c*2;
            String val="abcdef";
            int k=len;
            System.out.println(len);
            String strArr[] = new String[6];
            strArr[0] = val; 
        for(int i=0;i<strArr.length-1;i++) {
             strArr[i+1] = getStrArr(k,strArr[i]);
        }
            System.out.println(strArr[5]);
             
         }
    public static String getStrArr(int k,String val) {
        String temp,temp1="",temp2="";
        while(!(k<=val.length())) {
                     k=k-val.length();
              }
                temp1 = val.substring(k,val.length());
                temp2 = val.substring(0,k-1);
                temp = temp1+temp2;
                 return temp;
    }
}


