public class pattrn9 {
    public static void main(String[] args) {
        int n = 5;
        int count =1;

        //FLOYDY TRIANGLE
        for(int i=1;i<=n;i++){
            
            for(int j=0;j<i;j++){
                System.out.print(" " +count);
                count+=1;
               
            }   
            System.out.println();
        }
    }
    
}
