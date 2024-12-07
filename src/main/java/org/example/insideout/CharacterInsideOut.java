package org.example.insideout;

public  abstract class CharacterInsideOut {
    private String name;
    private int age;

    public CharacterInsideOut(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract String introduce ();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
