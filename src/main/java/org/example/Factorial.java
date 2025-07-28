package org.example;

public class Factorial {
    public long factorial(int n){
        int i = 1;
        long res = 1;
        while (i <= n){
            res = res * i;
            i++;
        }
        return res;
    }

    public long factorialApproach1(int n){
        if(n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        long input1 = factorial.factorial(5);
        System.out.println(input1);

        long input2 = factorial.factorial(7);
        System.out.println(input2);

        long input3 = factorial.factorial(9);
        System.out.println(input3);

        long input4 = factorial.factorial(13);
        System.out.println(input4);

        long input5 = factorial.factorial(19);
        System.out.println(input5);

        long input6 = factorial.factorial(20);
        System.out.println(input6);

        long in1 = factorial.factorialApproach1(18);
        System.out.println(in1);

        long in2 = factorial.factorialApproach1(12);
        System.out.println(in2);


        // beyond 20! use BigInteger it has no limit but Your RAM HAS
        // so It is Unlimited But it will store to RAM Space size
    }
}
