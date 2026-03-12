package com.Assignment_3.mod7;

public class BinarySearchRecursive {
    static int search(int[] arr, int left, int right, int target){

        if(left > right)
            return -1;

        int mid = (left + right)/2;

        if(arr[mid] == target)
            return mid;

        if(target < arr[mid])
            return search(arr,left,mid-1,target);

        return search(arr,mid+1,right,target);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        System.out.println(search(arr,0,arr.length-1,4));
    }
}
