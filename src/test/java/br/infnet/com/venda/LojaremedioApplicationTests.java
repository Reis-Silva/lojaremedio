package br.infnet.com.lojaremedio;

import info.schnatterer.mobynamesgenerator.MobyNamesGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LojaremedioApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(MobyNamesGenerator.getRandomName());
    }

}
