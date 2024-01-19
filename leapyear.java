import java.util.Scanner;
//Thiis is leap year program
public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();

        if(year%4==0 || year%100==0 || year%400==0){
            System.out.println("It is aLeap year");
        }
        else{
            System.out.println("It is not a leap year");
        }
    }
    
}
