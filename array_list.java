import java.util.ArrayList;
import java.util.Collections;
public class array_list
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get particular index element

        int ele = list.get(0);
        System.out.println(ele);

        //add element at perticular index

        list.add(1,33);
        System.out.println(list);

        //remove element

        list.remove(2);
        System.out.println(list);

        //set element

        list.set(2,66);
        System.out.println(list);

        //size of list

        int size = list.size();
        System.out.println(size);

        //sort list

        Collections.sort(list);
        System.out.println(list);

        //print elements by loop

        for(int i =0 ; i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println("\n");
    }
}