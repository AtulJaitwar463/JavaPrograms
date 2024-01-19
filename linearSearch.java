import java.util.*;

public class linearSearch {
    public static int LinearSearch(int n[],int key)
    {
        for (int i=0;  i<n.length;i++){
            if(n[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n[]={2,4,6,8,10};
        int key=6;
        int index=LinearSearch(n,key);
        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Index no "+index);
        }

    }
}
