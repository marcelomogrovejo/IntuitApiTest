package com.intuit.service;

import com.intuit.ipp.aggcat.core.Context;
import com.intuit.ipp.aggcat.core.OAuthAuthorizer;
import com.intuit.ipp.aggcat.exception.AggCatException;
import com.intuit.ipp.aggcat.service.AggCatService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AggCatApiService {

    private static final String OAUTH_CONSUMER_KEY = "lvprdLVDKSxrBnUM82MEVd2PJAOxg0";
    private static final String OAUTH_CONSUMER_SECRET = "DPpFoejDe4XHJdtqxv4TVpg05xKU097yyJgv3UaQ";
    private static final String SAML_PROVIDER_ID = "trizicapp.32341.cc.dev-intuit.ipp.prod";
    private static final String USER_ID = "user";
    
    private static final Logger LOG = LoggerFactory.getLogger(AggCatApiService.class);

    /**
     * This method will first create OAuthAuthorizer instance using consumerkey, consumersecret samlproviderid and user id. This OAuthAuthorizer
     * object will be used to create the context object, which in turn is used to create the AggCatService instance.
     * 
     * @param userId
     * @return AggCatService
     * @throws AggCatException
     */
    public AggCatService getAggCatService() throws AggCatException {
        AggCatService service = null;
        try {
            /**
             * Creating the OAuthAuthorizer instance using OAUTH_CONSUMER_KEY,OAUTH_CONSUMER_SECRET,SAML_PROVIDER_ID and userId. In this step, the
             * oAuth accesstoken,accesstokensecret are generated and the OAuthAuthorizer instance is ready to use for generating the context instance
             */
            OAuthAuthorizer oauthAuthorizer = new OAuthAuthorizer(OAUTH_CONSUMER_KEY, OAUTH_CONSUMER_SECRET, SAML_PROVIDER_ID, USER_ID);

            /**
             * Using the OAuthAuthorizer instance to create the context.
             */
            Context context = new Context(oauthAuthorizer);
            /**
             * Using the context instance to create the AggCatService.
             */
            service = new AggCatService(context);

        } catch (AggCatException ex) {
            LOG.error(ex.getMessage());
            throw new AggCatException("Exception while generating OAuth tokens. Please check whether the configured keys and cert files are valid.",
                    ex);
        }
        return service;

    }
    
    
}
