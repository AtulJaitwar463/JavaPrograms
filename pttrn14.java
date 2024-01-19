public class pttrn14 {
    public static void main(String[] args) {
        int n = 5;
        int count =1;
        for(int i=1;i<=n;i++){
            
            for(int j=5;j>i;j--){
                System.out.print(" ");   
               
            }   
            for(int k =1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--){
            
            for(int j=5;j>i;j--){
                System.out.print(" ");   
               
            }   
            for(int k =1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
