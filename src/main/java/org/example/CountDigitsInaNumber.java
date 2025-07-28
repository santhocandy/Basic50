package org.example;

public class CountDigitsInaNumber {

    public int countNumber(int n){
        if(n == 0)  return 1;
        int countdigit = 0;
        while (n > 0){
            n = n / 10;
            countdigit++;
        }
        return countdigit;
    }
    public static void main(String[] args) {
        CountDigitsInaNumber countDigitsInaNumber = new CountDigitsInaNumber();

        int input1 = countDigitsInaNumber.countNumber(1);
        System.out.println(input1);


        int input2 = countDigitsInaNumber.countNumber(12);
        System.out.println(input2);


        int input3 = countDigitsInaNumber.countNumber(123);
        System.out.println(input3);


        int input4 = countDigitsInaNumber.countNumber(1234);
        System.out.println(input4);


        int input5 = countDigitsInaNumber.countNumber(12345);
        System.out.println(input5);


        int input6 = countDigitsInaNumber.countNumber(123456);
        System.out.println(input6);

    }
}
