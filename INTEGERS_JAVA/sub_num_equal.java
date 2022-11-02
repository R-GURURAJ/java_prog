public class sub_num_equal {
    public static void main(String[] args) {
        String a="124753";
        int s=0;
         for (int i = 0; i < a.length(); i++) {
             s+=Integer.parseInt(a.charAt(i)+"");
         }
            s=s/2;
        for (int i = 0; i < a.length(); i++) {
            for (int j = i+1; j < a.length(); j++) {
                for (int j2 = j+1; j2 < a.length(); j2++) {
                    if(((Integer.parseInt(a.charAt(i)+"")+Integer.parseInt(a.charAt(j)+""))+Integer.parseInt(a.charAt(j2)+""))==s){
                        System.out.println((a.charAt(i)+" "+a.charAt(j))+" "+(a.charAt(j2)));
                    }
                }
            }
        }
    }
}
