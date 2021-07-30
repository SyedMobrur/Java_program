import java.util.* ; // contains Collections framework
public class Recurssion_Sum {
    public static int sumOfProductOfDigits(int n1, int n2)
    {
        // Your code here
        if(n1==0 && n2==0)
        {
            return 0;
        }
        else
        {
            int l1=n1%10;
            int l2=n2%10;
            return (l1*l2)+sumOfProductOfDigits(n1/10,n2/10);
        }
    }
//    System.out.print("The multiplation of the numer is: " +sumOfProductOfDigits(35,6798));
}
