public class operator {
    public static void main(String arg[]){
        // int a=2;
        // int b=5;
        // int c =(a * b / a);
        // int d =(a * ( b / a));
        // System.out.print(c + ",");
        // System.out.print(d);

        // int x=200,y=50,z=100;
        // if(x>y && y>z){
        //     System.out.println("Hello");
        // }
        // if(z>y && z<x){
        //     System.out.println("Java");
        // }
        // if((y+200)<x && (y+150)<z){
        //     System.out.println("Hello Java");
        // }
        // int x,y,z;
        // x=y=z=2;
        // x+=y;
        // y-=z; 
        // z/=(x+y);
        // System.out.println(x + " " + y + " " +z);

        // int x=9,y=12;
        // int a=2,b=4,c=6;
        // int d=4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 +a)) / (a + b * y);
        // System.out.println(d);

        int x=10,y=5;

        int c = (y * (x / y + x / y));
        int d = (y * x / y + y * x / y);
        System.out.println(c + " " + d);

    }
}
