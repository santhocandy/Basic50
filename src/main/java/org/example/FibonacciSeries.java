package org.example;

import java.util.Arrays;

public class FibonacciSeries {
    public int []fibonacci(int n){

        int [] arr = new int[n];

        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i < n ; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr;
    }
    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();

        int []input = fibonacciSeries.fibonacci(20);  // 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
        System.out.println(Arrays.toString(input));


        int [] input1 = fibonacciSeries.fibonacci(15);  // 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
        System.out.println(Arrays.toString(input1));

        int [] input2 = fibonacciSeries.fibonacci(18);  // 0 1 1 2 3 5 8 13 21 34 55 89 144 144 233 377 610 987 1597
        System.out.println(Arrays.toString(input2));

        int [] input3 = fibonacciSeries.fibonacci(10);  // 0 1 1 2 3 5 8 13 21 34
        System.out.println(Arrays.toString(input3));

        int [] input4 = fibonacciSeries.fibonacci(7);  // 0 1 1 2 3 5 8
        System.out.println(Arrays.toString(input4));

    }
}
