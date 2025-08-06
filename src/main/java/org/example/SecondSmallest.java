package org.example;

public class SecondSmallest {
    public static void main(String[] args) {
        int []arr = {5,8,2,3,9,4,1,6};

        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);

        int smin = Integer.MAX_VALUE;

        for (int j : arr) {
            if (j > min && smin > j) {
                smin = j;
            }
        }
        System.out.println(smin);
    }
}
