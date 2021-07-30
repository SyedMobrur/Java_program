import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class matric
{

    // don't change the name of this class
// you can add inner classes if needed

        public static void main (String[] args) {
            // Your code here
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int p=sc.nextInt();
            int m=1000000007;
            int[][] arr=new int[a][a];
            int[][] arr1=new int[a][a];
            int[][] arr2=new int[a][a];
            int[][] c=new int[a][a];
            for(int i=0;i<a;i++){
                for(int j=0;j<a;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<a;j++){
                    System.out.print(arr[i][j]+" ");
                    if(i==j)
                        arr1[i][j]=1;
                    else arr1[i][j]=0;


                }
                System.out.println();
            }
            while(p>0)
            {






                if((p & 1 )!=0) //For Odd
                {
                    for(int i=0;i<a;i++)
                    {
                        for(int j=0;j<a;j++)
                        {
                            arr2[i][j]=0;
                            for(int k=0;k<a;k++)
                            {
                                arr2[i][j]+=arr1[i][k]*arr[k][j];
                            }

                        }
                    }
                    for(int i=0;i<a;i++)
                    {
                        for(int j=0;j<a;j++)
                        {
                            arr1[i][j]=arr2[i][j];
                        }
                    }
                }
                    for(int i=0;i<a;i++)
                    {
                        for(int j=0;j<a;j++)
                        {

                            for(int k=0;k<a;k++)
                            {
                                System.out.print(c[i][j]+=arr[i][k]*arr[k][j]);

                            }
                            System.out.println();

                        }
                    }
                for(int i=0;i<a;i++)
                {
                    for(int j=0;j<a;j++)
                    {
                        arr[i][j]=c[i][j];
                    }
                }

                p=p>>1;


            }

            for(int i=0;i<a;i++){
                for(int j=0;j<a;j++){
                    System.out.print(arr1[i][j]+" ");


                }
                System.out.println();
            }


        }

}


