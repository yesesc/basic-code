package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Map {
    public static void main(String[] args) {

        HashMap<String, List<Integer>> map = new HashMap<String, List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0;i<3;i++){
            list.clear();
            int a=1;
            list.add(++a);
            map.put(""+i,list);
        }

        Set<String> keySet = map.keySet();
        for (String s:keySet){
            List<Integer> integers = map.get(s);
            for (Integer num:integers){
                System.out.println(num);
            }
        }
    }


}
