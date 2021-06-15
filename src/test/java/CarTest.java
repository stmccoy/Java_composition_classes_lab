import Vehicle.ColourOption;
import Vehicle.VehicleType;
import Vehicle.Car;
import Vehicle.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Engine engine;
    Car car;

    @Before
    public void setUp() {
        engine = new Engine("V8", 2);
        car = new Car(engine, VehicleType.PETROL, 4000.00, ColourOption.BLACK);
    }

    @Test
    public void carHasEngine(){
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void carHasType(){
        assertEquals(VehicleType.PETROL, car.getVehicleType());
    }

    @Test
    public void carHasPrice(){
        assertEquals(4000, car.getPrice(), 0.00);
    }

    @Test
    public void carHasColour() {
        assertEquals(ColourOption.BLACK, car.getColour());
    }

}
