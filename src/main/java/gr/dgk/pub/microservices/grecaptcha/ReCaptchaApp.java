package gr.dgk.pub.microservices.grecaptcha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run Google ReCaptcha microservice as a standalone spring-boot application in
 * its own context.
 */
@SpringBootApplication
public class ReCaptchaApp {
    public static void main(String[] args) {
	SpringApplication.run(ReCaptchaApp.class, args);
    }
}
