package org.example;

public class Elfo extends Raza {

    private String kind;
    private String power;
    private boolean inmortal;

    public Elfo(int age, String weapon, String name, String kind, String power, boolean inmortal) {
        super(age, weapon, name);
        this.kind = kind;
        this.power = power;
        this.inmortal = inmortal;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public boolean isInmortal() {
        return inmortal;
    }

    public void setInmortal(boolean inmortal) {
        this.inmortal = inmortal;
    }

    @Override
    public void printDetail() {
        System.out.println("elfo");
        super.printDetail();
        System.out.println("tipo: " + kind);
        System.out.println("poder: " + power);
        System.out.println("inmortal: " + (inmortal ? "si" : "no"));



    }









}
