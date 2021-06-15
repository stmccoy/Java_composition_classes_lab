package Vehicle;

public class Car {

    private double price;
    private ColourOption colour;
    private int wheels;
    private VehicleType vehicleType;
    private Engine engine;

    public Car(Engine engine, VehicleType vehicleType, double price, ColourOption colour) {
        this.engine = engine;
        this.wheels = 4;
        this.vehicleType = vehicleType;
        this.price = price;
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public ColourOption getColour() {
        return colour;
    }

    public int getWheels() {
        return wheels;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Engine getEngine() {
        return engine;
    }
}
