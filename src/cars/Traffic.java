package cars;

/**
 * Die Klasse Traffic wird nicht getestet.
 */
public class Traffic {

    /**
     * Main
     * @param args env
     * */
    /*
    public static void main(String[] args) {

        Drivable[] cars = {
                new DieselCar(2, 60.0, 0.12),
                new ElectricCar(2, 64.0, 0.21),
                new TaxiCar(
                        new ElectricCar(4, 75, 0.20)
                        , 0.45)
        };

        refuelOrCharge(cars, 30);

        drive(cars, 200);
        printMileage(cars);

        refuelOrCharge(cars, 12);

        drive(cars, 1254);
        printMileage(cars);

        drive(cars, 300);
        printMileage(cars);


    }

    private static void refuelOrCharge(Drivable[] cars, double amount) {
        for (Drivable c : cars) {
            Vehicle v = null;
            if (c instanceof TaxiCar) {
                v = ((TaxiCar) c).getBasedOn();
            } else if (c instanceof Vehicle) {
                v = (Vehicle) c;
            }

            if (v instanceof ElectricCar) {
                ElectricCar ec = (ElectricCar) v;
                ec.recharge(amount);
                System.out.println(
                        "ElectricCar at "
                                + ec.getBatteryLevel()
                                + "/"
                                + ec.getBatteryCapacity());
            } else if (v instanceof FuelCar) {
                FuelCar fc = (FuelCar) v;
                fc.refuel(amount);
                System.out.println(
                        "FuelCar at "
                                + fc.getFuelLevel()
                                + "/"
                                + fc.getFuelCapacity());
            } else {
                System.out.println("No Charcoal Station available.");
            }
        }
    }

    private static void drive(Drivable[] cars, double meters) {
        for (Drivable c : cars) {
            c.drive(meters);
        }
    }

    private static void printMileage(Drivable[] cars) {
        for (Drivable d : cars) {
            if (d instanceof Vehicle) {
                Vehicle v = (Vehicle) d;
                System.out.println(v.getClass().getSimpleName()
                        + " => "
                        + v.getMileageKm()
                        + "km");
            } else if (d instanceof TaxiCar) {
                Car c = ((TaxiCar) d).getBasedOn();
                System.out.println(d.getClass().getSimpleName()
                        + " => "
                        + c.getMileageKm()
                        + "km");
            }
        }
        System.out.println();
    }
*/
            }
