import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class contest {

    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
//        String str = System.console().readLine();
        String str= sc.next();
//        System.out.println(str);
//        String str=Integer.toString(str);
        int sum=0;
        for(int i=0 ;i <n-k+1;i++)
        {
            int zero=0,one=0;
            for(int j=i; j<i+k;j++)
            {
                char c=str.charAt(j);
                char s='1';
                if(c == s)
                    one++;
                else
                    zero++;
            }
            if(zero>=one)
            {
                sum+=1;
            }
            zero=0;one=0;
        }
        System.out.print(sum);
    }
}
