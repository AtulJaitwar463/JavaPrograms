class A{
    int x;
    private static int y;
    void fun1()
    {
        y=22;
    }
    void func2(){
        System.out.println(y);
    }
    void fun3(){
        y=45;
    }
}

public class StaticFunc {
    public static void main(String[] args) {
        A a1=new A();
        A a2= new A();
        a1.fun1();
        a2.fun3();
        a1.fun2();//o/p = 45
    }
}
