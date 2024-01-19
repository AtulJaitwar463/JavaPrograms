
import java.util.ArrayList;
public class RotateArray{



        public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
            // Write your code here.
            int [] a = new int[arr.size()];

            for(int i = 0; i<arr.size();i++){
                a[i] = arr.get(i);
            }

            rev(a, 0, k-1);
            rev(a, k, a.length-1);
            rev(a, 0, a.length-1);




            ArrayList<Integer> res = new ArrayList<>();
            for(int i = 0; i<a.length;i++){
                res.add(a[i]);
            }

            return res;
        }

        public static void rev(int [] arr, int j, int k){
            while(j<k){
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                j++;
                k--;
            }
        }




}
