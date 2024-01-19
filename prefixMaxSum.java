import static java.lang.Integer.MIN_VALUE;
import java.util.*;
public class prefixMaxSum {
    public static void PrefixSubArraySum(int n[])
    {
        int CurSum=0;
        int maxSum= MIN_VALUE;

        int prefix[] = new int[n.length];
        prefix[0]=n[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + n[i];
        }

        for (int i=0;i<n.length;i++){
            int start=i;
            for(int j=i;j<n.length;j++){
                int end=j;
                CurSum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(maxSum<CurSum){
                    maxSum=CurSum;
                }
            }

        }

        System.out.println("Max Sum =" +maxSum);
    }

    public static  void kadansAlgo(int n[]){
            int ms = MIN_VALUE;
            int cs=0;
            for (int i=0;i<n.length;i++){
                cs+=n[i];
                if(cs<0){
                    cs=0;
                }
                ms=Math.max(cs,ms);
            }
        System.out.println("Our max Subarray sum is "+ms);
    }


    public static void main(String[] args) {
        int n[]={-2,-2,4,-1,-2,1,5,-3};

        PrefixSubArraySum(n);
        kadansAlgo(n);
    }
}
