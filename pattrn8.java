public class pattrn8 {
    public static void main(String[] args) {
        int n = 5;
        int count =1;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<n;j++) {
                System.out.print(" " + (i + j) % 2);
            }
            System.out.println();
        }
    }
    
}
