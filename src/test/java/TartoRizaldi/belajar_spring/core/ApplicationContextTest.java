package TartoRizaldi.belajar_spring.core;

import org.junit.jupiter.api.Assertions;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.classfile.Annotation;

public class ApplicationContextTest {

    public ApplicationContextTest(Class<HelloWordConfigurasion> helloWordConfigurasionClass) {
    }

    void ApplicationContextTest(){

        ApplicationContextTest context = new ApplicationContextTest(HelloWordConfigurasion.class);
        Assertions.assertNotNull(context);
    }
}
