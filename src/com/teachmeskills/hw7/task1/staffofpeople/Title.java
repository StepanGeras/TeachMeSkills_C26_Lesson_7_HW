package com.teachmeskills.hw7.task1.staffofpeople;

public abstract class Title {

    String name;
    String surname;
    int age;

    public Title(String name, String surname, int age){

        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public void jobeTitle() {
    }

    public void workInfo(){
        System.out.print(name + " " + surname + " " + age + " ");
    }

}
