import java.sql.SQLOutput;
import java.util.Scanner;

public class prog {
    public static void main(String[] args)
    {
        System.out.println("My Name is Mobrur");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements:");

//        int[] arr= new int[n];
//        for(int i=0;i<n;i++)
//        {
//            arr[i]=sc.nextInt();
//        }
        int[] arr={1,-2,5,2,7,7};
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=temp;
        }
        System.out.println("The Array");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
