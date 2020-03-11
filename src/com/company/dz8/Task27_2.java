package company.dz8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Task27_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add((int) (Math.random() * 9 + 1));
        }
        list.forEach(System.out::print);
        System.out.println();

        Set<Integer> s = new HashSet<Integer>(list);

        s.forEach(System.out::print);
    }
}




