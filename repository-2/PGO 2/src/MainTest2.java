import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MainTest2 {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void jakiJestDzienTygodnia() {
        LocalDate date=LocalDate.now();
        DayOfWeek expectedDayOfWeek=date.getDayOfWeek();
        String currentDayOfWeek=Main.jakiJestDzienTygodnia();
        assertEquals(expectedDayOfWeek.name(),currentDayOfWeek);

    }
}