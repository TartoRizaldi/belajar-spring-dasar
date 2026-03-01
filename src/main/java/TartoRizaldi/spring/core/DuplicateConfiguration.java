package TartoRizaldi.spring.core;

// Import class Foo (object yang akan dijadikan bean)
import TartoRizaldi.spring.core.data.Foo;

// Import anotasi Bean dari Spring
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// Class konfigurasi
public class DuplicateConfiguration {

    @Bean
    public Foo foo1() {

        // Method ini membuat bean bernama "foo1"
        // Spring akan menyimpan object Foo ini di container
        return new Foo();
    }

    @Bean
    public Foo foo2() {

        // Method ini membuat bean lain bernama "foo2"
        // Walaupun tipenya sama (Foo), ini adalah instance yang BERBEDA
        return new Foo();
    }
}