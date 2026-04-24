package cars;

/**
 * Beschreibt fahrbare Objekte.
 */
public interface Drivable {

    /**
     * Fährt die angegebene Distanz.
     *
     * @param kilometers die zu fahrende Distanz
     */
    void drive(double kilometers);

    /**
     * Prüft, ob die angegebene Distanz gefahren werden kann.
     *
     * @param kilometers die zu prüfende Distanz
     * @return true, wenn die Distanz gefahren werden kann, sonst false
     */
    boolean canDrive(double kilometers);
}