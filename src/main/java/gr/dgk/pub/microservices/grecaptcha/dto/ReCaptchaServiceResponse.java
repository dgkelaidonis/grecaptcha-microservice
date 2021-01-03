package gr.dgk.pub.microservices.grecaptcha.dto;

/**
 * This class implements the DTO for the communication between the third-party
 * frontend client and the recaptcha microservice endpoint.
 */
public class ReCaptchaServiceResponse {
    private boolean verificationIsValid;
    private String protectedDomain;

    /**
     * Constructor for building the microservice endpoint response.
     * 
     * @param verificationIsValid: true/false depending on the verification result
     *        received from the google site verification service.
     * @param protectedDomain: a url that corresponds to the endpoint behind the
     *        reCaptcha verification.
     */
    public ReCaptchaServiceResponse(boolean verificationIsValid, String protectedDomain) {
	this.verificationIsValid = verificationIsValid;
	this.protectedDomain = protectedDomain;
    }

    public boolean isVerificationIsValid() {
	return verificationIsValid;
    }

    public void setVerificationIsValid(boolean verificationIsValid) {
	this.verificationIsValid = verificationIsValid;
    }

    public String getProtectedDomain() {
	return protectedDomain;
    }

    public void setProtectedDomain(String protectedDomain) {
	this.protectedDomain = protectedDomain;
    }

}