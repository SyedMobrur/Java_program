import java.io.*; // for handling input/output
import java.util.*;
public class selection_sort {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
//0
            int min_ind = i;
            for (int j = i + 1; j < n; j++)//1
            {
                if (arr[j] < arr[min_ind])
                {
//                    swap(arr[j], arr[i])
                        min_ind = j;
                }
            }
            int temp=arr[min_ind];
            arr[min_ind]=arr[i];
            arr[i]=temp;

        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.print("Kth Smallest: "+arr[k-1] +" Kth largest: "+arr[n-k]);
    }

//    public static void  swap( int a, int b)
//    {
//        int temp=a;
//        a=b;
//        b=temp;
//    }

}
