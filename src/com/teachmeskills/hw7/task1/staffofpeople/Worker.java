package com.teachmeskills.hw7.task1.staffofpeople;

public class Worker extends Title implements IJobTitle {

    public Worker(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void jobeTitle() {
        System.out.print("Worker ");
        workInfo();
    }

}
