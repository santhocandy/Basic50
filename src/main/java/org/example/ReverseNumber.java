package org.example;

// Reverse a Number
public class ReverseNumber {

    public int reverse(int n){
        int res = 0;
        int temp = n;
        while(temp > 0){
          int rem = temp % 10;
          res = rem + res * 10;
          temp = temp / 10;
        }
        return res;
    }
    public static void main(String[] args) {

        ReverseNumber reverseNumber = new ReverseNumber();

        int input1 = reverseNumber.reverse(123);
        System.out.println(input1);

        int input2 = reverseNumber.reverse(168);
        System.out.println(input2);

        int input3 = reverseNumber.reverse(192);
        System.out.println(input3);
    }
}
