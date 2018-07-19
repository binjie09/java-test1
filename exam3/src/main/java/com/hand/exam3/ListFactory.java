package com.hand.exam3;

import java.util.*;

public class ListFactory implements Factory {

    List<Integer> list;

    public ListFactory() {
        list = new ArrayList<Integer>();
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < 50; i ++) {
            list.add(random.nextInt(100));
        }
    }

    public Object create() {
        return list;
    }
}
