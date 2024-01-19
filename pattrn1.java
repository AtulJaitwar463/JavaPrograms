public class pattrn1 {
    public static void main(String[] args) {
        int n = 5;

        for(int i=0;i<=n;i++){
            for(int j= i;j<=n;j++){//j<=n-i+1
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    
}
