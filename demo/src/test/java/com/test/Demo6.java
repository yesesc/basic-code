package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo6 {
    public static void main(String[] args) {
        //存储一些数据到集合中
        /*List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 50000000; i++) {
            arrayList.add(i);
        }*/
        System.out.println("for遍历ArrayList：" + arrayListFor(500000000));
        System.out.println("Iterator遍历ArrayList：" + arrayListIterator(500000000+500000000));

    }
    //使用for循环遍历ArrayList
    public static long arrayListFor(int num) {
        long start = System.currentTimeMillis();
        int a=0;
        while (a<num){
            a+=1;
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    //使用Iterator遍历ArrayList
    public static long arrayListIterator(int num) {
        long start = System.currentTimeMillis();
        int a=500000000;
        while (a<num){
            a+=1;
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


}
