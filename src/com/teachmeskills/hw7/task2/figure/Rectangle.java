package com.teachmeskills.hw7.task2.figure;

import com.teachmeskills.hw7.task2.service.SquareAndPerimeter;

public class Rectangle extends SquareAndPerimeter {

    public int length;
    public int width;

    public Rectangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double Square (){
        return length * width;
    }

    public double Perimeter (){
        return length + width;
    }

}
