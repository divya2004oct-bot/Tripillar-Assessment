package com.Assignment_3.mod7;


public class FirstLastOccurrence {

    static int first(int[] arr, int x) {

        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == x) {
                result = mid;
                right = mid - 1;
            }
            else if (arr[mid] < x)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return result;
    }

    static int last(int[] arr, int x) {

        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == x) {
                result = mid;
                left = mid + 1;
            }
            else if (arr[mid] < x)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,2,2,3,4,5};
        int x = 2;

        System.out.println("First Occurrence: " + first(arr,x));
        System.out.println("Last Occurrence: " + last(arr,x));
    }
}
