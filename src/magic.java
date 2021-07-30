
import java.util.*;
public class magic
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long n=sc.nextLong(); // IF dont work replace long by int;
        long temp=n;
        while(temp>0){
            if(temp%1000==144){
                temp=temp/1000;
            }
            else if(temp % 100 ==14)  temp=temp/100;
            else if (temp%10==0) temp=temp/10;

            else {
                temp=1;
                System.out.println("NO");
                return;
            }

        }
        System.out.println("YES");

    }
}
