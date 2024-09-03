package org.example.e134;

public class E134StaticKeyword {
    static int countVovels(String s) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("countVowels(\"obama\")==> "+ countVovels("obama"));
        System.out.println("countVowels(\"happy friday! i love weekends\")==>" + countVovels("happy friday! i love weekends"));

    }
}

