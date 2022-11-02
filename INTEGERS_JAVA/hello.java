/**
 * hello
 */
public class hello {
    static int [] ans=new int[100];
    public static void main(String[] args) {
        int []a={12,51,100,212,15,12,7,3,57,300,312,78,19,100,102,101,99,74,0,-5};//ans=3,6
        check(a);
        
    }
    public static String check(int []a) {
        String an="";
        int con=0;
        for (int i = 0; i < a.length-1; i++) {
                if(a[i]>a[i+1]){
                    if(an.contains(a[i]+"")){
                    an+=a[i+1];
                        continue;
                    }else{
                    an+=a[i];
                    an+=a[i+1];
                    }
                }
                if(!(a[i]>a[i+1])){
                    if(an!=""){
                    ans[con++]=Integer.parseInt(an+"");
                    an=""; 
                    }
                }
        }
        System.out.println(con);
        int max=0;
        for (int i = 0; i < con; i++) {
            String val=Integer.toString(ans[i]);
            if(val.length()>max){
                max=val.length();
            }
            System.out.println(ans[i]);
        }
        System.out.println(max);
    return an;
}
}