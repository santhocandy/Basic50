package org.example;

public class SumOfDigits {

    public int sumofdigit(int n){
        int sum = 0;
        while (n > 0){
            sum = sum + n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();

        int input1  =sumOfDigits.sumofdigit(1234);
        System.out.println(input1);

        int input2 =sumOfDigits.sumofdigit(789);
        System.out.println(input2);

        int input3 =sumOfDigits.sumofdigit(424);
        System.out.println(input3);

        int input4 =sumOfDigits.sumofdigit(528);
        System.out.println(input4);

        int input5 =sumOfDigits.sumofdigit(90870934);
        System.out.println(input5);

    }
}
