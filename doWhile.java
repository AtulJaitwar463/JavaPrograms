import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        int count=1;
        // do{
        //     System.out.println("Hello");
        //     count++;
        // }while(count<=10);

        Scanner sc = new Scanner(System.in);
//multiple of ten
        // do{
        //     System.out.println("enter ");
        //      int n = sc.nextInt();
        //      if(n%10==0){
        //         break;
        //      }
        //      System.out.println(n);
        // }while(true);

         do{
            System.out.println("enter ");
             int n = sc.nextInt();
             if(n%10==0){
                continue;
             }
             System.out.println(n);
        }while(true);
    }
}
