import Vehicle.Car;
import Vehicle.ColourOption;
import Vehicle.Engine;
import Vehicle.VehicleType;
import Customer.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;
    Car car2;
    Engine engine;
    ArrayList<Car> carHolder;

    @Before
    public void setUp() {
        engine = new Engine("V8", 2);
        car = new Car(engine, VehicleType.PETROL, 4000.00, ColourOption.BLACK);
        customer = new Customer(10000);
        car2 = new Car(engine, VehicleType.HYBRID, 8000.00, ColourOption.BLUE);
        carHolder = new ArrayList<>();
        carHolder.add(car);
    }

    @Test
    public void customerHasMoney(){
        assertEquals(10000, customer.getMoney(), 0.00);
    }

    @Test
    public void customerStartsWithNoCars(){
        assertEquals(0, customer.getCarCount(),0.00);
    }

    @Test
    public void canAddCarToCustomer(){
        customer.addCar(car);
        assertEquals(1, customer.getCarCount(),0.00);
    }

    @Test
    public void canRemoveCar(){
        customer.addCar(car);
        customer.addCar(car2);
        customer.removeCar(car2);
        assertEquals(carHolder, customer.getCars());
    }

    @Test
    public void canAddMoney(){
        customer.addMoney(1000.00);
        assertEquals(11000.00, customer.getMoney(),0.00);
    }

    @Test
    public void canRemoveMoney(){
        customer.removeMoney(1000.00);
        assertEquals(9000.00, customer.getMoney(), 0.00);
    }


}
