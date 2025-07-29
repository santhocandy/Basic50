package org.example;

import java.util.Arrays;

public class ReverseString {

    public String reverse(String s){
        StringBuilder sb = new StringBuilder(s).reverse();
        return sb.toString();
    }

    public String reverseApproach1(String s){
        String str = "";
        for(int  i  = s.length()-1; i >=0; i--){
            str = str + s.charAt(i);
        }
        return str;
    }

    public String reverseApproach2(String s){
        char[] c = s.toCharArray();
        int start = 0;
        int end = s.length()-1;

        while (start < end){
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
        StringBuilder res = new StringBuilder();
        for (char value : c) res.append(value);

        return res.toString();
    }


    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();

        String input1 = reverseString.reverse("santhosh");
        System.out.println(input1);

        String input2 = reverseString.reverse("Schofield");
        System.out.println(input2);

        String input3 = reverseString.reverse("mansoor");
        System.out.println(input3);

        String input4 = reverseString.reverse("Williams");
        System.out.println(input4);

        String input5 = reverseString.reverse("Michel");
        System.out.println(input5);

        String input6 = reverseString.reverse("robert");
        System.out.println(input6);


        String in1 = reverseString.reverseApproach1("JamesMercury");
        System.out.println(in1);


        String in2 = reverseString.reverseApproach2("Andreas");
        System.out.println(in2);


    }
}
