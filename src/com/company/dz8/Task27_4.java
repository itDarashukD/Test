package company.dz8;

import java.util.ArrayList;

public class Task27_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add((int) (Math.random() * 9 + 1));
        }
        list.forEach(System.out::print);
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        list.forEach(System.out::print);
    }
}
