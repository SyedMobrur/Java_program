public class Shift_Array {
    public static int[] rotate(int arr[], int n, int d){
//enter your code here
        if(d==0)
        {

            return arr;

        }
        int temp=arr[0];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        return rotate(arr,arr.length,d-1);

    }
    public static void main (String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10,32,3,3,2,2,3,4,6,7,4,2,4,5,4,4,412,21,221,221,12,1,2,31,23,231,34,5,567,67,678,78,879,2,1,122,};
        arr=rotate(arr,arr.length,31);
        for(int r:arr){
            System.out.print(r+" ");
        }
    }


}
