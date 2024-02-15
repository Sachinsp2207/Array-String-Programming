package string;

import java.util.*;

public class LinkedList1{
    public static void main(String[] args) {
    
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i <= 9; i++) {
            list.add(i);
        }
        System.out.println("Original linked list: " + list);

        
        Collections.sort(list);
        System.out.println("Linked list sorted in ascending order: " + list);

        List<Integer> sublist = list.subList(1, list.size()-1);
        Collections.sort(sublist, Collections.reverseOrder());
        System.out.println("Linked list sorted in descending order from index 1 to " + (list.size()-2) + ": " + list);
    }
}