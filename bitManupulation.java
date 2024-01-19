public class bitManupulation {
    public static void main(String[] args) {
        int n= 5;
        int pos=2;
        int opr=1;
        int bitMask=1<<pos;
        //set
        if(opr==1){
        
        int newnumber = bitMask | n;
        System.out.println(newnumber);
        }
        else{
            //clear
            int newbitma=~(bitMask);
            int newnumber =newbitma & n;
            System.out.println(newnumber);

        }
        
        //Clear bit
        // int notbitMask=~(bitMask);
        // int newno=notbitMask & n;

        // System.out.println(newno);
        // //GET bit
        // if((bitMask & n)==0){
        //     System.out.println("Bit was zero");
        // }
        // else
        // {
        //     System.out.println("Bit was one");
        // }

    }
    
}
