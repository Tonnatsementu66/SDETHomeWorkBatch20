package org.example.e140;

public class E140AccessModifiers {
    String maxLength(String [] words){
        String longestWord="";
        for(String word:words){
            if(word.length()>longestWord.length()){
                longestWord=word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        E140AccessModifiers w=new E140AccessModifiers();
        String[] words={"this","is","a","long","word"};
        System.out.println(w.maxLength(words));

    }

}
