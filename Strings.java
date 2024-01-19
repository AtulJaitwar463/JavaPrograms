import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        // String s = sc.next();
        // String name="Atul";

        // //concatination = join the two Strings
        // String name1="Atul";
        // String name2="Jaitwar";
        // String fulname = name1 + " "+name2;
        // System.out.println(fulname);

        // //charAt
        // for (int i=0;i<fulname.length();i++){
        //     System.out.println(fulname.charAt(i));
        // }
        // //compare string
        // //s1>s2 : +ve
        // //s1==s2 : 0
        // //s1<s2 : -ve;

        // if(name.compareTo(name1)==0){
        //     System.out.println("String are equal");
        // }else{
        //     System.out.println("strings are not equal");
        // }

        String sent ="My name is atul";
        String name = sent.substring(1, 4);
        System.out.println(name);

    }

    
}
