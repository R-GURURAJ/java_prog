import java.util.Scanner;
public class spy {
    public static void main(String args[]){
        int num,product=1,sum=0,lastdigit;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=Sc.nextInt();
        while(num>0){
            lastdigit=num%10;
            sum=sum+lastdigit;
            product=product*lastdigit;
            num=num/10;
        }
    
            if(sum==product){
                System.out.println("Its Spy number");
            }
            else{
                System.out.println("Its Not Spy Number");
            }
            Sc.close();
        }
    }

    
