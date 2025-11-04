package TartoRizaldi.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

    @Test
    void tesSingleton() {
     var database = Database.getInstance();
     var database2 = Database.getInstance();
        Assertions.assertNotNull(database);
        Assertions.assertNotNull(database2);
        Assertions.assertSame(database, database2);
    }
}
