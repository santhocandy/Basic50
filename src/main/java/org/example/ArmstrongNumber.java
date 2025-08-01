package org.example;

public class ArmstrongNumber {
    public boolean isArmstrong(int n){
        int temp = n;
//        int count = 0;
        /*
        while (temp > 0){
            count++;
            temp /= 10;
        }
        temp = n;
         or
        */
        int count = String.valueOf(n).length();

        int res = 0;
        while (n > 0){
            int  rem = n % 10;
            res = (int) (res + Math.pow(rem , count));
            n /= 10;
        }

        return temp == res;
    }
    public static void main(String[] args) {
        ArmstrongNumber armstrongNumber  = new ArmstrongNumber();
        boolean input1 = armstrongNumber.isArmstrong(153);
        System.out.println(input1);

        boolean input2 = armstrongNumber.isArmstrong(370);
        System.out.println(input2);

        boolean input3 = armstrongNumber.isArmstrong(9474);
        System.out.println(input3);


        boolean input4 = armstrongNumber.isArmstrong(187);
        System.out.println(input4);
    }
}
