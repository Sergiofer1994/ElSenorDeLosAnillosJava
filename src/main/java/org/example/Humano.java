package org.example;

public class Humano extends Raza {


    private String kingdom;
    private String lineage;
    private boolean isNoble;

    public Humano(int age, String weapon, String name, String kingdom, String lineage, boolean isNoble) {
        super(age, weapon, name);
        this.kingdom = kingdom;
        this.lineage = lineage;
        this.isNoble = isNoble;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getLineage() {
        return lineage;
    }

    public void setLineage(String lineage) {
        this.lineage = lineage;
    }

    public boolean isNoble() {
        return isNoble;
    }

    public void setNoble(boolean noble) {
        isNoble = noble;
    }

@Override
    public void  printDetail(){

    System.out.println("humano");
    super.printDetail();
    System.out.println("reino: " + kingdom);
    System.out.println("linaje: " + lineage);
    System.out.println("es noble: " + (isNoble ? "si" : "no"));




}






}
