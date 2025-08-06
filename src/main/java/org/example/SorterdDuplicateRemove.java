package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SorterdDuplicateRemove {
        public int removeDuplicates(int[] nums) {
//            ArrayList<Integer> a = new ArrayList<>();
            Set<Integer> unique =   new HashSet<>();

            for(int i=0;i < nums.length; i++){
                unique.add(nums[i]);
            }


            int i = 0;
            for(Integer arr : unique){
                nums[i++] = arr;
            }
//            System.out.println(Arrays.toString(nums));
//

            for(int j = 0; j < i; j++)
                System.out.print(nums[j]+" ");

            System.out.println("");
            return unique.size();

            // in sort way we can do like arr[i] != arr[i-1]   int j = 1; arr[j] = arr[i];
        }


    public static void main(String[] args) {
     SorterdDuplicateRemove sorterdDuplicateRemove =
             new SorterdDuplicateRemove();
     int []arr = {0,0,1,2,2,3,4};

     System.out.println(sorterdDuplicateRemove.removeDuplicates(arr));


    }
}
