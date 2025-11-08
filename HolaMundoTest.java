import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HolaMundoTest {
    @Test
    public void testSaludo() {
        HolaMundo h = new HolaMundo();
        assertEquals("¡Hola Mundo!", h.saludar());
    }
}
