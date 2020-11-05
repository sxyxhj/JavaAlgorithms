package com.sxyxhj.algorithms;

/**
 * @program: JavaAlgorithms
 * @description: 冒泡排序
 * @author: @sxyxhj
 * @create: 2020-07-02 18:14
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {9,5,8,4,1,7,7,3,6,2};
        sort(a);
        for (int c: a){
            System.out.println(c);
        }
    }

    private static void sort(int[] a) {

        for(int i = 0; i<a.length;i++){
            for(int j = 1; j< a.length;j++){
                if(a[j] < a[j-1]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }

        }

    }
}

    
