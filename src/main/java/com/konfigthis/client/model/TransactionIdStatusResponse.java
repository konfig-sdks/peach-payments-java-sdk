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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.Bank;
import com.konfigthis.client.model.PaymentBrand;
import com.konfigthis.client.model.PaymentType;
import com.konfigthis.client.model.Recon;
import com.konfigthis.client.model.ResponseCard;
import com.konfigthis.client.model.Result;
import com.konfigthis.client.model.ResultDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * The response for the status request using transactionId as the query field.
 */
@ApiModel(description = "The response for the status request using transactionId as the query field.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TransactionIdStatusResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MERCHANT_TRANSACTION_ID = "merchantTransactionId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_TRANSACTION_ID)
  private String merchantTransactionId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_PAYMENT_BRAND = "paymentBrand";
  @SerializedName(SERIALIZED_NAME_PAYMENT_BRAND)
  private PaymentBrand paymentBrand;

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "paymentType";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private PaymentType paymentType;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Result result;

  public static final String SERIALIZED_NAME_RESULT_DETAILS = "resultDetails";
  @SerializedName(SERIALIZED_NAME_RESULT_DETAILS)
  private ResultDetails resultDetails;

  public static final String SERIALIZED_NAME_CONNECTOR_TX_I_D1 = "connectorTxID1";
  @SerializedName(SERIALIZED_NAME_CONNECTOR_TX_I_D1)
  private String connectorTxID1;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_CUSTOM_PARAMETERS = "customParameters";
  @SerializedName(SERIALIZED_NAME_CUSTOM_PARAMETERS)
  private Object customParameters;

  public static final String SERIALIZED_NAME_MERCHANT_INVOICE_ID = "merchantInvoiceId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_INVOICE_ID)
  private String merchantInvoiceId;

  public static final String SERIALIZED_NAME_BANK = "bank";
  @SerializedName(SERIALIZED_NAME_BANK)
  private Bank bank;

  public static final String SERIALIZED_NAME_CARD = "card";
  @SerializedName(SERIALIZED_NAME_CARD)
  private ResponseCard card;

  public static final String SERIALIZED_NAME_RECON = "recon";
  @SerializedName(SERIALIZED_NAME_RECON)
  private Recon recon;

  public TransactionIdStatusResponse() {
  }

  public TransactionIdStatusResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The unique transaction ID provided by Peach Payments.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "b4508276b8d146728dac871d6f68b45d", required = true, value = "The unique transaction ID provided by Peach Payments.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public TransactionIdStatusResponse merchantTransactionId(String merchantTransactionId) {
    
    
    
    
    this.merchantTransactionId = merchantTransactionId;
    return this;
  }

   /**
   * Merchant-provided reference number, often used for reconciliation.
   * @return merchantTransactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "test12345", required = true, value = "Merchant-provided reference number, often used for reconciliation.")

  public String getMerchantTransactionId() {
    return merchantTransactionId;
  }


  public void setMerchantTransactionId(String merchantTransactionId) {
    
    
    
    this.merchantTransactionId = merchantTransactionId;
  }


  public TransactionIdStatusResponse amount(String amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * The payment request amount.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "22.50", required = true, value = "The payment request amount.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    
    
    
    this.amount = amount;
  }


  public TransactionIdStatusResponse currency(String currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency code of the payment request amount as defined by ISO-4217.
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ZAR", required = true, value = "The currency code of the payment request amount as defined by ISO-4217.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    
    this.currency = currency;
  }


  public TransactionIdStatusResponse paymentBrand(PaymentBrand paymentBrand) {
    
    
    
    
    this.paymentBrand = paymentBrand;
    return this;
  }

   /**
   * Get paymentBrand
   * @return paymentBrand
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PaymentBrand getPaymentBrand() {
    return paymentBrand;
  }


  public void setPaymentBrand(PaymentBrand paymentBrand) {
    
    
    
    this.paymentBrand = paymentBrand;
  }


  public TransactionIdStatusResponse paymentType(PaymentType paymentType) {
    
    
    
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PaymentType getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(PaymentType paymentType) {
    
    
    
    this.paymentType = paymentType;
  }


  public TransactionIdStatusResponse result(Result result) {
    
    
    
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Result getResult() {
    return result;
  }


  public void setResult(Result result) {
    
    
    
    this.result = result;
  }


  public TransactionIdStatusResponse resultDetails(ResultDetails resultDetails) {
    
    
    
    
    this.resultDetails = resultDetails;
    return this;
  }

   /**
   * Get resultDetails
   * @return resultDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResultDetails getResultDetails() {
    return resultDetails;
  }


  public void setResultDetails(ResultDetails resultDetails) {
    
    
    
    this.resultDetails = resultDetails;
  }


  public TransactionIdStatusResponse connectorTxID1(String connectorTxID1) {
    
    
    
    
    this.connectorTxID1 = connectorTxID1;
    return this;
  }

   /**
   * The unique transaction identifier provided by the payment service provider.
   * @return connectorTxID1
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8ac7a49f7921f2fd0179230196ec4bbe", required = true, value = "The unique transaction identifier provided by the payment service provider.")

  public String getConnectorTxID1() {
    return connectorTxID1;
  }


  public void setConnectorTxID1(String connectorTxID1) {
    
    
    
    this.connectorTxID1 = connectorTxID1;
  }


  public TransactionIdStatusResponse timestamp(OffsetDateTime timestamp) {
    
    
    
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp of the transaction.
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2021-04-23T07:41:25.519947Z", required = true, value = "The timestamp of the transaction.")

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    
    
    
    this.timestamp = timestamp;
  }


  public TransactionIdStatusResponse customParameters(Object customParameters) {
    
    
    
    
    this.customParameters = customParameters;
    return this;
  }

   /**
   * A JSON object depicting custom information sent by the merchant. Echoed back in the response.
   * @return customParameters
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A JSON object depicting custom information sent by the merchant. Echoed back in the response.")

  public Object getCustomParameters() {
    return customParameters;
  }


  public void setCustomParameters(Object customParameters) {
    
    
    
    this.customParameters = customParameters;
  }


  public TransactionIdStatusResponse merchantInvoiceId(String merchantInvoiceId) {
    
    
    
    
    this.merchantInvoiceId = merchantInvoiceId;
    return this;
  }

   /**
   * The merchant&#39;s invoice ID.
   * @return merchantInvoiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170630407200", value = "The merchant's invoice ID.")

  public String getMerchantInvoiceId() {
    return merchantInvoiceId;
  }


  public void setMerchantInvoiceId(String merchantInvoiceId) {
    
    
    
    this.merchantInvoiceId = merchantInvoiceId;
  }


  public TransactionIdStatusResponse bank(Bank bank) {
    
    
    
    
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Bank getBank() {
    return bank;
  }


  public void setBank(Bank bank) {
    
    
    
    this.bank = bank;
  }


  public TransactionIdStatusResponse card(ResponseCard card) {
    
    
    
    
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResponseCard getCard() {
    return card;
  }


  public void setCard(ResponseCard card) {
    
    
    
    this.card = card;
  }


  public TransactionIdStatusResponse recon(Recon recon) {
    
    
    
    
    this.recon = recon;
    return this;
  }

   /**
   * Get recon
   * @return recon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Recon getRecon() {
    return recon;
  }


  public void setRecon(Recon recon) {
    
    
    
    this.recon = recon;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the TransactionIdStatusResponse instance itself
   */
  public TransactionIdStatusResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionIdStatusResponse transactionIdStatusResponse = (TransactionIdStatusResponse) o;
    return Objects.equals(this.id, transactionIdStatusResponse.id) &&
        Objects.equals(this.merchantTransactionId, transactionIdStatusResponse.merchantTransactionId) &&
        Objects.equals(this.amount, transactionIdStatusResponse.amount) &&
        Objects.equals(this.currency, transactionIdStatusResponse.currency) &&
        Objects.equals(this.paymentBrand, transactionIdStatusResponse.paymentBrand) &&
        Objects.equals(this.paymentType, transactionIdStatusResponse.paymentType) &&
        Objects.equals(this.result, transactionIdStatusResponse.result) &&
        Objects.equals(this.resultDetails, transactionIdStatusResponse.resultDetails) &&
        Objects.equals(this.connectorTxID1, transactionIdStatusResponse.connectorTxID1) &&
        Objects.equals(this.timestamp, transactionIdStatusResponse.timestamp) &&
        Objects.equals(this.customParameters, transactionIdStatusResponse.customParameters) &&
        Objects.equals(this.merchantInvoiceId, transactionIdStatusResponse.merchantInvoiceId) &&
        Objects.equals(this.bank, transactionIdStatusResponse.bank) &&
        Objects.equals(this.card, transactionIdStatusResponse.card) &&
        Objects.equals(this.recon, transactionIdStatusResponse.recon)&&
        Objects.equals(this.additionalProperties, transactionIdStatusResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, merchantTransactionId, amount, currency, paymentBrand, paymentType, result, resultDetails, connectorTxID1, timestamp, customParameters, merchantInvoiceId, bank, card, recon, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionIdStatusResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    merchantTransactionId: ").append(toIndentedString(merchantTransactionId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paymentBrand: ").append(toIndentedString(paymentBrand)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    resultDetails: ").append(toIndentedString(resultDetails)).append("\n");
    sb.append("    connectorTxID1: ").append(toIndentedString(connectorTxID1)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
    sb.append("    merchantInvoiceId: ").append(toIndentedString(merchantInvoiceId)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    recon: ").append(toIndentedString(recon)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("merchantTransactionId");
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("paymentBrand");
    openapiFields.add("paymentType");
    openapiFields.add("result");
    openapiFields.add("resultDetails");
    openapiFields.add("connectorTxID1");
    openapiFields.add("timestamp");
    openapiFields.add("customParameters");
    openapiFields.add("merchantInvoiceId");
    openapiFields.add("bank");
    openapiFields.add("card");
    openapiFields.add("recon");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("merchantTransactionId");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("paymentBrand");
    openapiRequiredFields.add("paymentType");
    openapiRequiredFields.add("result");
    openapiRequiredFields.add("connectorTxID1");
    openapiRequiredFields.add("timestamp");
    openapiRequiredFields.add("customParameters");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionIdStatusResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TransactionIdStatusResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionIdStatusResponse is not found in the empty JSON string", TransactionIdStatusResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionIdStatusResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("merchantTransactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantTransactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantTransactionId").toString()));
      }
      if (!jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // validate the required field `result`
      Result.validateJsonObject(jsonObj.getAsJsonObject("result"));
      // validate the optional field `resultDetails`
      if (jsonObj.get("resultDetails") != null && !jsonObj.get("resultDetails").isJsonNull()) {
        ResultDetails.validateJsonObject(jsonObj.getAsJsonObject("resultDetails"));
      }
      if (!jsonObj.get("connectorTxID1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connectorTxID1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connectorTxID1").toString()));
      }
      if ((jsonObj.get("merchantInvoiceId") != null && !jsonObj.get("merchantInvoiceId").isJsonNull()) && !jsonObj.get("merchantInvoiceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantInvoiceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantInvoiceId").toString()));
      }
      // validate the optional field `bank`
      if (jsonObj.get("bank") != null && !jsonObj.get("bank").isJsonNull()) {
        Bank.validateJsonObject(jsonObj.getAsJsonObject("bank"));
      }
      // validate the optional field `card`
      if (jsonObj.get("card") != null && !jsonObj.get("card").isJsonNull()) {
        ResponseCard.validateJsonObject(jsonObj.getAsJsonObject("card"));
      }
      // validate the optional field `recon`
      if (jsonObj.get("recon") != null && !jsonObj.get("recon").isJsonNull()) {
        Recon.validateJsonObject(jsonObj.getAsJsonObject("recon"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionIdStatusResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionIdStatusResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionIdStatusResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionIdStatusResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionIdStatusResponse>() {
           @Override
           public void write(JsonWriter out, TransactionIdStatusResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionIdStatusResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TransactionIdStatusResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionIdStatusResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionIdStatusResponse
  * @throws IOException if the JSON string is invalid with respect to TransactionIdStatusResponse
  */
  public static TransactionIdStatusResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionIdStatusResponse.class);
  }

 /**
  * Convert an instance of TransactionIdStatusResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

