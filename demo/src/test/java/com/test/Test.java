package com.test;

public class Test {
    public static void main(String[] args) {

        String s="萝莉有三好";
        String ss="123456789";

        int i = s.offsetByCodePoints(1,2);
        System.out.println(i);

/*        int leftShift = 10;
        System.out.println("十进制:" + leftShift + ", 二进制:" + Integer.toBinaryString(leftShift));
        int newLeftShift = leftShift << 2;
        System.out.println("左移2位后十进制:" + newLeftShift + ", 左移2位后二进制" + Integer.toBinaryString(newLeftShift)); */   //正整数x左移n位后的十进制结果，x = x * 2^n

        int a= 127&128;
        System.out.println(a);

        char ch='a';
        char c = Character.toUpperCase(ch);
        System.out.println(c);



    }
}
