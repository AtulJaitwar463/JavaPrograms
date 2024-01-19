import java.util.Scanner;

public class array2d{
    public static void main(String[] args) {
        //searching a variable
        Scanner sc = new Scanner(System.in);

        int row=sc.nextInt();
        int colm= sc.nextInt();

        int [][]number = new int[row][colm];

        for(int i=0;i<row;i++){
            for (int j=0;j<colm;j++){
                number[i][j]=sc.nextInt();
            }
        }
        int x = sc.nextInt();//search the number

        for(int i=0;i<row;i++){
            for (int j=0;j<colm;j++){
                if(x==number[i][j]){
                    System.out.println("x found at index "+ i +" "+ j );   
                }
                
            }
        }

    }
}