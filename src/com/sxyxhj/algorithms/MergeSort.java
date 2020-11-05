package com.sxyxhj.algorithms;

import java.util.Arrays;

/**
 * @program: JavaAlgorithms
 * @description: 归并排序
 * @author: @sxyxhj
 * @create: 2020-07-04 16:39
 **/
public class MergeSort {

    public static void main(String[] args) {
        int[] a = {9,5,8,4,1,7,3,6,2};
        sort(a,0,a.length-1);
        for (int c: a){
            System.out.println(c);
        }
    }
    // min = 0, max = 数组的长度 - 1,
    private static void sort(int[] a, int start, int end) {
        System.out.println("sort "+ start+", "+end);
        int mid = 0;
        if(start < end){
            mid = (start+end)/2;
            sort(a,start,mid); // 左集合进行递归排序
            sort(a,mid+1,end);//对右集合进行递归排序
            merge(a,start,mid,end);
        }

    }

    private static void merge(int[] a, int start, int mid, int end) {
        System.out.println("merge "+start+", "+mid+", "+end);

        //左边数组的长度
        int n1 = mid - start +1;
        //右边数组的长度
        int n2 = end -mid;

        //创建两个数组，将切割之后数组放进去
        int[] left = new int[n1+1];
        int[] right = new int[n2+1];

        for(int i = 0; i < n1;i++){
            left[i] = a[start+i];

        }
        for(int i = 0; i < n2;i++){
            right[i] = a[mid+1+i];
        }

        left[n1] = Integer.MAX_VALUE;
        right[n2] = Integer.MAX_VALUE;

        //谁小谁放前面

        int i=0,j= 0;

        for(int k = start;k<=end;k++){

            if (left[i]<=right[j]){
                a[k] = left[i];
                i +=1;
            }else{
                a[k] = right[j];
                j +=1;
            }

        }

        System.out.println(Arrays.toString(a));

    }

}

    
