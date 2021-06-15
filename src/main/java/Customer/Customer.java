package Customer;

import Vehicle.Car;
import behaviours.ICars;
import behaviours.IMoney;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer implements IMoney, ICars {

    private double money;
    private ArrayList<Car> cars;


    public Customer(double money) {
        this.money = money;
        this.cars = new ArrayList<>();
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public int getCarCount(){
        return this.cars.size();
    }


    @Override
    public void addCar(Car car){
        cars.add(car);
    }

    @Override
    public void removeCar(Car car) {
        cars.remove(car);
    }

    @Override
    public void addMoney(Double money) {
        this.money += money;
    }

    public boolean canAfford(Car car) {
        if (this.getMoney() >= car.getPrice()){
            return true;
        }
        return false;
    }

    @Override
    public void removeMoney(Double money) {
        if (this.getMoney() >= money) {
            this.money -= money;
        } else {
            this.money -= 0;
        }

    }
}
