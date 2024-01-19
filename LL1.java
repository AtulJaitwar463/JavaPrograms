
import java.util.*;
public class LL1
{
    public static void main(String[] args) {

        //collection framework
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("this");
        list.addLast("list");
        System.out.println(list);
        System.out.println(list.size());

        list.removeFirst();
        list.remove(3);
        System.out.println(list);

        

    }

}
