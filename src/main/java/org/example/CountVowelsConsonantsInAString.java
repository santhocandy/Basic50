package org.example;

public class CountVowelsConsonantsInAString {

    public void count(String str){
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase();
        char []c = str.toCharArray();
        for (char value : c) {
            if (Character.isLetter(value)) {
                if (value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = "+ consonants);
    }

    public static void main(String[] args) {
        CountVowelsConsonantsInAString countVowelsConsonantsInAString =
                new CountVowelsConsonantsInAString();

        countVowelsConsonantsInAString.count("HelloA");
    }
}
