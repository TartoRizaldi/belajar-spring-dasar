package TartoRizaldi.spring.core;

// Import class Foo (object yang akan dijadikan bean)
import TartoRizaldi.spring.core.data.Foo;

// Lombok untuk logging (biar bisa pakai log.info tanpa buat manual logger)
import lombok.extern.slf4j.Slf4j;

// Import anotasi Spring
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j // Otomatis membuat logger (log)
@Configuration // Menandakan class ini adalah konfigurasi Spring (tempat definisi bean)
public class BeanConfiguration {

    @Bean // Menandakan method ini menghasilkan bean yang akan dikelola oleh Spring
    public Foo foo() {

        // Membuat object Foo secara manual
        Foo foo = new Foo();

        // Menampilkan log saat bean dibuat
        // Catatan: parameter 'foo' tidak akan tampil karena tidak ada placeholder {}
        log.info("BELAJAR GABUT KALI NI Buat MANGIL FOO", foo);

        // Mengembalikan object Foo ke Spring container
        // Object ini akan disimpan dan dikelola oleh Spring sebagai bean
        return new Foo();
    }
}