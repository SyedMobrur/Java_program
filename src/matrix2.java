import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class matrix2{
        public static void main (String[] args) {
            // Your code here
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            long p=sc.nextInt();
            long m=1000000007;
//        System.out.println(m);
            int[][] arr=new int[a][a];
            int[][] arr1=new int[a][a];
            int[][] arr2=new int[a][a];
            int[][] arr3=new int[a][a];
            for(int i=0;i<a;i++){
                for(int j=0;j<a;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
//        System.out.println("The original Array: ");
            for(int i=0;i<a;i++){
                for(int j=0;j<a;j++){
//                System.out.print(arr[i][j]+" ");


                }
//            System.out.println();
            }

//        System.out.println("Identity Matrix: ");
            for(int i=0;i<a;i++)
            {

                arr3[i][i] = 1;


            }

//
//            for(int i=0;i<a;i++)
//            {
//                for(int j=0;j<a;j++)
//                {
////                System.out.print(arr3[i][j]+" ");
//
//
//                }
////            System.out.println();
//
//            }

            //End of Identity matrix

            while(p>0)
            {
//            System.out.println("P value :"+p);

                if((p&1)!=0) //For Odd
                {
//                System.out.println("P is ODD :"+p);
                    for(int i=0;i<a;i++)
                    {
                        for(int j=0;j<a;j++)
                        {
                            for(int k=0;k<a;k++)
                            {
//                            arr2[i][j]+=arr1[i][k]*arr[k][j];
                                arr2[i][j]+=((arr3[i][k]%m*arr[k][j]%m)%m);

                                arr2[i][j]%=m;

                            }
//                        System.out.print(arr2[i][j]+" ");


                        }
//                    System.out.println();
                    }

//                System.out.println("Array 2 is coppied to array3");
                    for(int i=0;i<a;i++)
                    {
                        for(int j=0;j<a;j++)
                        {
                            arr3[i][j]=arr2[i][j];
                            arr2[i][j]=0;



                        }


                    }


                }

                //Copying Array


                for(int i=0;i<a;i++)
                {
                    for(int j=0;j<a;j++)
                    {

                        for(int k=0;k<a;k++)
                        {
                            arr1[i][j]+=((arr[i][k]%m*arr[k][j]%m)%m);

                            arr1[i][j]%=m;
                        }
//                    System.out.print(arr1[i][j]+" ");

                    }
//                System.out.println();
                }

                //Clearing Array1
//            for(int i=0;i<a;i++)
//            {
//                for (int j = 0; j < a; j++)
//                {
//
//                }
//            }

                //Coping Original Array
//            System.out.println("Coppied Array: ");
                for(int i=0;i<a;i++)
                {
                    for(int j=0;j<a;j++)
                    {
                        arr[i][j]=arr1[i][j];
                        arr1[i][j]=0;
//                    System.out.print(arr[i][j]+" ");


                    }
//                System.out.println();


                }
//            System.out.println("sq call1 :"+p);
                p=p>>1;
//            System.out.println("sq call2 :"+p);
            }


//        System.out.println("Out put of the Final matrix Matrix: ");
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<a;j++)
                {
                    System.out.print(arr3[i][j]+" ");


                }
                System.out.println();

            }


        }
    }