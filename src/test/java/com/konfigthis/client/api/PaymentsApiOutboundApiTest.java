/*
 * Payments API inbound
 * The Payments API enables you to do a custom integration with Peach Payments and thereby support multiple payment methods.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@peachpayments.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.JSONMerchantWebhook;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsApiOutboundApi
 */
@Disabled
public class PaymentsApiOutboundApiTest {

    private static PaymentsApiOutboundApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PaymentsApiOutboundApi(apiClient);
    }

    /**
     * Merchant webhook
     *
     * Encrypted and decrypted webhook sent to merchant - retries if response HTTP status code is not 200.  For more information, see the [documentation](https://developer.peachpayments.com/docs/payments-api-flows#webhook-flow). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void webhookTest() throws ApiException {
        String encryptedData = null;
        String xInitializationVector = null;
        String xAuthenticationTag = null;
        api.webhook()
                .encryptedData(encryptedData)
                .xInitializationVector(xInitializationVector)
                .xAuthenticationTag(xAuthenticationTag)
                .execute();
        // TODO: test validations
    }

}
