package Lesson6.polymorphism;


import Lesson6.inheritance.Car;

public class Bicycle extends Motion {
    public Bicycle (String moving){
        super(moving);
    }

    @Override
    public void go() {
        System.out.println("Шарк-Шарк");
    }
}

