public class power_without_str {
    public static void main(String[] args) {
        int x=4,y=3;
        int sum=0,t=y;
        while(t!=-1){
            sum+=man(y,x);
            t--;
        }
        System.out.println(sum);
    }
    public static int man(int y,int x) {
        int sum=0;
        while(y!=-1){
            sum+=x;
            y--;
        }
        return sum;
    }
}
