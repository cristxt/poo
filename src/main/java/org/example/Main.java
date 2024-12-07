package org.example;

import org.example.insideout.CharacterInsideOut;
import org.example.insideout.Emotion;
import org.example.insideout.Human;

public class Main {
    public static void main(String[] args) {
        Emotion alegria = new Emotion("Alegría", 13, "amarillo");
        System.out.println(alegria.introduce());
        System.out.println(alegria.getColor());

        Emotion tristeza = new Emotion ("Tristeza", 13, "azul");
        System.out.println(tristeza.introduce());
        System.out.println(tristeza.getColor());

        Human rilley = new Human("Rilley", 13, "personaje principal");
        System.out.println(rilley.introduce());

        Human madreRilley = new Human("madre de Rilley", 44, "madre del personaje principal");
        System.out.println(madreRilley.introduce());

        rilley.eat();

    }

}