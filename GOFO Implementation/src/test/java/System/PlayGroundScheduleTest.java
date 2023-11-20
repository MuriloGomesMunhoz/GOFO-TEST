package System;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import System.PlayGroundSchedule;

public class PlayGroundScheduleTest {

    private PlayGroundSchedule schedule;

    @BeforeEach
    public void setUp() {
        try {
            schedule = new PlayGroundSchedule();
        } catch (Exception e) {
            fail("Initialization of PlayGroundSchedule failed: " + e.getMessage());
        }
    }

    @Test
    public void testGetTimeSlotPerHourInitialValue() {
        assertNotNull(schedule, "Schedule object should not be null");
        assertEquals(0, schedule.getTimeSlotPerHour(), "Initial time slot per hour should be 0");
    }

    @Test
    public void testGetBeginInitialValue() {
        assertNotNull(schedule, "Schedule object should not be null");
        assertEquals(0, schedule.getBegin(), "Initial begin time should be 0");
    }

    @Test
    public void testGetEndInitialValue() {
        assertNotNull(schedule, "Schedule object should not be null");
        assertEquals(0, schedule.getEnd(), "Initial end time should be 0");
    }

    @Test
    public void testGetDayIndex() {
        assertNotNull(schedule, "Schedule object should not be null");
        assertEquals(1, schedule.getDayIndex("sunday"), "Index for Sunday should be 1");
        assertEquals(2, schedule.getDayIndex("monday"), "Index for Monday should be 2");
        // Testar para todos os dias da semana.
    }

    // Outros métodos como bookSlot e updateSlot podem ser desafiadores para testar diretamente
    // devido à sua interação com a lista de agendamentos. Você pode precisar de uma abordagem diferente,
    // possivelmente simulando a lista de agendamentos ou refatorando a classe para ser mais testável.
}
