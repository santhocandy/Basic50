package org.example;

public class PalindromeNumber {

    public boolean palindrome(int n){
        String s = Integer.toString(n);

        int start = 0;
        int end = s.length()-1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }

        return true;
    }

    public boolean palindromeApproach1(int n){
        int res = 0;
        int original = n;
        while (n  > 0){
            res = res * 10 + n % 10;
            n /= 10;
        }
        return original == res;
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        boolean n = palindromeNumber.palindrome(424);
        System.out.println(n);

        boolean input1 = palindromeNumber.palindrome(729);
        System.out.println(input1);

        boolean input2 = palindromeNumber.palindrome(898);
        System.out.println(input2);



        boolean in1 = palindromeNumber.palindromeApproach1(35467);
        System.out.println(in1);


        boolean in2 = palindromeNumber.palindromeApproach1(8537637);
        System.out.println(in2);

        boolean in3 = palindromeNumber.palindromeApproach1(123321);
        System.out.println(in3);


    }
}
