package TartoRizaldi.belajar_spring.core;

import org.junit.jupiter.api.Assertions;

public class DatabaseTest {

    void testSingeleton(){

        var database1 = Database.getInstance();
        var database2 = Database.getInstance();

        Assertions.assertSame(database1,database2);

    }
}
