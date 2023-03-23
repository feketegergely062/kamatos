import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class TestKamatos {
    Kamatos kamatos;
    @Test
    
    public void testSzamitTenylegesKamat(){
        Kamatos kamatos = new Kamatos();
        double actual = kamatos.szamitTenylegesKamat(50000, 5, 1);
        assertEquals(actual, 2500.0,0.01, "Nem 2500-t kaptam");
    }
    @Test
    public void testCheckInput(){
        boolean actual = kamatos.checkInput("33");
        assertTrue(actual);
    }
    @Test
    public void testCheckInputFalse(){
        boolean actual = kamatos.checkInput("a");
        assertFalse(actual);
    }

    
}
