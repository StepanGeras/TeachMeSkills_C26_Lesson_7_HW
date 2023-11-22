package com.teachmeskills.hw7.task1.staffofpeople;

public class Director extends Title implements IJobTitle {

    public Director(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void jobeTitle() {
        workInfo();
        System.out.println("Director");
    }

}
