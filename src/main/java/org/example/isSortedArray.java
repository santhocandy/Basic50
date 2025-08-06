package org.example;

public class isSortedArray {
    public boolean isSorted(int []arr){
        for(int i = 1 ; i < arr.length; i++){
            if(arr[i] >= arr[i-1]){

            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int []arr = {1,2,2,3,4,5,6,7,8,8,9};
        int []a = {1,2,3,6,5,7,8};
        isSortedArray isSortedArray = new isSortedArray();
        System.out.println(isSortedArray.isSorted(arr));
        System.out.println(isSortedArray.isSorted(a));
    }
}
