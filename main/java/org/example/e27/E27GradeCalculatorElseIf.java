package org.example.e27;

public class E27GradeCalculatorElseIf {
    public static void main(String[] args) {
        // Hint: Declare 'score' as an int and assign 85 to it
        int score=85;

        // Hint: Use if-else if statements to check grades A, B, C, D, F in order
        // Hint: Print the grade using System.out.println()
        if (score<=90-100) {
            System.out.println("Your grade is: A");
        } else if(score>=80-89) {
            System.out.println("Your score is: B ");
        } else if (score>=70-79) {
            System.out.println("Your score is:C");
        } else if (score>=60-69){
            System.out.println("Your grade is:D");
        } else if (score>=0-59){
            System.out.println("Your grade is:F");}


    }


        }

        // Expected output: "Your grade is: B"

