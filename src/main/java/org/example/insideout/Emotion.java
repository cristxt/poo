package org.example.insideout;

import org.example.interfaces.DailyRoutine;

public class Emotion extends CharacterInsideOut implements DailyRoutine {
    private String color;

    public Emotion (String name, int age, String color){
        super(name, age);
        this.color = color;
    }

    @Override
    public String introduce () {
        return "Hi, I'm " +super.getName() + ", mi color es " +this.color + " y tengo " +super.getAge()+ " años";
    }
    public String getColor(){
        return this.color;
    }

    @Override
    public void wakeup() {
        System.out.println("Estoy despierto");
    }

    @Override
    public void sleep() {
        System.out.println("Estoy durmiendo");

    }
}
