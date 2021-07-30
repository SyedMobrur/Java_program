import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class Number_Game {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        long N = (scan.nextLong());

        if (N == 1){
            System.out.print(9);
        }
        else{
            System.out.print(gamestrt(N));
        }
    }
    // don't change the name of this class
//

        static int mod = 1000000007;

        static int gamestrt(long N){
            int[][] arr = new int[2][9];
            int x = 0;
            while(x<9){
                arr[0][x] = 1;
                x++;
            }

            arr[1][8] = 1;

            int count=0;
            for(int i=1;i<N;i++)
            {
                for(int j=i;j<=9;j++)
                {
                    for(int k=j;k<=9;k++)
                    {
                        count++;
                    }
                }
            }

            return arr[0][0];

        }



}
