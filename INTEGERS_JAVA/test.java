import java.util.Arrays;
public class test {
    public static void main(String[] args) {
        int []a={12,51,100,212,15,12,7,3,57,300,312,78,19,100,102,101,99,74,0,-5};//ans=3,6
        int []c=new int[10];
        int con=1,ocr=0;
        for (int i = 0; i < a.length; i++) {
            con=1;
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]){
                  con++;  
                  i++;
                }else{
                    j=a.length;
                }  
            }
            if(con>1){
                c[ocr]=con;
                ocr++;
            }
        }      
        Arrays.sort(c);
        int max=c[c.length-1];
        System.out.println(ocr+","+max);
    }
}
