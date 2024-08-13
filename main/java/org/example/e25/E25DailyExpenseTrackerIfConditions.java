package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
        double morningExpenses=50.00;
        double afternoonExpenses=45.50;
        double eveningExpenses=36.00;


        // Calculate total expense
        double totalExpenses=(morningExpenses+afternoonExpenses+eveningExpenses);


        // Define a budget
        double budget=200;
        System.out.println("Your total daily expense is "+ totalExpenses);


        // Check if within budget
        if(budget>totalExpenses){
            System.out.println("You are within the budget");
        }else{
            System.out.println("You are over the budget");
        }


    }
}
