package org.example.e150;

public class E150Inheritance {
    public static class Person{
        private String name;
        private String lastName;
        private int age;
       public Person(String name,String lastName,int age){
           this.name=name;
           this.lastName=lastName;
           this.age=age;
       }
       public String getName(){
       return name;
       }
       public String getLastName(){
           return lastName;
       }
       public int getage(){
           return age;
       }
    }

public static class Employee extends Person{
        private int salary;

public Employee(String name, String lastName, int age,int salary) {
        super(name, lastName, age);
        this.salary=salary;
    }
    public void printEmployeeDetails(){
        System.out.println(getName()+ " " +getLastName()+" "+getage()+" "+salary);
    }

    }

public static class Student extends Employee{
        private int grade;
        public Student(String name, String lastName, int age,int salary, int grade){
            super(name,lastName,age,grade);
            this.grade=grade;

        }


        public void printStudentDetails() {
            System.out.println(getName()+ " " +getLastName()+ " " +getage()+grade);
        }
    }
public static class Retire extends Student{
        private String seniorActivity;
        public Retire(String name, String lastName,int age,int salary,int grade,String seniorActivity){
            super(name,lastName,age,salary,grade);
            this.seniorActivity=seniorActivity;
        }
        public void printRetireDetails(){
            System.out.println(getName()+ " " +getLastName()+ " " +getage()+ " " +seniorActivity );
        }

    }


public static void main(String[] args) {
        Employee e=new Employee("Joe","Smith",35,35000);
        Student s=new Student("Adam","Smith",15,0,10);
        Retire r=new Retire("Frank","Smith",15,0,0,"tour");

        e.printEmployeeDetails();
        s.printStudentDetails();
        r.printRetireDetails();


        }

    }


