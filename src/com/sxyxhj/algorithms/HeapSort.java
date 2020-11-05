package com.sxyxhj.algorithms;

/**
 * @program: JavaAlgorithms
 * @description: 堆排序
 * @author: @sxyxhj
 * @create: 2020-07-09 21:47
 **/
public class HeapSort {

    public static void main(String[] args) {
        int[] a = {9,5,8,4,1,7,7,3,6,2};
        sort(a);
        for (int c: a){
            System.out.println(c);
        }
    }

    private static void sort(int[] a) {
        int len = a.length;

        //构建一个大顶堆
        buildHeap(a,len);

        for(int i = len-1;i>0;i--){
            //交换最大的和最小的
            swap(a,0, i);

            // 长度-1
            len--;

            //再继续构建
            buildHeap(a,len);
        }

    }
    // 将数组构建成一个堆 --> 大顶堆
    private static void buildHeap(int[] arr,int len){

        //从最后一个非叶子节点开始
        for(int i = len/2; i >=0; i--){

            int parent = arr[i];
            int left = 2*i+1;
            int right = 2*i+2;

            if(left<len){

                if(parent < arr[left]){
                    swap(arr,i,2*i+1);
                }
            }
            if(right<len){
                if(parent < arr[right] ){
                    swap(arr,i,2*i+2);
                }
            }
        }

    }
    private static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

    
