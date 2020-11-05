package com.sxyxhj.algorithms;

/**
 * @program: JavaAlgorithms
 * @description: 希尔排序
 * @author: @sxyxhj
 * @create: 2020-07-03 13:16
 **/
public class ShellSort {

    public static void main(String[] args) {
        int[] a = {9,5,8,4,1,7,7,3,6,2};
        sort(a);
        for (int c: a){
            System.out.println(c);
        }
    }

    private static void sort(int[] a) {

        int n  = 1;
        //设定步长为N
        while (n<a.length){
            n= n*3+1;
        }

        while (n>=1){
            //基于插入排序,
            //插入排序是以0开始， 希尔排序以N开始
            //外循环负责以步长N开始的有序区间，内循环负责步长N之前的有序区间
            for(int i =n; i <a.length;i++){
                for(int j = i; j>=n; j = j- n){
                    if(a[j]< a[j-n]){
                        int temp = a[j-n];
                        a[j-n] = a[j];
                        a[j] = temp;
                    }
                }

            }

            n = n/3;
        }

    }
}

    
