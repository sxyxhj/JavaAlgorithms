package com.sxyxhj.algorithms;

import java.util.Arrays;

/**
 * @program: JavaAlgorithms
 * @description: 快速排序'
 * @author: @sxyxhj
 * @create: 2020-07-01 21:19
 **/
public class Selection {
    public static void main(String[] args) {
        int[] a = {9,5,8,4,1,7,7,3,6,2};
        sort(a);
        for (int c: a){
            System.out.println(c);
        }

    }
    public static void sort(int[] a){
        int len = a.length;
        for(int i = 0; i<len;i++){
            int min = a[i];
            int index = i;
            for(int j= i+1; j < len;j++){
                if(a[j] < min ){
                    min = a[j];
                    index = j;
                }
            }
            if(min < a[i]){
                a[index] = a[i];
                a[i] = min;
            }
        }
    }
}

    
