package org.example;

public class MaxFactorialLong {
    public static void main(String[] args) {
        long fact = 1;
        int i = 1;
        while (true) {
            if (Long.MAX_VALUE / fact < (i + 1)) {
                break;
            }
            i++;
            fact *= i;
        }
        System.out.println(i+ "! values = " + fact);
        System.out.println("Max safe factorial for long = " + i); // Should print 20
    }
}