package org.example;

public class Orco extends Raza{

private String kind;
private String obedience;
private int battles;

    public Orco(int age, String weapon, String name, String kind, String obedience, int battles) {
        super(age, weapon, name);
        this.kind = kind;
        this.obedience = obedience;
        this.battles = battles;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getObedience() {
        return obedience;
    }

    public void setObedience(String obedience) {
        this.obedience = obedience;
    }

    public int getBattles() {
        return battles;
    }

    public void setBattles(int battles) {
        this.battles = battles;
    }


@Override
    public void printDetail(){
    System.out.println("orco");
    super.printDetail();
    System.out.println("clase: "+ kind);
    System.out.println("obediencia: "+ obedience);
    System.out.println("batallas: "+ battles);
}

}
