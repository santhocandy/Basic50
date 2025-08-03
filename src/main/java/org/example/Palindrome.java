package org.example;

public class Palindrome {

    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        boolean input1 = palindrome.isPalindrome("santhosh");
        System.out.println(input1);

        boolean input2 = palindrome.isPalindrome("madam");
        System.out.println(input2);


        boolean input3 = palindrome.isPalindrome("racecar");
        System.out.println(input3);


        boolean input4 = palindrome.isPalindrome("level");
        System.out.println(input4);


        boolean input5 = palindrome.isPalindrome("java");
        System.out.println(input5);


        boolean input6 = palindrome.isPalindrome("1771");
        System.out.println(input6);

    }
}
