public class SubArray {
    public static void PrintSubArray(int n[])
    {
        int count=0;
        for (int i=0;i<n.length;i++){
            int start=i;
            for(int j=i;j<n.length;j++){
               int end=j;
               for(int k=start;k<=end;k++){
                   System.out.print(n[k]+" ");
               }
                count++;
            }

            System.out.println();
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        int n[]={2,5,6,7,8};

        PrintSubArray(n);
    }
}
