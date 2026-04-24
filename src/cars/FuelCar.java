package cars;

/**
 * Repräsentiert ein Auto mit Tank.
 */
public abstract class FuelCar extends Car {
    private double fuelLevel;
    private final double fuelCapacity;
    private final double fuelConsumptionPerKm;

    /**
     * Erstellt ein Fahrzeug mit leerem Tank.
     *
     * @param seats die Anzahl der Sitze
     * @param fuelCapacity die Tankkapazität
     * @param fuelConsumptionPerKm der Verbrauch pro Kilometer
     */
    public FuelCar(int seats, double fuelCapacity, double fuelConsumptionPerKm) {
        super(seats);
        this.fuelLevel = 0.0;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

    /**
     * Betankt das Fahrzeug.
     *
     * @param amount die Menge an Kraftstoff
     */
    public void refuel(double amount) {
        if (amount <= 0.0) {
            return;
        }

        fuelLevel += amount;
        if (fuelLevel > fuelCapacity) {
            fuelLevel = fuelCapacity;
        }
    }

    /**
     * Prüft, ob die Distanz gefahren werden kann.
     *
     * @param kilometers die Distanz
     * @return true, wenn genug Kraftstoff vorhanden ist, sonst false
     */
    @Override
    public boolean canDrive(double kilometers) {
        if (kilometers <= 0.0) {
            return true;
        }
        return fuelLevel >= kilometers * fuelConsumptionPerKm;
    }

    /**
     * Fährt die mögliche Distanz und reduziert den Tankinhalt.
     *
     * @param kilometers die gewünschte Distanz
     */
    @Override
    public void drive(double kilometers) {
        if (kilometers <= 0.0) {
            return;
        }

        double possibleKilometers = fuelLevel / fuelConsumptionPerKm;
        double drivenKilometers = Math.min(kilometers, possibleKilometers);

        addMileage(drivenKilometers);
        fuelLevel -= drivenKilometers * fuelConsumptionPerKm;

        if (fuelLevel < 0.0) {
            fuelLevel = 0.0;
        }
    }

    /**
     * Gibt den Tankinhalt zurück.
     *
     * @return der Tankinhalt
     */
    public double getFuelLevel() {
        return fuelLevel;
    }

    /**
     * Gibt die Tankkapazität zurück.
     *
     * @return die Tankkapazität
     */
    public double getFuelCapacity() {
        return fuelCapacity;
    }

    /**
     * Gibt den Verbrauch pro Kilometer zurück.
     *
     * @return der Verbrauch pro Kilometer
     */
    public double getFuelConsumptionPerKm() {
        return fuelConsumptionPerKm;
    }
}