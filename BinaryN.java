import java.util.*;

public class BinaryN {
    public static int BinarySearch(int n[],int key)
    {
        int start =0,end = n.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            if(n[mid]==key){
                return mid;
            }
            if(n[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int  n[]={2,3,4,5,6,7,8,9};
        int key=9;
        System.out.println("Index for key : "+BinarySearch(n,key));
    }
}
