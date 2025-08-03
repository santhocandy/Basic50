package org.example;


import java.util.Arrays;

public class SecondLargestElementArray {

    public int secondLargeElement(int []arr){

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                second = max;
                max = arr[i];
            }else if(arr[i] > second && arr[i] != max){
                second = arr[i];
            }
        }

        return second;
    }

    public static void main(String[] args) {
        SecondLargestElementArray secondLargestElementArray =
                new SecondLargestElementArray();

        int []input1 = {6,2,3,4,5,7};
        int in1 = secondLargestElementArray.secondLargeElement(input1);
        System.out.println(in1);

        int [] input2 = {12,14,18,24,28,32,38,42,47,52,59,61,67,73,78,83,86,91,96,93};
        int in2 = secondLargestElementArray.secondLargeElement(input2);
        System.out.println(in2);

        int [] input3 = {32,18,33,41,54,62};
        int in3 = secondLargestElementArray.secondLargeElement(input3);
        System.out.println(in3);

        int [] input4 = {101,202,323,456,345,276};
        int in4 = secondLargestElementArray.secondLargeElement(input4);
        System.out.println(in4);

    }
}
