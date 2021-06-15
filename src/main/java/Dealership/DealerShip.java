package Dealership;

import Customer.Customer;
import Vehicle.Car;
import behaviours.ICars;
import behaviours.IMoney;

import java.util.ArrayList;

public class DealerShip implements ICars, IMoney {

    private Double profits;
    private ArrayList<Car> stock;

    public DealerShip(){
        this.stock = new ArrayList<>();
        this.profits = 0.00;
    }

    public Double getProfits() {
        return profits;
    }

    public ArrayList<Car> getStock() {
        return stock;
    }

    public void setProfits(Double profits) {
        this.profits = profits;
    }

    public void setStock(ArrayList<Car> stock) {
        this.stock = stock;
    }

    public int stockAmount(){
        return this.stock.size();
    }

    @Override
    public void addCar(Car car) {
        this.stock.add(car);
    }

    @Override
    public void removeCar(Car car) {
        this.stock.remove(car);
    }

    @Override
    public void addMoney(Double money) {
        this.profits += money;
    }

    @Override
    public void removeMoney(Double money) {
        this.profits -= money;
    }

    public boolean carInStock(Car car){
       return this.stock.contains(car);
    }

    public void sellVehicle(Customer customer, Car car){
        if (this.carInStock(car) && customer.canAfford(car)) {
            customer.removeMoney(car.getPrice());
            this.addMoney(car.getPrice());
            customer.addCar(car);
            this.removeCar(car);
        }
    }
}
