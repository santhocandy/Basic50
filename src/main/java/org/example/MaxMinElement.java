package org.example;

import java.util.Arrays;

public class MaxMinElement {
    public int []maxMin(int []numbers){
        int []res = new int[2];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : numbers)
        {
            if(max < num){ max = num;}
            if(min > num){ min = num;}
        }
        res[0] = min;
        res[1] = max;
        return res;
    }
    public static void main(String[] args) {
        MaxMinElement maxMinElement = new MaxMinElement();

        int []in1 = {1,6,345,8,42,6834,2424,2324,7586,4424,9735,2425,6957,9543};
        int []input1 = maxMinElement.maxMin(in1);
        System.out.println(Arrays.toString(input1));

    }
}
