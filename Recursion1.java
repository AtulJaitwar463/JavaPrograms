public class Recursion1 {

    //print x^n (stack height = log2n )
    public static int calcPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return calcPower(x, n/2)*calcPower(x, n/2);
        }
        else
        {
            return calcPower(x, n/2)*calcPower(x, n/2)*x;
        }

        
    }

    //print x^n (stack height = x^n  )
    // public static int calcPower(int x,int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     if(x==0){
    //         return 0;
    //     }

    //     int xPownm1= calcPower(x, n-1);
    //     int xPown = x* xPownm1;
    //     return xPown;
    // }

    // public static void fibonacci(int a,int b,int n){
    //     if(n==0){
    //         return;
    //     }
    //     int c= a+b;
    //     System.out.println(c);
    //     fibonacci(b, c, n-1);
        

    // }
   
    // public static void printsum(int i,int n,int sum){
    //     if(i==n){
    //         sum+=i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum+=i;
    //     printsum(i+1, n, sum);
    // }

    // public static void printnum(int n){
    //     if(n==0){
    //         return;
    //     }
    //     System.out.println(n);
    //     printnum(n-1);
    // }
    public static void main(String[] args) {
       // int n=5;
        //printnum(n);
        //printsum(1, 5, 0);
        //factorial(1, 5, 1);
        // int a=0,b=1;
        // System.out.println(a);
        // System.out.println(b);
        // int n=7;
        // fibonacci(a, b, n-2);

        int x =2, n=5;
        int res =calcPower(x, n);
        System.out.println(res);
    }
    
}
