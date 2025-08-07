package org.example;

import java.util.Arrays;

public class ArrayRotationalByDElement {

    public void rotate(int []arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void swap(int []arr,int d,int n){

       rotate(arr,0,d-1);
       rotate(arr,d,n-1);
        rotate(arr,0,n-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int d = 2;
        d = d % arr.length;
        int n = arr.length;
        ArrayRotationalByDElement arrayRotationalByDElement =
                 new ArrayRotationalByDElement();
       arrayRotationalByDElement.swap(arr,d,n);
        System.out.println(Arrays.toString(arr));
    }
}
