package org.example.e105;

import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("In:");
        String input= scanner.nextLine();


        for (int i = 0; i <input.length() ; i++) {
            char vowel=input.charAt(i);
            if(vowel=='a'||vowel=='e'||vowel=='i'||vowel=='o'||vowel=='u'){
                System.out.print(vowel);

            }




        }


    }
}
