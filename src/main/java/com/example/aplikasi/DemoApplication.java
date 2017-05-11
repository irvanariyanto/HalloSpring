package com.example.aplikasi;

import com.example.InjectViaConstructor;
import com.example.InjectViaConstructor;
import com.example.InjectViaSetter;
import com.example.InjectViaSetter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication

@ImportResource("classpath:/config/configSpring.xml")

//@ComponentScan("/com.example")
public class DemoApplication {

	public static void main(String[] args) {
            ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
            InjectViaConstructor halloSpringController = (InjectViaConstructor)context.getBean("injectViaConstructor");
            halloSpringController.getMessage();
            
            InjectViaSetter injectViaSetter = (InjectViaSetter)context.getBean("injectViaSetter");
            injectViaSetter.getMessage();
	}
}
