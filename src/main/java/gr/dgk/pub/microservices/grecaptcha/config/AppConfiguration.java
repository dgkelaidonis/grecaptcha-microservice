package gr.dgk.pub.microservices.grecaptcha.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * This class implements the configuration of the gReCaptcha microservice, for
 * defining the service related beans using the Java configuration, and allowing
 * their deployment into the context of a spring-boot application.
 */
@Configuration
@PropertySource("file:conf/grecaptcha-service.properties")
@ComponentScan(basePackages = "gr.dgk.microservices.grecaptcha")
public class AppConfiguration {
}