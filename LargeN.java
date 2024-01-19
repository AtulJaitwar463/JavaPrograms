import  java.util.*;

public class LargeN {
    public static  int largestN(int n[])
    {
        int large = Integer.MIN_VALUE;
        for(int i=0;i<n.length-1;i++){
            if(large<n[i]){
                large=n[i];
            }
        }
        return large;
    }


    public static void main(String[] args) {
        int n[]={12,4,7,3,2,9};
        System.out.println("Largest No = "+largestN(n));
    }
}
