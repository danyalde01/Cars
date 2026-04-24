package cars;

/**
 * Repräsentiert ein Dieselauto.
 */
public class DieselCar extends FuelCar {

    /**
     * Erstellt ein Dieselauto.
     *
     * @param seats die Anzahl der Sitze
     * @param fuelCapacity die Tankkapazität
     * @param fuelConsumptionPerKm der Verbrauch pro Kilometer
     */
    public DieselCar(int seats, double fuelCapacity, double fuelConsumptionPerKm) {
        super(seats, fuelCapacity, fuelConsumptionPerKm);
    }
}