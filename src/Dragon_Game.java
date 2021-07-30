public class Dragon_Game {
    static void DragonSlayer(int A, int B, int C,int D) {
//Enter your code here
        if (A < 0) {
            System.out.println("1");
            return;

        }
        if(C<0){
            System.out.println("0");
            return;
        }
        DragonSlayer(A-D,B,C-B,D);

    }
    public static void main (String[] args){
        DragonSlayer(8,2,5,3);
    }


}
