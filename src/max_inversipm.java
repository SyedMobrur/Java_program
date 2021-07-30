import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class max_inversipm {

        static long mergeAndCount(int[] arr, int l, int m, int r)
        {
            int[] left = Arrays.copyOfRange(arr, l, m + 1);
            System.out.println("LEFT"+" "+ l + " "+ m + " "+ r);
            for (int num : left){
                System.out.println("!!!" + num);
            }
            int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
            System.out.println("RIGHT");
            for (int num : right){
                System.out.println("!!!" + num);
            }

            int i = 0, j = 0, k = l;
            long swaps = 0;

            while (i < left.length && j < right.length) {
                if (left[i] <= right[j])
                    arr[k++] = left[i++];
                else {
                    arr[k++] = right[j++];
                    swaps += (m + 1) - (l + i);
                }
            }
            while (i < left.length)
                arr[k++] = left[i++];
            while (j < right.length)
                arr[k++] = right[j++];

            System.out.println("Count : " + swaps);

            return swaps;
        }

        static long mergeSortAndCount(int[] arr, int l, int r)
        {System.out.println("Coqure started: -------------");
            for(int i=l;i<=r;i++) {
                System.out.print(i+"th  "+ arr[i]+"  ");
            }
            System.out.println();
            long count = 0;
            System.out.println("value l,r: "+ l+" "+r);
            if (l < r) {
                System.out.println("Left part---bound l,r: "+l+ " "+r);
                int m = (l + r) / 2;
                count += mergeSortAndCount(arr, l, m);
                System.out.println("Right  Part Called");
                count += mergeSortAndCount(arr, m + 1, r);
                System.out.println("Merging called");
                System.out.println(l+"-l "+m+"-m "+r+"-r ");
                count += mergeAndCount(arr, l, m, r);

            }
            return count;
        }

        public static void main (String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int N = sc.nextInt();
//            int A[] =  new int[N];
//            for(int i=0; i<N; i++){
//                A[i] = sc.nextInt();
//            }

            int[] data = {10,40,50,71,80,90,91};
            int N= data.length;
            System.out.println(N);
            long inv_count = mergeSortAndCount(data, 0, N-1);
            System.out.println(inv_count);

        }

}
