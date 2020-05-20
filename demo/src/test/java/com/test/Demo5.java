package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo5 {
    public static void main(String[] args) {
        //存储一些数据到集合中
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 50000000; i++) {
            arrayList.add(i);
        }
        //System.out.println("for遍历ArrayList：" + arrayListFor(arrayList));
        System.out.println("Iterator遍历ArrayList：" + arrayListIterator(arrayList));
        DEMO();
    }
    //使用for循环遍历ArrayList
    public static long arrayListFor(List<Integer> arrayList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    //使用Iterator遍历ArrayList
    public static long arrayListIterator(List<Integer> arrayList) {
        long start = System.currentTimeMillis();
        for (Iterator i = arrayList.iterator(); i.hasNext();) {
            i.next();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static void DEMO(){
        long start,end,forStart,forEnd;
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<9000000;i++){
            al.add(new Integer(4));
        }
        Iterator<Integer> it=al.iterator();
        start=System.currentTimeMillis();
        while(it.hasNext()){
            it.next();
        }
        end=System.currentTimeMillis();

        forStart=System.currentTimeMillis();
        for(int j=0;j<al.size();j++){
            al.get(j);
        }
        forEnd=System.currentTimeMillis();


        System.out.println("for用时:"+(forEnd-forStart)+"\nIterator用时:"+(end-start));
    }
}
