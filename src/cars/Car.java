package cars;

/**
 * Repräsentiert ein Auto.
 */
public abstract class Car extends Vehicle {
    private final int seats;

    /**
     * Erstellt ein Auto mit vier Rädern.
     *
     * @param seats die Anzahl der Sitze
     */
    public Car(int seats) {
        super(4);
        this.seats = seats;
    }

    /**
     * Gibt die Anzahl der Sitze zurück.
     *
     * @return die Anzahl der Sitze
     */
    public int getSeats() {
        return seats;
    }
}