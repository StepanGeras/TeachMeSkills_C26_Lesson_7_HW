package com.teachmeskills.hw7.task2.run;

import com.teachmeskills.hw7.task2.figure.Circle;
import com.teachmeskills.hw7.task2.figure.Rectangle;
import com.teachmeskills.hw7.task2.figure.Triangle;
import com.teachmeskills.hw7.task2.service.SquareAndPerimeter;


/**
 * Задача 2:
 * Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
 * Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя абстрактный класс/методы).
 * Создать массив из 5 разных фигур.
 * Пройтись циклом по массиву и вывести информацию о каждой фигуре.
 * Вывести на экран сумму периметров всех фигур в массиве.
 */

public class Runner {

    public static void main(String[] args) {

        SquareAndPerimeter[] squareAndPerimeters = new SquareAndPerimeter[5];
        squareAndPerimeters[0] = new Circle("Circle", 1);
        squareAndPerimeters[1] = new Rectangle("Rectangle", 2, 4);
        squareAndPerimeters[2] = new Circle("Circle" ,4);
        squareAndPerimeters[3] = new Rectangle("Rectangle", 4, 6);
        squareAndPerimeters[4] = new Triangle("Triangle",2, 4, 5);

        double sumPerimeter = 0;
        for (SquareAndPerimeter squareAndPerimeter: squareAndPerimeters) {
            System.out.println(squareAndPerimeter.name + " " + squareAndPerimeter.Square() + " " +squareAndPerimeter.Perimeter());
            sumPerimeter += squareAndPerimeter.Perimeter();
        }

        System.out.println("Sum of perimeter " + sumPerimeter);

    }

}
