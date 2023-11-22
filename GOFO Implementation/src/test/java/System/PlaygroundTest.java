package System;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import System.Playground;

public class PlaygroundTest {

    private Playground playground;

    @BeforeEach
    public void configurar() {
        playground = new Playground();
    }

    @Test
    public void testeDefinirEObterPeriodoDeCancelamento() {
        playground.setCancellationPeriod(10);
        assertEquals(10, playground.getCancellationPeriod());
    }

    @Test
    public void testeDefinirEObterNome() {
        playground.setName("Parque");
        assertEquals("Parque", playground.getName());
    }

    @Test
    public void testeDefinirEObterProprietario() {
            playground.setOwner("Murilo");
        assertEquals("Murilo", playground.getOwner());
    }



}
