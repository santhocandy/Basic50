package org.example;

import java.util.Arrays;

public class CharacterCountInAString {
    public void charCount(String s){
        int []arr = new int[26];

        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                char letter = (char)(i + 'a');
                System.out.println(letter + " → " + arr[i]);
            }
        }

        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        CharacterCountInAString characterCountInAString = new CharacterCountInAString();
        characterCountInAString.charCount("santhoshkumar");
    }
}
