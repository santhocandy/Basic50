package org.example;

import java.util.ArrayList;

public class EvenNumberInArray {
    public ArrayList<Integer>evenNumber(int []arr){
        ArrayList<Integer> even_numbers = new ArrayList<>();
        for(int num : arr){
            if(num % 2 == 0){
                even_numbers.add(num);
            }
        }
        return  even_numbers;
    }

    public static void main(String[] args) {
        EvenNumberInArray evenNumberInArray =
                new EvenNumberInArray();

        int []input1 = {11,12,13,14,15,16,17,18,18,20};
        ArrayList<Integer> inp1 = evenNumberInArray.evenNumber(input1);
        System.out.println(inp1);

        int [] input2 = {111,212,313,414,515,616,717,818,918,1020};
        ArrayList<Integer> inp2 = evenNumberInArray.evenNumber(input2);
        System.out.println(inp2);

        int [] input3 = {101,102,113,104,157,106,172,168,128,208};
        ArrayList<Integer> inp3 = evenNumberInArray.evenNumber(input3);
        System.out.println(inp3);


        int [] input4 = {121,123,163,134,185,116,127,158,188,230};
        ArrayList<Integer> inp4 = evenNumberInArray.evenNumber(input4);
        System.out.println(inp4);


        int [] input5 = {1751,1582,1352,1974,1835,1638,1577,1918,1898,2009};
        ArrayList<Integer> inp5 = evenNumberInArray.evenNumber(input5);
        System.out.println(inp5);
    }
}
