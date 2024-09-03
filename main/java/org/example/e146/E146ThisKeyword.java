package org.example.e146;

public class E146ThisKeyword {
    static class Employee{
        private String name;
        private String LastName;
        private int employeeId;
        private String startDate;
        private int salary;

       public  Employee(){
            this.name=null;
            this.LastName=null;
            this.employeeId=0;
            this.startDate=null;
            this.salary=0;

        }
       public Employee(String name, String LastName, int employeeId, String startDate, int salary){
            this.name=name;
            this.LastName=LastName;
            this.employeeId=employeeId;
            this.startDate=startDate;
            this.salary=salary;
        }
       public void printDetails(){
           System.out.println(name+" "+LastName+" "+employeeId+" "+startDate+" "+salary);
       }
    }
    public static void main(String[] args) {
        Employee obj1=new Employee();
        Employee obj2=new Employee("Joe","Smith",12345,"01011970",35000);
        obj1.printDetails();
        obj2.printDetails();

    }
}
