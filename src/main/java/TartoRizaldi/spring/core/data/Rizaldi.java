package TartoRizaldi.spring.core.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Rizaldi {

    @Bean
    public Rizaldi rizaldi() {
        Rizaldi rizaldi = new Rizaldi();
        return rizaldi;
    }

}
