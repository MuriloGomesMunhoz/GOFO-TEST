package System;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import System.PlayGroundSchedule;

public class PlayGroundScheduleTest {

    private PlayGroundSchedule schedule;

    @Before
    public void setUp() {
        schedule = new PlayGroundSchedule();
        // Inicializar a agenda com configurações padrão, se necessário.
    }

    @Test
    public void testSetAndGetTimeSlotPerHour() {
        //schedule.setPrice(50);
        //assertEquals("O preço por hora deve ser 50", 50, schedule.getTimeSlotPerHour());
    }
}