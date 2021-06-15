import Customer.Customer;
import Dealership.DealerShip;
import Vehicle.Car;
import Vehicle.ColourOption;
import Vehicle.Engine;
import Vehicle.VehicleType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealerShipTest {

    private DealerShip dealerShip;
    private Car carOne;
    private Car carTwo;
    private Engine engine;
    private ArrayList<Car> stock;
    private ArrayList<Car> carHolder;
    private Customer customer;
    private ArrayList<Car> noCars;

    @Before
    public void before(){
        engine = new Engine("Large", 20);
        carOne = new Car(engine, VehicleType.PETROL, 20000, ColourOption.BLUE);
        carTwo = new Car(engine, VehicleType.ELECTRIC, 25000, ColourOption.BLACK);
        stock = new ArrayList<>();
        dealerShip = new DealerShip();
        stock.add(carOne);
        stock.add(carTwo);
        dealerShip.setStock(stock);
        carHolder = new ArrayList<>();
        carHolder.add(carOne);
        customer = new Customer(50000);
    }

    @Test
    public void hasProfits(){
        assertEquals(0.00, dealerShip.getProfits(), 0.00);
    }

    @Test
    public void hasStock(){
        assertEquals(stock, dealerShip.getStock());
    }

    @Test
    public void canSetProfit(){
        dealerShip.setProfits(25.00);
        assertEquals(25.00, dealerShip.getProfits(), 0.0);
    }

    @Test
    public void canSetStock(){
        Car carThree = new Car(engine, VehicleType.HYBRID, 26000, ColourOption.RED);
        stock.add(carThree);
        dealerShip.setStock(stock);
        assertEquals(stock, dealerShip.getStock());
    }

    @Test
    public void canAddCarToDealership(){
        dealerShip.addCar(carOne);
        assertEquals(3, dealerShip.stockAmount());
    }

    @Test
    public void canRemoveCar(){
        dealerShip.removeCar(carTwo);
        assertEquals(carHolder, dealerShip.getStock());
    }

    @Test
    public void canAddMoney(){
        dealerShip.addMoney(1000.00);
        assertEquals(1000.00, dealerShip.getProfits(),0.00);
    }

    @Test
    public void canRemoveMoney(){
        dealerShip.addMoney(5000.00);
        dealerShip.removeMoney(1000.00);
        assertEquals(4000.00, dealerShip.getProfits(), 0.00);
    }

    @Test
    public void canSellCar(){
        dealerShip.sellVehicle(customer, carOne);
        assertEquals(1, dealerShip.stockAmount());
        assertEquals(1, customer.getCarCount());
        assertEquals(30000.00, customer.getMoney(), 0.00);
        assertEquals(20000.00, dealerShip.getProfits(), 0.00);
    }
}
