package TartoRizaldi.belajar_spring.core;

import org.junit.jupiter.api.Assertions;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.classfile.Annotation;

public class ApplicationContextTest {

    public ApplicationContextTest(Class<HelloWordConfigurasion> helloWordConfigurasionClass) {
    }

    void testApplicationContext(){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWordConfigurasion.class);
        Assertions.assertNotNull(context);
    }
}
