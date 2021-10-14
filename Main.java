package com.company;

public class Main {

    public static void main(String[] args) {

        Person[] unit = new Person[1];//basic object of person
        Lectures[] lec= new Lectures[1];//basic object of lectures
        Student[] stu= new Student[1];//basic object of students

        //initialization of person object
        unit[0]= new Person(45,145,"Kinuthia","Kinuthia@starthmore.edu");
        //initialization of lecture object
        lec[0] = new Lectures(35,14562,"OOP lec","OOPlec@starthmore.edu","Phase 2 stc");
        //initialization of student object
        stu[0]= new Student(20,3645,"Mugoo","mugo@starhmore.edu","BBIT");

//        This input Details
//        System.out.println("Person Object details :");
//        unit[0].Details();

        System.out.println("lectures Object details :");
        lec[0].printLec();

        System.out.println("Student Object details");
        stu[0].printStudent();

    }
}
