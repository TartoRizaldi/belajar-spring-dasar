package TartoRizaldi.spring.core;

import TartoRizaldi.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateTest {

    @Test
    void testDuplicate() {

        // Membuat Spring container (ApplicationContext)
        // Menggunakan konfigurasi yang punya 2 bean Foo (foo1 & foo2)
        ApplicationContext context =
                new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

        // Menguji bahwa akan terjadi exception
        // karena ada lebih dari 1 bean dengan tipe Foo
        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {

            // Mengambil bean berdasarkan TYPE
            // ❌ Akan error karena:
            // - ada 2 bean: foo1 & foo2
            // - Spring tidak tahu mau ambil yang mana
            Foo foo = context.getBean(Foo.class);
        });

    }

    @Test
    void getBean() {

        // Membuat Spring container lagi
        ApplicationContext context =
                new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

        // Mengambil bean berdasarkan NAMA
        // ✅ Tidak error karena kita spesifik memilih
        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        // Mengecek bahwa keduanya berbeda instance
        // karena dibuat dari method berbeda
        Assertions.assertNotSame(foo1, foo2);

    }
}