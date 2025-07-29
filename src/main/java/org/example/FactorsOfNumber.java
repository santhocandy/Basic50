package org.example;

import java.util.ArrayList;
import java.util.List;

public class FactorsOfNumber {
    public List<Integer> factors(int n){

        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        FactorsOfNumber factorsOfNumber = new FactorsOfNumber();

        List<Integer> input1 =  factorsOfNumber.factors(12);
        System.out.println(input1);

        List<Integer> input2 = factorsOfNumber.factors(6);
        System.out.println(input2);

    }
}
