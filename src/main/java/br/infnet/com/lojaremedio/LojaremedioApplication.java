package br.infnet.com.venda;

import info.schnatterer.mobynamesgenerator.MobyNamesGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Properties;

@SpringBootApplication
public class LojaremedioApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(LojaremedioApplication.class);
        Properties properties = new Properties();
        //int serverPort = new Random().nextInt(8280, 8290);
        String nickName = MobyNamesGenerator.getRandomName();
        properties.put("spring.application.serverNick", nickName);
        //properties.put("server.port", serverPort);
        springApplication.setDefaultProperties(properties);
        springApplication.run(args);
    }
}
