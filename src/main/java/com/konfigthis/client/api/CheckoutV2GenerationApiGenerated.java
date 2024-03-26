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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.CheckoutV2;
import com.konfigthis.client.model.CheckoutV2Billing;
import com.konfigthis.client.model.CheckoutV2Customer;
import com.konfigthis.client.model.CheckoutV2GenerationInitiateCheckoutInstanceResponse;
import com.konfigthis.client.model.CheckoutV2Shipping;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CheckoutV2GenerationApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CheckoutV2GenerationApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public CheckoutV2GenerationApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call initiateCheckoutInstanceCall(String referer, CheckoutV2 checkoutV2, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = checkoutV2;

        // create path and map variables
        String localVarPath = "/v2/checkout";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (referer != null) {
            localVarHeaderParams.put("Referer", localVarApiClient.parameterToString(referer));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json",
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call initiateCheckoutInstanceValidateBeforeCall(String referer, CheckoutV2 checkoutV2, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'referer' is set
        if (referer == null) {
            throw new ApiException("Missing the required parameter 'referer' when calling initiateCheckoutInstance(Async)");
        }

        // verify the required parameter 'checkoutV2' is set
        if (checkoutV2 == null) {
            throw new ApiException("Missing the required parameter 'checkoutV2' when calling initiateCheckoutInstance(Async)");
        }

        return initiateCheckoutInstanceCall(referer, checkoutV2, _callback);

    }


    private ApiResponse<CheckoutV2GenerationInitiateCheckoutInstanceResponse> initiateCheckoutInstanceWithHttpInfo(String referer, CheckoutV2 checkoutV2) throws ApiException {
        okhttp3.Call localVarCall = initiateCheckoutInstanceValidateBeforeCall(referer, checkoutV2, null);
        Type localVarReturnType = new TypeToken<CheckoutV2GenerationInitiateCheckoutInstanceResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call initiateCheckoutInstanceAsync(String referer, CheckoutV2 checkoutV2, final ApiCallback<CheckoutV2GenerationInitiateCheckoutInstanceResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = initiateCheckoutInstanceValidateBeforeCall(referer, checkoutV2, _callback);
        Type localVarReturnType = new TypeToken<CheckoutV2GenerationInitiateCheckoutInstanceResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class InitiateCheckoutInstanceRequestBuilder {
        private final String authenticationEntityId;
        private final String merchantTransactionId;
        private final Double amount;
        private final String currency;
        private final String nonce;
        private final String shopperResultUrl;
        private final String referer;
        private String defaultPaymentMethod;
        private Boolean forceDefaultMethod;
        private String merchantInvoiceId;
        private String cancelUrl;
        private String notificationUrl;
        private Map<String, String> customParameters;
        private CheckoutV2Customer customer;
        private CheckoutV2Billing billing;
        private CheckoutV2Shipping shipping;
        private Boolean createRegistration;
        private String originator;
        private String returnTo;

        private InitiateCheckoutInstanceRequestBuilder(String authenticationEntityId, String merchantTransactionId, double amount, String currency, String nonce, String shopperResultUrl, String referer) {
            this.authenticationEntityId = authenticationEntityId;
            this.merchantTransactionId = merchantTransactionId;
            this.amount = amount;
            this.currency = currency;
            this.nonce = nonce;
            this.shopperResultUrl = shopperResultUrl;
            this.referer = referer;
        }

        /**
         * Set defaultPaymentMethod
         * @param defaultPaymentMethod The preferred payment method which is active in the checkout page at the point of redirecting. (optional)
         * @return InitiateCheckoutInstanceRequestBuilder
         */
        public InitiateCheckoutInstanceRequestBuilder defaultPaymentMethod(String defaultPaymentMethod) {
            this.defaultPaymentMethod = defaultPaymentMethod;
            return this;
        }
        
        /**
         * Set forceDefaultMethod
         * @param forceDefaultMethod Force the default payment method to be the only payment method. (optional, default to false)
         * @return InitiateCheckoutInstanceRequestBuilder
         */
        public InitiateCheckoutInstanceRequestBuilder forceDefaultMethod(Boolean forceDefaultMethod) {
            this.forceDefaultMethod = forceDefaultMethod;
            return this;
        }
        
        /**
         * Set merchantInvoiceId
         * @param merchantInvoiceId Merchant-provided invoice number unique for your transactions. This identifier is not sent onwards. (optional)
         * @return InitiateCheckoutInstanceRequestBuilder
         */
        public InitiateCheckoutInstanceRequestBuilder merchantInvoiceId(String merchantInvoiceId) {
            this.merchantInvoiceId = merchantInvoiceId;
            return this;
        }
        
        /**
         * Set cancelUrl
         * @param cancelUrl The customer is redirected to this URL if they cancel checkout. It must be a valid URL that can be reached through a browser. (optional)
         * @return InitiateCheckoutInstanceRequestBuilder
         */
        public InitiateCheckoutInstanceRequestBuilder cancelUrl(String cancelUrl) {
            this.cancelUrl = cancelUrl;
            return this;
        }
        
        /**
         * Set notificationUrl
         * @param notificationUrl Override the preconfigured webhook URL for this checkout instance, any changes to checkout send a webhook to this URL. (optional)
         * @return InitiateCheckoutInstanceRequestBuilder
         */
        public InitiateCheckoutInstanceRequestBuilder notificationUrl(String notificationUrl) {
            this.notificationUrl = notificationUrl;
            return this;
        }
        
        /**
         * Set customParameters
         * @param customParameters A name value pair used for sending custom information. (optional)
         * @return InitiateCheckoutInstanceRequestBuilder
         */
        public InitiateCheckoutInstanceRequestBuilder customParameters(Map<String, String> customParameters) {
            this.customParameters = customParameters;
            return this;
        }
        
        /**
         * Set customer
         * @param customer  (optional)
         * @return InitiateCheckoutInstanceRequestBuilder
         */
        public InitiateCheckoutInstanceRequestBuilder customer(CheckoutV2Customer customer) {
            this.customer = customer;
            return this;
        }
        
        /**
         * Set billing
         * @param billing  (optional)
         * @return InitiateCheckoutInstanceRequestBuilder
         */
        public InitiateCheckoutInstanceRequestBuilder billing(CheckoutV2Billing billing) {
            this.billing = billing;
            return this;
        }
        
        /**
         * Set shipping
         * @param shipping  (optional)
         * @return InitiateCheckoutInstanceRequestBuilder
         */
        public InitiateCheckoutInstanceRequestBuilder shipping(CheckoutV2Shipping shipping) {
            this.shipping = shipping;
            return this;
        }
        
        /**
         * Set createRegistration
         * @param createRegistration Used to enable card tokenisation with COPYandPAY. (optional)
         * @return InitiateCheckoutInstanceRequestBuilder
         */
        public InitiateCheckoutInstanceRequestBuilder createRegistration(Boolean createRegistration) {
            this.createRegistration = createRegistration;
            return this;
        }
        
        /**
         * Set originator
         * @param originator Used to provide a name for the application that is creating the checkout instance. (optional)
         * @return InitiateCheckoutInstanceRequestBuilder
         */
        public InitiateCheckoutInstanceRequestBuilder originator(String originator) {
            this.originator = originator;
            return this;
        }
        
        /**
         * Set returnTo
         * @param returnTo Text to display on \\\&quot;Return to Store\\\&quot; button on completing checkout. (optional)
         * @return InitiateCheckoutInstanceRequestBuilder
         */
        public InitiateCheckoutInstanceRequestBuilder returnTo(String returnTo) {
            this.returnTo = returnTo;
            return this;
        }
        
        /**
         * Build call for initiateCheckoutInstance
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Checkout successfully created. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            CheckoutV2 checkoutV2 = buildBodyParams();
            return initiateCheckoutInstanceCall(referer, checkoutV2, _callback);
        }

        private CheckoutV2 buildBodyParams() {
            CheckoutV2 checkoutV2 = new CheckoutV2();
            checkoutV2.authenticationEntityId(this.authenticationEntityId);
            checkoutV2.merchantTransactionId(this.merchantTransactionId);
            checkoutV2.amount(this.amount);
            if (this.currency != null)
            checkoutV2.currency(CheckoutV2.CurrencyEnum.fromValue(this.currency));
            checkoutV2.nonce(this.nonce);
            checkoutV2.shopperResultUrl(this.shopperResultUrl);
            if (this.defaultPaymentMethod != null)
            checkoutV2.defaultPaymentMethod(CheckoutV2.DefaultPaymentMethodEnum.fromValue(this.defaultPaymentMethod));
            checkoutV2.forceDefaultMethod(this.forceDefaultMethod);
            checkoutV2.merchantInvoiceId(this.merchantInvoiceId);
            checkoutV2.cancelUrl(this.cancelUrl);
            checkoutV2.notificationUrl(this.notificationUrl);
            checkoutV2.customParameters(this.customParameters);
            checkoutV2.customer(this.customer);
            checkoutV2.billing(this.billing);
            checkoutV2.shipping(this.shipping);
            checkoutV2.createRegistration(this.createRegistration);
            checkoutV2.originator(this.originator);
            if (this.returnTo != null)
            checkoutV2.returnTo(CheckoutV2.ReturnToEnum.fromValue(this.returnTo));
            return checkoutV2;
        }

        /**
         * Execute initiateCheckoutInstance request
         * @return CheckoutV2GenerationInitiateCheckoutInstanceResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Checkout successfully created. </td><td>  -  </td></tr>
         </table>
         */
        public CheckoutV2GenerationInitiateCheckoutInstanceResponse execute() throws ApiException {
            CheckoutV2 checkoutV2 = buildBodyParams();
            ApiResponse<CheckoutV2GenerationInitiateCheckoutInstanceResponse> localVarResp = initiateCheckoutInstanceWithHttpInfo(referer, checkoutV2);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute initiateCheckoutInstance request with HTTP info returned
         * @return ApiResponse&lt;CheckoutV2GenerationInitiateCheckoutInstanceResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Checkout successfully created. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CheckoutV2GenerationInitiateCheckoutInstanceResponse> executeWithHttpInfo() throws ApiException {
            CheckoutV2 checkoutV2 = buildBodyParams();
            return initiateCheckoutInstanceWithHttpInfo(referer, checkoutV2);
        }

        /**
         * Execute initiateCheckoutInstance request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Checkout successfully created. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CheckoutV2GenerationInitiateCheckoutInstanceResponse> _callback) throws ApiException {
            CheckoutV2 checkoutV2 = buildBodyParams();
            return initiateCheckoutInstanceAsync(referer, checkoutV2, _callback);
        }
    }

    /**
     * Initiate Checkout
     * Create a checkout instance for use from Embedded Checkout.  For more information, see the [documentation](https://developer.peachpayments.com/docs/checkout-embedded-tutorial#tutorial).  
     * @param referer An allowlisted domain for the merchant. (required)
     * @param checkoutV2  (required)
     * @return InitiateCheckoutInstanceRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Checkout successfully created. </td><td>  -  </td></tr>
     </table>
     */
    public InitiateCheckoutInstanceRequestBuilder initiateCheckoutInstance(String authenticationEntityId, String merchantTransactionId, double amount, String currency, String nonce, String shopperResultUrl, String referer) throws IllegalArgumentException {
        if (authenticationEntityId == null) throw new IllegalArgumentException("\"authenticationEntityId\" is required but got null");
            

        if (merchantTransactionId == null) throw new IllegalArgumentException("\"merchantTransactionId\" is required but got null");
            if (merchantTransactionId != null && merchantTransactionId.length() < 8) {
              throw new IllegalArgumentException("Invalid value for merchantTransactionId. Length must be greater than or equal to 8.");
            }

        
        if (currency == null) throw new IllegalArgumentException("\"currency\" is required but got null");
            

        if (nonce == null) throw new IllegalArgumentException("\"nonce\" is required but got null");
            if (nonce != null && nonce.length() < 1) {
              throw new IllegalArgumentException("Invalid value for nonce. Length must be greater than or equal to 1.");
            }

        if (shopperResultUrl == null) throw new IllegalArgumentException("\"shopperResultUrl\" is required but got null");
            

        if (referer == null) throw new IllegalArgumentException("\"referer\" is required but got null");
            

        return new InitiateCheckoutInstanceRequestBuilder(authenticationEntityId, merchantTransactionId, amount, currency, nonce, shopperResultUrl, referer);
    }
}
