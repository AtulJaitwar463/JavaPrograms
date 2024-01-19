
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();

        //add elements
        List.add(0);
        List.add(1);
        List.add(2);
        List.add(3);
        System.out.println(List);

        //get elements
        int element =List.get(0);
        System.out.println(element);

        //add el in between
        List.add(1, 1);
        System.out.println(List);

        //set element
        List.set(0, 5);
        System.out.println(List);

        //delete element
        List.remove(3);
        System.out.println(List);

        //size
        int size = List.size();
        System.out.println(size);

        //loops
        for(int i=0;i<List.size();i++)
        {
            System.out.println(List.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(List);
        System.out.println(List);

    }
}
