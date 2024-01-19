import static java.lang.Math.*;

public class binaryTo_Decimal {
    //Binary to Decimal
    public static void binTodec(int binum){
        int pow =0, mynum=binum;
        int dec=0;
        while(binum>0){
            int lastDig = binum%10;
            dec= dec + (lastDig * (int)Math.pow(2, pow));
            pow++;
            binum = binum/10;
        }
        System.out.println("Decimal of "+mynum +"="+dec);
    }
    //Decimal to Binary
    public static void decTobin(int n) {
        int pow = 0, mynum = n;
        int bin = 0;
        int rem = 0;
        while (n > 0) {
            rem = n % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("Binary of " + mynum + "=" + bin);
    }
    public static void main(String[] args) {
        binTodec(111);
        decTobin(9);
    }

}
