import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nDisks =sc.nextInt();
        doTowers(nDisks, 'A', 'B', 'C');
    }
    public static void doTowers(int topN, char from, char inter, char to) {
        if (topN == 1) {
            System.out.println("1:"+ from+"->"+ to);
        } else {
            doTowers(topN - 1, from, to, inter);
            System.out.println(topN + ":" + from + "->" + to);
            doTowers(topN - 1, inter, from, to);
        }
    }
}