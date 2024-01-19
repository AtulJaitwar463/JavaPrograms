public class Recursion2 {
    // public static void towerOfHanoi(int n,String src,String help,String dest){
    //     if(n==1){
    //         System.out.println("transfer disk "+ n +" from "+src+" to "+dest);
    //     }
    //     towerOfHanoi(n-1, src, dest, help);
    //     System.out.println("transfer disk "+ n +" from "+src+" to "+dest);
    //     towerOfHanoi(n-1, help, src, dest);
    // }
        //findthe 1st and last occurance of an element in string


        //Reverse string
    public static void printReverse(String str,int indx){
        if(indx==0){
            System.out.println(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        printReverse(str,indx-1);
    }
    public static void main(String[] args) {
        // int n=1;
        // towerOfHanoi(n, "S", "H", "D");
        String str ="abcd";
        printReverse(str, str.length());
    }
}
