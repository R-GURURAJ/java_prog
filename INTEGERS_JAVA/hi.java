/**
* hello
*/
public class hi {
    static int [][] ans=new int[100][100];
    public static void main(String[] args) {
        int []a={12,51,100,212,15,12,7,3,57,300,312,78,19,100,102,101,99,74,0,5};//ans=3,6
        int b=20;
        check(a,b);
        
    }
    public static String check(int []a,int b) {
        Long[]ab=new Long[10];
        String an="";
        int con=0;
        for (int i = 0; i < b-1; i++) {
            if(a[i]>a[i+1]){
            if(an.contains(a[i]+"")){
                an+=a[i+1];
            }
            else{
                an+=a[i];
                an+=a[i+1];
            }
        }
        if(!(a[i]>a[i+1])){
            if(!(an=="")){
            ab[con++]=Long.parseLong(an+"");
            }
            an="";
        }
        }
        for (int i = 0; i < con; i++) {
            System.out.println(ab[i]);
        }
    return an;
}
}
