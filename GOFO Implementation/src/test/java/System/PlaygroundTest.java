package System;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import System.Playground;

public class PlaygroundTest {

    private Playground playground;

    @BeforeEach
    public void setUp() {
        playground = new Playground();
    }

    @Test
    public void testSetAndGetCancellationPeriod() {
        playground.setCancellationPeriod(24);
        assertEquals(24, playground.getCancellationPeriod());
    }

    @Test
    public void testSetAndGetName() {
        playground.setName("Playground 1");
        assertEquals("Playground 1", playground.getName());
    }

    @Test
    public void testSetAndGetOwner() {
        playground.setOwner("John Doe");
        assertEquals("John Doe", playground.getOwner());
    }

    // Testes adicionais para getStatus, getLocation, getPrice, getSlotsBegin, getSlotsEnd
    // Nota: Esses testes exigirão que os valores correspondentes sejam definidos de antemão,
    // pois os métodos para defini-los dependem da entrada do usuário.

}
