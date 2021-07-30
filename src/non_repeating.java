import java.io.*; // for handling input/output
import java.util.*;
public class non_repeating {


        public static void main (String[] args)
        {
            String str="Syedmobrurahmed";
            str=str.toLowerCase();
            int count=0,index=0;
            for(int i=0;i<str.length()-1;i++)
            {
//                System.out.println("I th index: "+str.charAt(i));
                index=i;
                for(int j=0;j<str.length();j++)
                {
//                  System.out.print(str.charAt(j)+" ");
                    if(i==j)
                       continue;

                    if (str.charAt(i)==str.charAt(j))
                    {

                        count++;
//                       System.out.println("If called: "+count);

                    }
                }
//                System.out.println("Out side loop: "+count);
                if(count==0)
            {
                System.out.println("The char is: "+str.charAt(index));


            }
                count=0;

            }
            System.out.println("Not found");
        }



    }
