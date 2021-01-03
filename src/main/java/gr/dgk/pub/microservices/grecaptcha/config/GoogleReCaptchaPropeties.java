package gr.dgk.pub.microservices.grecaptcha.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * This class implements a spring-boot component that access the *.properties
 * configuration file for the gReCaptcha microservice, manipulating the prefix
 * related properties as primitive java datatypes.
 */
@Component
@ConfigurationProperties(prefix = "google.recaptcha")
public class GoogleReCaptchaPropeties {
    private String verificationEndpointUrl; /* google endpoint for site token verification */
    private String siteKey; /* this is public and it is used by the web site so as to perform */
    private String secretKey; /* secret key */

    public String getVerificationEndpointUrl() {
	return verificationEndpointUrl;
    }

    public void setVerificationEndpointUrl(String verificationEndpointUrl) {
	this.verificationEndpointUrl = verificationEndpointUrl;
    }

    public String getSiteKey() {
	return siteKey;
    }

    public void setSiteKey(String siteKey) {
	this.siteKey = siteKey;
    }

    public String getSecretKey() {
	return secretKey;
    }

    public void setSecretKey(String secretKey) {
	this.secretKey = secretKey;
    }

}
