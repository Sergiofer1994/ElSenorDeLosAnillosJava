package org.example;

public class Enano extends Raza {

private String clan;
private String mine;
private float beardM;


    public Enano(int age, String weapon, String name, String clan, String mine, float beardM) {
        super(age, weapon, name);
        this.clan = clan;
        this.mine = mine;
        this.beardM = beardM;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public String getMine() {
        return mine;
    }

    public void setMine(String mine) {
        this.mine = mine;
    }

    public float getBeardM() {
        return beardM;
    }

    public void setBeardM(float beardM) {
        this.beardM = beardM;
    }

@Override
    public void printDetail() {


    System.out.println("enano");
        super.printDetail();
    System.out.println("clan: " + clan);
    System.out.println("mina: "+ mine);
    System.out.println("barba m: " + beardM);

    }

}
