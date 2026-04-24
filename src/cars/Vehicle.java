package cars;

/**
 * Repräsentiert ein allgemeines Fahrzeug.
 */
public abstract class Vehicle implements Drivable {
    private final int amountWheels;
    private double mileageKm;

    /**
     * Erstellt ein Fahrzeug.
     *
     * @param amountWheels die Anzahl der Räder
     */
    public Vehicle(int amountWheels) {
        this.amountWheels = amountWheels;
        this.mileageKm = 0.0;
    }

    /**
     * Gibt den Kilometerstand zurück.
     *
     * @return der Kilometerstand
     */
    public double getMileageKm() {
        return mileageKm;
    }

    /**
     * Gibt die Anzahl der Räder zurück.
     *
     * @return die Anzahl der Räder
     */
    public int getAmountWheels() {
        return amountWheels;
    }

    /**
     * Erhöht den Kilometerstand.
     *
     * @param kilometers die gefahrenen Kilometer
     */
    protected void addMileage(double kilometers) {
        if (kilometers > 0.0) {
            mileageKm += kilometers;
        }
    }
}