package com.hand.exam3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MapFactory implements Factory {

    Map<Integer, List<Integer>> map;

    public MapFactory() {
        this.map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < 10; i ++) {
            List<Integer> list = new ArrayList<Integer>();
            map.put(i, list);
        }
    }

    public Object create() {
        return  map;
    }

}
