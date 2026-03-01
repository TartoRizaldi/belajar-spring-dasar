package TartoRizaldi.spring.core;// Import class test dan konfigurasi Spring

import TartoRizaldi.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {

    @Test
    void testCreateBean() {

        // Membuat ApplicationContext (container Spring)
        // BeanConfiguration.class berisi definisi bean yang akan dikelola Spring
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        // Memastikan bahwa context berhasil dibuat (tidak null)
        Assertions.assertNotNull(context);

    }

    @Test
    void testGetBean() {

        // Membuat ApplicationContext dari konfigurasi
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        // Mengambil bean dengan tipe Foo dari Spring container
        Foo foo1 = context.getBean(Foo.class);

        // Mengambil bean Foo lagi (bean yang sama jika scope-nya singleton)
        Foo foo2 = context.getBean(Foo.class);

        // Mengecek apakah kedua object adalah instance yang sama
        // Default scope Spring adalah singleton → hanya 1 object dibuat
        Assertions.assertSame(foo1, foo2);
    }
}