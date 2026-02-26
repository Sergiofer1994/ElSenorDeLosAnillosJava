package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

public static void main(String[] args) {

    List<Raza> heroes = new ArrayList<>();

    heroes.add(new Humano(50, "Espada", "Xavier", "Gondor", "Perez", true));
    heroes.add(new Humano(30, "Espada", "Sergio", "Gondor", "Lopezz", true));
    heroes.add(new Humano(40, "Cuchillo", "Suso", "Rohan", "Gomez", false));

    heroes.add(new Elfo(30, "Arco", "Ana", "Bosque", "Curar", true));
    heroes.add(new Elfo(100, "Arco", "Alba", "Monte", "Crear", true));
    heroes.add(new Elfo(300, "Arco", "Maria", "Rio", "Ver", true));

    heroes.add(new Enano(30, "Hacha", "Juanlu", "Alfa", "Callónr", 0.6f));
    heroes.add(new Enano(40, "Maza", "Heber", "Beta", "Muroe", 0.3f));
    heroes.add(new Enano(30, "Pica", "Fucu", "Omega", "Bueu", 0f));

    heroes.add(new Hobbit(90, "Arco", "Melisa", "America", "Garcia", 3));
    heroes.add(new Hobbit(130, "Faca", "Maria", "Betanzos", "Sanchez", 6));
    heroes.add(new Hobbit(130, "Arco", "David", "Barcelona", "Ruiz", 9));

    heroes.add(new Orco(300, "Lanza", "Carla", "Noturno", "F5", 16));
    heroes.add(new Orco(18, "Arco", "Ana", "Noturno", "Inditex", 1));
    heroes.add(new Orco(90, "porra", "Jm", "Norturno", "F5", 200));


    for (Raza heroe : heroes) {
        heroe.printDetail();

    }
}




























}








