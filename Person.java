package com.company;

public class Person {
    int age;
    int Id;
    String name;
    String email;

    Person(int age, int Id, String name, String email) {
        this.age = age;
        this.Id = Id;
        this.name = name;
        this.email=email;
    }
        public void Details(){
            System.out.println("Age is :"+ age + " " + "The Id is :"+ Id  + " "+"The name is :" + name + " "+"The email is :" + email);
            System.out.println();
        }
    }

