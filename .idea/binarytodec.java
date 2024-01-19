//package .idea;

import java.util.Scanner;

public class binarytodec {
    public static void main(String[] args) {
        //int x = 0b1111;
        //System.out.println(x);

        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();
        //int b = sc.nextInt();
        // for(int i=0;i<n;i++){//natural number
            
        //     System.out.println(i);
        // }

        // for(int i=2;i<n;i+=2){//even
            
        //     System.out.println(i);
        // }
        // for(int i=1;i<n;i+=2){//odd number
            
        //     System.out.println(i);
        // }

        // for(int i=-n;i<=n;i++){//whole number
            
        //     System.out.println(i);
        // }

        // for( int i=a;i<b;i++){//range between two number
        //     System.out.println(i);
        // }
            int sum =0;
        for(int i=0;i<a;i++)
        {
            if(a%i==0){
                sum+=i;
            }
        }
        if(a==sum)
        {
            System.out.println("it is Perfect num");
        }
        else{
            System.out.println("It is not perfect num");
        }

        


    }
    
}
