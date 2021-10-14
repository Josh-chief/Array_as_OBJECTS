package com.company;

public class Lectures extends Person{

    String office;


    Lectures(int age, int Id, String name, String email,String office) {
        super(age, Id, name, email);

        this.office = office;
    }

        public void printLec(){
            System.out.println("The lectures office is :, "+this.office);
            Details();

        }
    }
