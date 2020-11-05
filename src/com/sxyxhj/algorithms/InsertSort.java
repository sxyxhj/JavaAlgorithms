package com.sxyxhj.algorithms;

/**
 * @program: JavaAlgorithms
 * @description: 插入排序
 * @author: @sxyxhj
 * @create: 2020-07-02 17:25
 **/
public class InsertSort {
    public static void main(String[] args) {
        int[] a = {9,5,8,4,1,7,7,3,6,2};
        sort(a);
        for (int c: a){
            System.out.println(c);
        }
    }

    private static void sort(int[] a) {

        for(int i =1;i <a.length;i++){

            //以部分排序的数组a
            for(int j = i ;j >0 ;j--){
                if(a[j]<a[j-1]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}

    
