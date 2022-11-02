import java.util.Scanner;
    public class sec_num {
        static Scanner s=new Scanner(System.in);
        public static void main(String[] args) {
            // System.out.println("enter your secreat number:");
            // int sec=s.nextInt();
            String sec1="123";
            // System.out.println("enter your friends guss number:");
            // int guss=s.nextInt();
            String sec2="0101";
            // String ans="1P0R";
            int uni=0;
            int dif=0;
            // String sec1=Integer.toString(sec);
            // String sec2=Integer.toString(guss);
            int x=sec1.length();
            int y=sec2.length();
            if(x==y){
                for (int i = 0; i < x; i++) {
                        if(sec1.charAt(i)==sec2.charAt(i)){
                            uni++;
                        }else{
                            dif++;
                        }
                    }
            }else{
                int var =x-y;
                var=Math.abs(var);
                if(x>y){
                    for (int i = 0; i < var; i++) {
                        sec2='a'+sec2;
                    }
                    for (int i = 0; i < x; i++) {
                        if(sec1.charAt(i)==sec2.charAt(i)){
                            uni++;
                        }else{
                            dif++;
                        }
                    }
                }else{
                    for (int i = 0; i < var; i++) {
                        sec1='a'+sec1;
                    }
                    for (int i = 0; i < x; i++) {
                        if(sec1.charAt(i)==sec2.charAt(i)){
                            uni++;
                        }else{
                            dif++;
                        }
                    }
                }
            }
            System.out.println(uni+"P"+dif+"R");
            // System.out.println(sec1+" "+sec2);

        }
}