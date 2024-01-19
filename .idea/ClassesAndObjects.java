//package CodingSikho;

class Nokia{
    private int mic;
    private int cam;
    void setvalue(){
        mic =2;
        cam=40;
    }  
    void dislpay(){
        System.out.println(mic);
        System.out.println(cam);
    }
}

public class ClassesAndObjects {

    public static void main(String[] args) {
        Nokia n1  = new Nokia();
       // n1.setvalue();
        //n1.dislpay();//o/p=2,40

        n1.dislpay();
        n1.setvalue();//o/p= 0,0 because by defualt get 0 value


    }
    
}
