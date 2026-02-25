package org.example;

public class Hobbit extends Raza{

private  String land;
private String kind;
private int pipesPrDay;

    public Hobbit(int age, String weapon, String name, String land, String kind, int pipesPrDay) {
        super(age, weapon, name);
        this.land = land;
        this.kind = kind;
        this.pipesPrDay = pipesPrDay;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getPipesPrDay() {
        return pipesPrDay;
    }

    public void setPipesPrDay(int pipesPrDay) {
        this.pipesPrDay = pipesPrDay;
    }

@Override
    public void  printDetail() {
    System.out.println("Hobbit");
    super.printDetail();
    System.out.println("tierra: " + land);
    System.out.println("tipo: "+ kind);
    System.out.println("pipas dia: " + pipesPrDay);


  }


}
