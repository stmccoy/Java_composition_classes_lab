import Vehicle.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    private Engine engine;

    @Before
    public void before(){
        engine = new Engine("Large", 20);
    }

    @Test
    public void canGetSize(){
        assertEquals("Large", engine.getSize());
    }

    @Test
    public void canGetLitres(){
        assertEquals(20, engine.getLitres());
    }

}
