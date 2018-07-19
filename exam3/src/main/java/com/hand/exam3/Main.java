package com.hand.exam3;

import java.util.List;
import java.util.Map;

public class Main {
    static List<Integer> list = (List<Integer>) new ListFactory().create();
    static Map<Integer, List<Integer>> map = (Map<Integer, List<Integer>>) new MapFactory().create();

    public static void main(String[] args) {

        System.out.println(list.stream().map(n -> map.get(n / 10).add(n)).toArray());

        System.out.print("{");
        for (int i = 0; i < 10; i++) {
            if (!map.get(i).isEmpty()) {
               // quickSort(map.get(i));
            }
            System.out.print(i + "=>" + map.get(i) + " ");
        }
        System.out.println("}");


    }

    public static void quickSort(List<Integer> list) {
        quick(list, 0, list.size() - 1);
        insertSort(list);
    }

    private static void insertSort(List<Integer> list2) {
        for (int i = 1; i < list2.size(); i++) {
            int v = list2.get(i);
            int j = i - 1;
            for (; j >= 0 && list2.get(j) > v; j--) {
                list2.set(j + 1, list.get(j));
            }
            list.set(j + 1, v);
        }
    }

    private static void quick(List<Integer> list, int low, int hight) {
        if (low < hight) {
            int key = partition(list, low, hight);
            if (key - low > 7)
                quick(list, low, key - 1);
            if (hight - key > 7)
                quick(list, key + 1, hight);
        }
    }

    private static int partition(List<Integer> list, int low, int hight) {
        int rand = (int) (Math.random() * (hight - low)) + low;
        int key = list.get(rand);
        if (rand != low) {
            int temp = list.get(low);
            list.set(low, key);
            list.set(rand, temp);
        }
        while (low < hight) {
            while (low < hight && list.get(hight) >= key)
                hight--;
            list.set(low, list.get(hight));
            while (low < hight && list.get(low) <= key) low++;
            list.set(hight, list.get(low));
        }
        list.set(low, key);
        return low;
    }
}