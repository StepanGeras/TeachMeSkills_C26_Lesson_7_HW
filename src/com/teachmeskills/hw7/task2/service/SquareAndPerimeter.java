package com.teachmeskills.hw7.task2.service;

public abstract class SquareAndPerimeter {

    public String name;

    public SquareAndPerimeter(String name){
        this.name = name;
    }
    public abstract double Square();

    public abstract double Perimeter();

}
