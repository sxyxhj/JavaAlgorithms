package com.sxyxhj.algorithms;

import java.util.Arrays;

/**
 * @program: JavaAlgorithms
 * @description: 快速排序
 * @author: @sxyxhj
 * @create: 2020-07-05 16:34
 **/
public class QuickSort {
    public static void main(String[] args) {
        int[] a = {9,5,8,4,1,7,3,6,2};
        sort(a,0,a.length-1);
        for (int c: a){
            System.out.println(c);
        }
    }

    private static void sort(int[] a, int leftIndex, int rightIndex) {
         System.out.println(leftIndex +"," +rightIndex);
         System.out.println(Arrays.toString(a));


        if(leftIndex >= rightIndex){
            return;
        }

        int left = leftIndex;
        int right = rightIndex;

        //基准值
        int key = a[left];

        while (left < right){
            //从右往左扫,找到比基准值小的数
            while(right>left && a[right]>=key){
                right--;
            }
            a[left] = a[right];

            //从左往右扫, 找到比基准值大的数
            while(left <right && a[left] <=key){
                left++;
            }
            a[right] = a[left];
        }
        //归位
        a[left] = key;
        //对基准值左边的元素进行递归排序
        sort(a,leftIndex,left-1);
        //对基准值右边的元素进行递归排序
        sort(a,right+1,rightIndex);


    }
}

    
