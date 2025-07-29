package org.example;

public class PrimeChecker{
    public boolean primecheck(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0) return false;
        return true;
    }

    public boolean primecheckApproach1(int n){
        if(n < 2) return false;
        for(int i = 2; i * i <= n; i++)
            if(n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        PrimeChecker primeChecker = new PrimeChecker();

        boolean input = primeChecker.primecheck(25);
        System.out.println(input);

        boolean input2 = primeChecker.primecheck(12);
        System.out.println(input2);

        boolean input3 = primeChecker.primecheck(79);
        System.out.println(input3);

        boolean input4 = primeChecker.primecheck(40);
        System.out.println(input4);

        boolean input5 = primeChecker.primecheck(47);
        System.out.println(input5);


        boolean in1 = primeChecker.primecheckApproach1(977);
        System.out.println(in1);

    }
}
