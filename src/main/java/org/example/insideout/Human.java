package org.example.insideout;

import org.example.interfaces.DailyRoutine;
import org.example.interfaces.Feeding;

public class Human extends CharacterInsideOut implements DailyRoutine, Feeding {
    private String rol;

    public Human(String name, int age, String rol) {
        super(name, age);
        this.rol = rol;
    }
@Override
    public String introduce (){
        return "Hola, soy " +super.getName()+ " tengo " + super.getAge()+ " años y mi rol es " + this.rol;
    }


    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public void wakeup() {
        System.out.println("estoy despierto");
    }

    @Override
    public void eat() {
        System.out.println("Hola, soy " +super.getName()+ " y estoy comiendo");

    }

    @Override
    public void sleep() {
        System.out.println("estoy durmiendo");

    }
}
