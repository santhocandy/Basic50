package org.example;

import java.util.ArrayList;

public class SumOfAllOdd {
    public int oddSum(int []arr){

        int sum = 0;
        for(int num : arr ){
            if(num % 2 != 0){
                sum += num;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        SumOfAllOdd sumOfDigits =
                new SumOfAllOdd();

        int []in1 = {1,2,35,5};
        int input1 = sumOfDigits.oddSum(in1);
        System.out.println(input1);


        int []in2 = {171,2234,3655,5713};
        int input2 = sumOfDigits.oddSum(in2);
        System.out.println(input2);

        int [] in3 = {18,42,35,57,69,72,68,34,59};
        int input3 = sumOfDigits.oddSum(in3);
        System.out.println(input3);

        int [] in4 = {1021,2023,3935,5124,63,5326,6545,3367,856};
        int input4 = sumOfDigits.oddSum(in4);
        System.out.println(input4);
    }
}
