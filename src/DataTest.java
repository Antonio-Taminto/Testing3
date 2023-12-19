import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DataTest {

    private Data testing = new Data(OffsetDateTime.parse("2023-03-01T13:00:00Z"));

    @org.junit.jupiter.api.Test
    void dataString() {
        String result = testing.dataString();
        assertEquals("01 marzo 2023",result,
                "ci aspettiamo 01 marzo 2023");
    }
}