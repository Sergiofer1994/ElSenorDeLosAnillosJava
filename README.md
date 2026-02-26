# 🧙 Middle Earth Races — Java OOP Project

A Java project that models different fantasy races from Middle Earth using **Object-Oriented Programming** concepts such as inheritance, polymorphism, and abstract classes.

---

## 📖 Description

This project defines a hierarchy of fantasy races, each with their own unique attributes and behaviors. All races share a common base and are managed through a unified list, showcasing the power of OOP in Java.

---

## 🏗️ Project Structure

```
src/
└── org/example/
    ├── Raza.java       # Abstract base class for all races
    ├── Humano.java     # Human race
    ├── Elfo.java       # Elf race
    ├── Enano.java      # Dwarf race
    ├── Hobbit.java     # Hobbit race
    ├── Orco.java       # Orc race
    └── Main.java       # Entry point — creates and displays all heroes
```

---

## 🧬 Class Hierarchy

```
Raza (abstract)
├── Humano
├── Elfo
├── Enano
├── Hobbit
└── Orco
```

### `Raza` (Base Class)
Shared attributes for every race:
- `name` — Character name
- `age` — Character age
- `weapon` — Equipped weapon

### `Humano` (Human)
Additional attributes: `kingdom`, `lineage`, `isNoble`

### `Elfo` (Elf)
Additional attributes: `kind`, `power`, `inmortal`

### `Enano` (Dwarf)
Additional attributes: `clan`, `mine`, `beardM` (beard length in meters)

### `Hobbit`
Additional attributes: `land`, `kind`, `pipesPrDay`

### `Orco` (Orc)
Additional attributes: `kind`, `obedience`, `battles`

---

## ▶️ How to Run

### Prerequisites
- Java 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or the JDK CLI

### Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/your-repo-name.git
   ```

2. Open the project in your IDE or navigate to the source folder.

3. Compile and run `Main.java`:
   ```bash
   javac org/example/*.java
   java org.example.Main
   ```

---

## 💡 Key Concepts Demonstrated

- **Inheritance** — All race classes extend the abstract `Raza` class.
- **Polymorphism** — All heroes are stored in a `List<Raza>` and each calls its own `printDetail()` override.
- **Encapsulation** — Private fields with public getters and setters.
- **Abstract Classes** — `Raza` defines a shared contract without being instantiable itself.
- **Method Overriding** — Each subclass overrides `printDetail()` to print race-specific information.

---

## 📋 Example Output

```
humano
nombre: Xavier
arma: Espada
edad: 50
reino: Gondor
linaje: Perez
es noble: si
---
elfo
nombre: Ana
arma: Arco
edad: 30
tipo: Bosque
poder: Curar
inmortal: si
```

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
