# Java: Vehicle Hierarchy & Taxi Features

Ein Java-Projekt zur Umsetzung einer Fahrzeugklassenhierarchie mit Vererbung, Polymorphismus, Interfaces und UML-basierter Struktur.

## 📌 Beschreibung

Dieses Projekt modelliert verschiedene Fahrzeugtypen mit objektorientierter Programmierung in Java.  
Im Mittelpunkt stehen abstrakte Klassen, Vererbung, Interfaces und Komposition.

## 🧱 Klassen und Interfaces

- `Vehicle` – abstrakte Basisklasse für alle Fahrzeuge
- `Car` – abstrakte Klasse für Autos
- `FuelCar` – abstrakte Klasse für Fahrzeuge mit Tank
- `DieselCar` – konkrete Unterklasse von `FuelCar`
- `ElectricCar` – konkrete Unterklasse von `Car`
- `TaxiCar` – Taxi auf Basis eines Autos
- `Drivable` – Interface für fahrbare Objekte
- `TaxiService` – Interface für Taxifunktionen
- `Traffic` – Demo-Klasse

## ⚙️ Verwendete Technologien

- Java
- OOP
- UML / PlantUML
- Git
- GitHub
- IntelliJ IDEA

## 📂 Projektstruktur

```text
Cars/
├─ src/
│  └─ cars/
│     ├─ Vehicle.java
│     ├─ Car.java
│     ├─ FuelCar.java
│     ├─ DieselCar.java
│     ├─ ElectricCar.java
│     ├─ Drivable.java
│     ├─ TaxiService.java
│     ├─ TaxiCar.java
│     └─ Traffic.java
├─ README.md
├─ CarsUML.puml
├─ CarsUML.png
└─ .gitignore