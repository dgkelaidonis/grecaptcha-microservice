# grecaptcha-microservice
<p>
This is a Maven project, that implements the server side verification of the Google ReCaptcha mechanism for the verification of end-users of websites/webapps. The development has been done according to the APIv3 specifications, that are available <a href="https://developers.google.com/recaptcha/docs/v3">here</a>.
</p>
<p>
The implementation outcome corresponds to a spring-boot microservice, that can be directly enabled into the context of any spring-boot application. The end-users/developers can import the GoogleReCaptcha microservice on their spring-boot projects, enabling the introduction of the reCaptcha protection mechanism, for their frontend modules, such as websites and web applications.
</p>
<h3>How it works</h3>
<p>
Please refer first on the <a href="https://developers.google.com/recaptcha">official documentation</a> for understanding how the Google reCAPTCHA service works.
As you will see in the above guide, the Google reCAPTCHA service, for each request, it produces a unique token for the website/webapp client. This token should be manipulated by the frontend side so as to be used for the site's user verification though the grecaptcha-microservice.</p>
<p>
As soon as the grecaptcha-microservice is enabled on a spring-boot application, it auto-configures and deploys a REST endpoint, that receives the above token to perform the verification of the user requests, following the APIv3 specifications <a href="https://developers.google.com/recaptcha/docs/v3#site_verify_response">here</a>.</p>
<p>As a final result, the microservice returns a response that determines whether a transaction is risky, complemented with a URL that corresponds to a protected (by reCAPTCHA) resource.
</p>
<h3>Instructions</h3>
<p>
To enable and use the GoogleReCaptcha spring-boot microservice you should completing the following steps:
<ol>
<li>First register your site keys on <a href="https://www.google.com/recaptcha/admin/create">Google Admin Console</a>.
<li>Put the generated keys into the corresponding variables in the application.properties file.</li>
<li>Set you website/webapp and/or http client for communicating with grecaptcha-microservice on its URL.</li>
<li>Configure the frontend side, using the public key of your site, and the corresponding JavaScript code part for enabling reCaptcha module on your website/webapp.</li>
<li>Enjoy!</li>
</ol>
</p>
