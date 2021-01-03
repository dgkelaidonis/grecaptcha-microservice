package gr.dgk.pub.microservices.grecaptcha.component;

import org.springframework.stereotype.Component;

/**
 * This component provides support for the transaction risk analysis, according
 * to the specifications of the <a href= "#
 * {@link https://developers.google.com/recaptcha/docs/v3#interpreting_the_score}
 * ">Google reCaptcha APIv3 verification score interpretation</a>.
 */
@Component
public class RiskAnalysisAlgo {
    private final double LOWER_THRESHOLD = 0.5;

    /**
     * This method implements the calculation for the transaction risk.
     * 
     * @param reCaptchaScore the score of the recaptcha site verification response.
     * @return true for risky transactions, otherwise false.
     */
    public boolean isSecureTransaction(double reCaptchaScore) {
	return (reCaptchaScore > LOWER_THRESHOLD) ? true : false;
    }
}