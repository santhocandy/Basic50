package org.example;

import java.util.Arrays;

public class MoveZeroAtEnd {
    public static void main(String[] args) {

        int []arr = {1,0,2,3,2,0,0,4,5,1};
        int[] temp = new int[arr.length];
        int j = 0;

        for (int k : arr) {
            if (k != 0) {
                temp[j] = k;
                j++;
            }
        }

        System.arraycopy(temp, 0, arr, 0, arr.length);
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(arr));
    }
}
