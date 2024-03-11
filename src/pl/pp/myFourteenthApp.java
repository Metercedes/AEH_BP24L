package pl.pp;

abstract class Vehicle {
    protected String registrationNumber;
    protected String vinNumber;
    protected String colour;
    protected double price;
    protected double fuelConsumption;
    protected double fuelLevel;
    protected double mileage;

    public Vehicle(String registrationNumber, String vinNumber, String colour, double price, double fuelConsumption, double fuelLevel, double mileage) {
        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
        this.colour = colour;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.fuelLevel = fuelLevel;
        this.mileage = mileage;
    }

    public abstract void drive(double distance);
    public abstract void refuel(double litres);

    @Override
    public String toString() {
        return "Registration Number: " + registrationNumber + "\n" +
                "VIN Number: " + vinNumber + "\n" +
                "Colour: " + colour + "\n" +
                "Price: " + price + " PLN" + "\n" +
                "Fuel Consumption: " + fuelConsumption + " l/100km\n" +
                "Fuel Level: " + fuelLevel + " litres\n" +
                "Mileage: " + mileage + " km\n";
    }
}

interface FuelType {
    String getFuelType();
}

class Diesel implements FuelType {
    public String getFuelType() {
        return "Diesel";
    }
}

class Petrol implements FuelType {
    public String getFuelType() {
        return "Petrol";
    }
}

class Electric implements FuelType {
    public String getFuelType() {
        return "Electric";
    }
}

class PassengerCar extends Vehicle {
    private final int numberOfDoors;

    public PassengerCar(String registrationNumber, String vinNumber, String colour, double price, double fuelConsumption, double fuelLevel, double mileage, int numberOfDoors) {
        super(registrationNumber, vinNumber, colour, price, fuelConsumption, fuelLevel, mileage);
        this.numberOfDoors = numberOfDoors;
    }

    public void drive(double distance) {
        double requiredFuel = distance * fuelConsumption / 100;
        if (fuelLevel >= requiredFuel) {
            mileage += distance;
            fuelLevel -= requiredFuel;
        }
    }

    public void refuel(double litres) {
        fuelLevel += litres;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Number of Doors: " + numberOfDoors + "\n";
    }
}

class Lorry extends Vehicle {
    private final double loadCapacity;

    public Lorry(String registrationNumber, String vinNumber, String colour, double price, double fuelConsumption, double fuelLevel, double mileage, double loadCapacity) {
        super(registrationNumber, vinNumber, colour, price, fuelConsumption, fuelLevel, mileage);
        this.loadCapacity = loadCapacity;
    }

    public void drive(double distance) {
        double requiredFuel = distance * fuelConsumption / 100;
        if (fuelLevel >= requiredFuel) {
            mileage += distance;
            fuelLevel -= requiredFuel;
        }
    }

    public void refuel(double litres) {
        fuelLevel += litres;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Load Capacity: " + loadCapacity + " tonnes\n";
    }
}

class Van extends Vehicle {
    private final double cargoVolume;

    public Van(String registrationNumber, String vinNumber, String colour, double price, double fuelConsumption, double fuelLevel, double mileage, double cargoVolume) {
        super(registrationNumber, vinNumber, colour, price, fuelConsumption, fuelLevel, mileage);
        this.cargoVolume = cargoVolume;
    }

    public void drive(double distance) {
        double requiredFuel = distance * fuelConsumption / 100;
        if (fuelLevel >= requiredFuel) {
            mileage += distance;
            fuelLevel -= requiredFuel;
        }
    }

    public void refuel(double litres) {
        fuelLevel += litres;
    }

    public double getCargoVolume() {
        return cargoVolume;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Cargo Volume: " + cargoVolume + " m³\n";
    }
}

class Motorcycle extends Vehicle {
    private final boolean hasSidecar;

    public Motorcycle(String registrationNumber, String vinNumber, String colour, double price, double fuelConsumption, double fuelLevel, double mileage, boolean hasSidecar) {
        super(registrationNumber, vinNumber, colour, price, fuelConsumption, fuelLevel, mileage);
        this.hasSidecar = hasSidecar;
    }

    public void drive(double distance) {
        double requiredFuel = distance * fuelConsumption / 100;
        if (fuelLevel >= requiredFuel) {
            mileage += distance;
            fuelLevel -= requiredFuel;
        }
    }

    public void refuel(double litres) {
        fuelLevel += litres;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Has Sidecar: " + hasSidecar + "\n";
    }
}

class ConstructionEquipment extends Vehicle {
    private final double hoursWorked;

    public ConstructionEquipment(String registrationNumber, String vinNumber, String colour, double price, double fuelConsumption, double fuelLevel, double mileage, double hoursWorked) {
        super(registrationNumber, vinNumber, colour, price, fuelConsumption, fuelLevel, mileage);
        this.hoursWorked = hoursWorked;
    }

    public void drive(double distance) {
        double requiredFuel = distance * fuelConsumption / 100;
        if (fuelLevel >= requiredFuel) {
            mileage += distance;
            fuelLevel -= requiredFuel;
        }
    }

    public void refuel(double litres) {
        fuelLevel += litres;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Hours Worked: " + hoursWorked + "\n";
    }
}

public class myFourteenthApp {
    public static void main(String[] args) {
        RentalTest.test();
    }
}

class RentalTest {
    public static void test() {
        PassengerCar car = new PassengerCar("34 NN 9998", "1HGCM82633A123456", "Black", 114390, 6.5, 50, 12000, 4);
        Van van = new Van("34 EF 7839", "1FTFW1EF1EKF51234", "Grey", 174525, 10, 80, 50000, 15.5);
        Lorry lorry = new Lorry("25 UV 1892", "2FTFW1EF1EKF51234", "White", 1042218, 12, 100, 60000, 20.0);
        Motorcycle motorcycle = new Motorcycle("06 MN 9013", "JH2SC5908AK200123", "Red", 40000, 3.5, 20, 5000, true);
        ConstructionEquipment excavator = new ConstructionEquipment("34 FG 8952", "3FVWF65B5YF123456", "Yellow", 707134, 15, 300, 2500, 1200);

        // Make sure to use all methods and classes
        FuelType diesel = new Diesel();
        FuelType petrol = new Petrol();
        FuelType electric = new Electric();

        System.out.println("\nFuel Types:");
        System.out.println("Type-I.: " + diesel.getFuelType());
        System.out.println("Type-II.: " + petrol.getFuelType());
        System.out.println("Type-III.: " + electric.getFuelType());

        car.drive(100);
        car.refuel(20);
        van.drive(150);
        van.refuel(40);
        lorry.drive(200);
        lorry.refuel(50);
        motorcycle.drive(50);
        motorcycle.refuel(10);
        excavator.drive(30);
        excavator.refuel(100);

        System.out.println("\nPassenger Car Details:\n" + car);
        System.out.println("Number of Doors: " + car.getNumberOfDoors());

        System.out.println("Van Details:\n" + van);
        System.out.println("Cargo Volume: " + van.getCargoVolume());

        System.out.println("Lorry Details:\n" + lorry);
        System.out.println("Load Capacity: " + lorry.getLoadCapacity());

        System.out.println("Motorcycle Details:\n" + motorcycle);
        System.out.println("Has Sidecar: " + motorcycle.hasSidecar());

        System.out.println("Construction Vehicle Details:\n" + excavator);
        System.out.println("Hours Worked: " + excavator.getHoursWorked());
    }
}
