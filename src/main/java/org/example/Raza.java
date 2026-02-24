package org.example;

public abstract class Raza {

private String name;
private int  age;
private String weapon;

    public Raza(int age, String weapon, String name) {
        this.age = age;
        this.weapon = weapon;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

public void printDetail() {

    System.out.println("nombre: " + name);
    System.out.println("arma: " + weapon);
    System.out.println("edad: "+ age);
}













}
