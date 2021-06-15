package Vehicle;

public class Car {

    private double price;
    private ColourOption colour;
    private int wheels;
    private VehicleType vehicleType;
    private Engine engine;
    private int damage;

    public Car(Engine engine, VehicleType vehicleType, double price, ColourOption colour) {
        this.engine = engine;
        this.wheels = 4;
        this.vehicleType = vehicleType;
        this.price = price;
        this.colour = colour;
        this.damage = 0
    }

    public double getPrice() {
        return price - damage;
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

    public int getDamage(){
        return damage;
    }

    public void damageCar(int damage){
        this.damage += damage;
    }

    public void repairCar(){
        this.damage = 0;
    }

}
