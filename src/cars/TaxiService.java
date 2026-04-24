package cars;

/**
 * Beschreibt Taxifunktionen.
 */
public interface TaxiService {

    /**
     * Startet die Fahrt.
     */
    void startFare();

    /**
     * Beendet die Fahrt.
     */
    void stopFare();

    /**
     * Berechnet den Preis der letzten Fahrt.
     *
     * @return der Preis der letzten Fahrt
     */
    double calculateLastFare();

    /**
     * Prüft, ob aktuell eine Fahrt läuft.
     *
     * @return true, wenn eine Fahrt läuft, sonst false
     */
    boolean isFareRunning();
}