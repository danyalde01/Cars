package cars;

/**
 * Repräsentiert ein Taxi auf Basis eines Autos.
 */
public class TaxiCar implements Drivable, TaxiService {
    private boolean fareRunning;
    private final double farePerKm;
    private double startMileage;
    private double endMileage;
    private final Car basedOn;

    /**
     * Erstellt ein Taxi.
     *
     * @param basedOn das zugrunde liegende Auto
     * @param farePerKm der Preis pro Kilometer
     */
    public TaxiCar(Car basedOn, double farePerKm) {
        this.basedOn = basedOn;
        this.farePerKm = farePerKm;
        this.fareRunning = false;
        this.startMileage = 0.0;
        this.endMileage = 0.0;
    }

    /**
     * Prüft, ob die Distanz gefahren werden kann.
     *
     * @param kilometers die Distanz
     * @return true, wenn das Basisauto fahren kann, sonst false
     */
    @Override
    public boolean canDrive(double kilometers) {
        return basedOn.canDrive(kilometers);
    }

    /**
     * Fährt mit dem Basisauto.
     *
     * @param kilometers die Distanz
     */
    @Override
    public void drive(double kilometers) {
        basedOn.drive(kilometers);
    }

    /**
     * Startet eine Taxifahrt.
     */
    @Override
    public void startFare() {
        fareRunning = true;
        startMileage = basedOn.getMileageKm();
        endMileage = startMileage;
    }

    /**
     * Beendet eine Taxifahrt.
     */
    @Override
    public void stopFare() {
        endMileage = basedOn.getMileageKm();
        fareRunning = false;
    }

    /**
     * Berechnet den Preis der letzten Fahrt.
     *
     * @return der Preis der letzten Fahrt
     */
    @Override
    public double calculateLastFare() {
        return (endMileage - startMileage) * farePerKm;
    }

    /**
     * Prüft, ob aktuell eine Taxifahrt läuft.
     *
     * @return true, wenn eine Fahrt läuft, sonst false
     */
    @Override
    public boolean isFareRunning() {
        return fareRunning;
    }

    /**
     * Gibt das Basisauto zurück.
     *
     * @return das Basisauto
     */
    public Car getBasedOn() {
        return basedOn;
    }

    /**
     * Gibt den Preis pro Kilometer zurück.
     *
     * @return der Preis pro Kilometer
     */
    public double getFarePerKm() {
        return farePerKm;
    }

    /**
     * Gibt den Start-Kilometerstand zurück.
     *
     * @return der Start-Kilometerstand
     */
    public double getStartMileage() {
        return startMileage;
    }

    /**
     * Gibt den End-Kilometerstand zurück.
     *
     * @return der End-Kilometerstand
     */
    public double getEndMileage() {
        return endMileage;
    }
}