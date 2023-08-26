/* Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3).
 Search for the number 7 & display its index. */

import java.util.*;

public class LinkedLists {

    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(7);
        list.add(8);
        list.add(7);
        list.add(3);
        list.add(7);
        list.add(7);
        System.out.println(list);

        for (int i = 0; i <= list.size(); i++) {
            // System.out.println(list.get(i));

            if (list.get(i) == 7) {
                System.out.println(i);

            }

        }
    }

}
