package cars;

/**
 * Repräsentiert ein Elektroauto.
 */
public class ElectricCar extends Car {
    private double batteryLevel;
    private final double batteryCapacity;
    private final double consumptionPerKm;

    /**
     * Erstellt ein Elektroauto mit leerem Akku.
     *
     * @param seats die Anzahl der Sitze
     * @param batteryCapacity die Akkukapazität
     * @param consumptionPerKm der Verbrauch pro Kilometer
     */
    public ElectricCar(int seats, double batteryCapacity, double consumptionPerKm) {
        super(seats);
        this.batteryLevel = 0.0;
        this.batteryCapacity = batteryCapacity;
        this.consumptionPerKm = consumptionPerKm;
    }

    /**
     * Lädt den Akku auf.
     *
     * @param amount die geladene Energiemenge
     */
    public void recharge(double amount) {
        if (amount <= 0.0) {
            return;
        }

        batteryLevel += amount;
        if (batteryLevel > batteryCapacity) {
            batteryLevel = batteryCapacity;
        }
    }

    /**
     * Prüft, ob die Distanz gefahren werden kann.
     *
     * @param kilometers die Distanz
     * @return true, wenn genug Energie vorhanden ist, sonst false
     */
    @Override
    public boolean canDrive(double kilometers) {
        if (kilometers <= 0.0) {
            return true;
        }
        return batteryLevel >= kilometers * consumptionPerKm;
    }

    /**
     * Fährt die mögliche Distanz und reduziert den Akkustand.
     *
     * @param kilometers die gewünschte Distanz
     */
    @Override
    public void drive(double kilometers) {
        if (kilometers <= 0.0) {
            return;
        }

        double possibleKilometers = batteryLevel / consumptionPerKm;
        double drivenKilometers = Math.min(kilometers, possibleKilometers);

        addMileage(drivenKilometers);
        batteryLevel -= drivenKilometers * consumptionPerKm;

        if (batteryLevel < 0.0) {
            batteryLevel = 0.0;
        }
    }

    /**
     * Gibt den Akkustand zurück.
     *
     * @return der Akkustand
     */
    public double getBatteryLevel() {
        return batteryLevel;
    }

    /**
     * Gibt die Akkukapazität zurück.
     *
     * @return die Akkukapazität
     */
    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * Gibt den Verbrauch pro Kilometer zurück.
     *
     * @return der Verbrauch pro Kilometer
     */
    public double getConsumptionPerKm() {
        return consumptionPerKm;
    }
}