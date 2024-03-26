package com.konfigthis.client;

import com.konfigthis.client.api.BatchApi;
import com.konfigthis.client.api.CheckoutV2GenerationApi;
import com.konfigthis.client.api.CheckoutGenerationApi;
import com.konfigthis.client.api.FilesApi;
import com.konfigthis.client.api.HelpersApi;
import com.konfigthis.client.api.PaymentApi;
import com.konfigthis.client.api.PaymentsApiInboundApi;
import com.konfigthis.client.api.PaymentsApiOutboundApi;
import com.konfigthis.client.api.StatusApi;

public class PeachPayments {
    private ApiClient apiClient;
    public final BatchApi batch;
    public final CheckoutV2GenerationApi checkoutV2Generation;
    public final CheckoutGenerationApi checkoutGeneration;
    public final FilesApi files;
    public final HelpersApi helpers;
    public final PaymentApi payment;
    public final PaymentsApiInboundApi paymentsApiInbound;
    public final PaymentsApiOutboundApi paymentsApiOutbound;
    public final StatusApi status;

    public PeachPayments() {
        this(null);
    }

    public PeachPayments(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.batch = new BatchApi(this.apiClient);
        this.checkoutV2Generation = new CheckoutV2GenerationApi(this.apiClient);
        this.checkoutGeneration = new CheckoutGenerationApi(this.apiClient);
        this.files = new FilesApi(this.apiClient);
        this.helpers = new HelpersApi(this.apiClient);
        this.payment = new PaymentApi(this.apiClient);
        this.paymentsApiInbound = new PaymentsApiInboundApi(this.apiClient);
        this.paymentsApiOutbound = new PaymentsApiOutboundApi(this.apiClient);
        this.status = new StatusApi(this.apiClient);
    }

}
