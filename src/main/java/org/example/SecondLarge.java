package org.example;

public class SecondLarge{
    public static void main(String[] args) {
        int []arr = {1,2,4,7,7,5};

        int largest = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        System.out.println(largest);

        int slargest = - 1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < largest && arr[i] > slargest){
                slargest = arr[i];
            }
        }

        System.out.println(slargest);

        // optimal solution for it

        int []num = {1,7,3,9,2,5,11};
        int max = arr[0];
        int smax = -1;

        for(int i = 1; i < num.length; i++){
            if(num[i] > max){
                smax = max;
                max = num[i];
            }
            else if(max < num[i] && num[i] > smax){
                smax = num[i];
            }
        }

        System.out.println(max);
        System.out.println(smax);


    }
}
