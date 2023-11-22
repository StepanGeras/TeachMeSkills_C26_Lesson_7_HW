package com.teachmeskills.hw7.task1.staffofpeople;

public class Accountant extends Title implements IJobTitle {

    public Accountant(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void jobeTitle() {
        System.out.print("Accountant ");
        workInfo();
    }

}
