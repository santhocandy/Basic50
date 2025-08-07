package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnionArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,6};
        int[] arr1 = {2,3,4,4,5,6};

        Set<Integer> s = new HashSet<>();

        for(int a : arr)s.add(a);
        for(int a : arr1 ) s.add(a);
        System.out.println(s);
        Set<Integer> set = new HashSet<>();
        int  i = 0 , j = 0;

        while ( i < arr.length && j < arr1.length){
            if(arr[i] < arr1[j]){
                set.add(arr[i]);
                i++;
            }else if(arr[i] > arr1[j]){
                set.add(arr1[j]);
                j++;
            }else {
                set.add(arr1[j]);
                i++;
                j++;
            }
        }
        System.out.println(set);

    }
}
