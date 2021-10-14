package com.company;

public class Student extends Person {
    String course;


    Student(int age, int Id, String name, String email,String course){
        super(age,Id,name,email);

        this.course=course;

    }
    public void printStudent(){
        System.out.println("Student course is :,"+this.course);
        Details();


    }

}
