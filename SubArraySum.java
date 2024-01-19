public class SubArraySum {
    public static void PrintSubArraySum(int n[])
    {
        int CurSum=0;
        int maxSum=Integer.MIN_VALUE;


        for (int i=0;i<n.length;i++){
            int start=i;
            for(int j=i;j<n.length;j++){
                int end=j;
                CurSum=0;
                for(int k=start;k<=end;k++){
                    CurSum+=n[k];

                }
                System.out.println(CurSum);
                if(maxSum<CurSum){
                    maxSum=CurSum;
                }
            }

        }

        System.out.println("Max Sum =" +maxSum);
    }

    public static void main(String[] args) {
        int n[]={2,5,6,7,8};

        PrintSubArraySum(n);
    }
}
