package gr.dgk.microservices.grecaptcha.config;

import org.springframework.context.annotation.Import;

/**
 * Definition of the interface that allows to a spring-boot application to
 * enable and use the gReCaptcha service capabilities within its context. It is
 * important for facilitating the auto configuration and deployment of the
 * gReCaptcha microservice into a third-party spring-boot application context.
 */
@Import(AppConfiguration.class)
public @interface EnableGoogleRecaptchaService {
}