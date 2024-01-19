public class hello {
    public static void main(String[] args) {
        int i=1,j=0;
        switch (i) {
            case 2:j+=6;
            case 4:j+=6;
            default:j+=2;
            case 0:j+=4;
                
        }
        System.out.print("j ="+j);
    }
    
}
