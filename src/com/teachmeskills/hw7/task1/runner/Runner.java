package com.teachmeskills.hw7.task1.runner;

import com.teachmeskills.hw7.task1.staffofpeople.Accountant;
import com.teachmeskills.hw7.task1.staffofpeople.Director;
import com.teachmeskills.hw7.task1.staffofpeople.Worker;
import com.teachmeskills.hw7.task1.staffofpeople.Title;

import java.util.Scanner;

/**
 * Задача 1:
 * Создать классы "Директор", "Рабочий", "Бухгалтер".
 * Реализовать интерфейс с методом, который задает поведения для вывода на экран название должности.
 * Имплементировать этот метод в созданные классы.
 * Создать класс-раннер с методом мейн для запуска программы.
 * Запросить с консоли код должности и вывести название должности на экран.
 */

public record Runner() {

    public static void main(String[] args) {

        Director director = new Director("Alex", "Shrip", 38);
        Worker worker = new Worker("Bob", "Ret", 32);
        Accountant accountant = new Accountant("Alis", "Punor", 28);

        Scanner scan = new Scanner(System.in);
        System.out.println("""
                1. Director
                2. Worker
                3. Accountant
                Enter position code:""");
        int code = scan.nextInt();

        switch (code){
            case 1:
                director.jobeTitle();
                break;
            case 2:
                worker.jobeTitle();
                break;
            case 3:
                accountant.jobeTitle();
                break;
        }

    }

}
