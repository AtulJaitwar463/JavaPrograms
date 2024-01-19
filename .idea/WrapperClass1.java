/**
 * WrapperClass1
 */
public class WrapperClass1 {

    public static void main(String[] args) {
        int x = Integer.parseInt("123");
        System.out.println(x);

        Integer x1 =Integer.valueOf("1011",2);//binary to decimal convert
        int  y = x1.intValue();
        System.out.println(y); 
        
        Double x2 =Double.valueOf("56");
        double  y1 = x2.doubleValue();
        System.out.println(y1); 
    }
}