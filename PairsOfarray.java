public class PairsOfarray {

    public static void PairsPrint(int n[])
    {
        for (int i=0;i<n.length;i++){
            int node=n[i];
            for(int j=i+1;j<n.length;j++){
                System.out.print(node+" "+n[j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n[]={2,5,6,7,8};

        PairsPrint(n);
    }
}
