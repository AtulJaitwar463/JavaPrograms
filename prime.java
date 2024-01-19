import java.util.Scanner;
import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        boolean isprime =true;

        for (int i=2;i<=n-1;i++){
            if(n%i==0){
                isprime=false;
            }

        }
        if(isprime==true){
            System.out.println("it is prime");
        }
        else{
            System.out.println("It is not prime");
        }
    }
}
