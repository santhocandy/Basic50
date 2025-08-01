package org.example;

public class SumOfFirstNNaturalNumbers {

    public int sumOfNumber(int n){
        int sum = 0;
        for(int i = 1 ; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        SumOfFirstNNaturalNumbers sumOfFirstNNaturalNumbers =
                new SumOfFirstNNaturalNumbers();

       int input =  sumOfFirstNNaturalNumbers.sumOfNumber(5);
        System.out.println(input);


        int input1 =  sumOfFirstNNaturalNumbers.sumOfNumber(15);
        System.out.println(input1);


        int input2 =  sumOfFirstNNaturalNumbers.sumOfNumber(10);
        System.out.println(input2);

        int input3 =  sumOfFirstNNaturalNumbers.sumOfNumber(18);
        System.out.println(input3);
    }
}
