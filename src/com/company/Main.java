package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("введите строку:");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println("строка: "+st);
        System.out.println("развернутая строка: "+stringRevers(st));
        timeCounter(st, 1000);
        timeCounter(st, 10000);
        timeCounter(st, 100000);

    }

    public static StringBuilder stringRevers (String st){
        StringBuilder sb = new StringBuilder(st);
        sb.reverse();
        return sb;}

    public static void timeCounter (String st, int num) {
        long start1 = System.nanoTime();
        for (int i = 0; i < num; i++) {
        stringRevers(st);}
        System.out.println( num +" повторений займет: "+ (System.nanoTime()-start1)+ " нс");

    }

}
