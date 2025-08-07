package org.example;

import java.util.ArrayList;

public class IntersectionArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,5,6};
        int[] arr1 = {2,3,3,5,6,6,7};
        int[] ans = new int[arr1.length];
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr1.length; j++){
                if(arr[i] == arr1[j] && ans[j] == 0){
                    arrayList.add(arr[i]);
                    ans[j] = 1;
                    break;
                }
                if(arr1[j] > arr[i]) break;
            }
        }
        System.out.println(arrayList);


        ArrayList<Integer> res = new ArrayList<>();
        int i = 0 , j =0;
        while (i < arr.length && j < arr1.length) {

            if (arr[i] < arr1[j]) {
                i++;
            }
            else if (arr[j] > arr[i]) {
                j++;
            }
            if(arr[i] == arr1[j]){
            res.add(arr[i]);
                i++;
                j++;
            }
        }
        System.out.println(res);
    }
}
