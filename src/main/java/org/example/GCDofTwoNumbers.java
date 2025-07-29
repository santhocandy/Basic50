package org.example;

public class GCDofTwoNumbers {

    public int gcdofnumber(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        GCDofTwoNumbers gcDofTwoNumbers = new GCDofTwoNumbers();

        int input1 = gcDofTwoNumbers.gcdofnumber(12,18);
        System.out.println(input1);


        int input2 = gcDofTwoNumbers.gcdofnumber(12,25);
        System.out.println(input2);


        int input3 = gcDofTwoNumbers.gcdofnumber(12,3);
        System.out.println(input3);


        int input4 = gcDofTwoNumbers.gcdofnumber(185,5);
        System.out.println(input4);


        int input5 = gcDofTwoNumbers.gcdofnumber(7,6);
        System.out.println(input5);

    }
}
