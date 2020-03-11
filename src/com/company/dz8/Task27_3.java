package company.dz8;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Task27_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add((int) (Math.random() * 9 + 1));
        }
        list.forEach(System.out::print);
        System.out.println();

        list = (ArrayList<Integer>) list.stream().distinct().collect(Collectors.toList());
        list.forEach(System.out::print);
    }}
