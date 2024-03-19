import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest3 {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void rabat() {
        double ticket=40.0;
        double expectedDiscount=100.0;
        double currentDiscount=Main.rabat(ticket);
        assertEquals(expectedDiscount,currentDiscount);
    }
}