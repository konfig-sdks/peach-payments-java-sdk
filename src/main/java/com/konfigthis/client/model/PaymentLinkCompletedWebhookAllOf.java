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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * PaymentLinkCompletedWebhookAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaymentLinkCompletedWebhookAllOf {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status = "completed";

  /**
   * Payment brand used to complete the payment.
   */
  @JsonAdapter(PaymentBrandEnum.Adapter.class)
 public enum PaymentBrandEnum {
    VISA("VISA"),
    
    MASTERCARD("MASTERCARD"),
    
    DINERS_CLUB("DINERS CLUB"),
    
    AMERICAN_EXPRESS("AMERICAN EXPRESS"),
    
    MASTERPASS("MASTERPASS"),
    
    MOBICRED("MOBICRED"),
    
    EFTSECURE("EFTSECURE"),
    
    MPESA("MPESA"),
    
    _1FORYOU("1FORYOU"),
    
    APLUS("APLUS"),
    
    PAYPAL("PAYPAL"),
    
    ZEROPAY("ZEROPAY"),
    
    PAYFLEX("PAYFLEX"),
    
    STITCHEFT("STITCHEFT"),
    
    FINCHOICEPAY("FINCHOICEPAY"),
    
    BLINKBYEMTEL("BLINKBYEMTEL"),
    
    CAPITECPAY("CAPITECPAY");

    private String value;

    PaymentBrandEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentBrandEnum fromValue(String value) {
      for (PaymentBrandEnum b : PaymentBrandEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentBrandEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentBrandEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentBrandEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentBrandEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_BRAND = "paymentBrand";
  @SerializedName(SERIALIZED_NAME_PAYMENT_BRAND)
  private PaymentBrandEnum paymentBrand;

  public static final String SERIALIZED_NAME_REGISTRATION_ID = "registrationId";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_ID)
  private String registrationId;

  public PaymentLinkCompletedWebhookAllOf() {
  }

  public PaymentLinkCompletedWebhookAllOf status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "completed", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public PaymentLinkCompletedWebhookAllOf paymentBrand(PaymentBrandEnum paymentBrand) {
    
    
    
    
    this.paymentBrand = paymentBrand;
    return this;
  }

   /**
   * Payment brand used to complete the payment.
   * @return paymentBrand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payment brand used to complete the payment.")

  public PaymentBrandEnum getPaymentBrand() {
    return paymentBrand;
  }


  public void setPaymentBrand(PaymentBrandEnum paymentBrand) {
    
    
    
    this.paymentBrand = paymentBrand;
  }


  public PaymentLinkCompletedWebhookAllOf registrationId(String registrationId) {
    
    
    
    
    this.registrationId = registrationId;
    return this;
  }

   /**
   * Card registration token, if tokeniseCard was set to true on initial request and paymentBrand is a card type.
   * @return registrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8ac7a4a188e7cf090188f7112dbe389a", value = "Card registration token, if tokeniseCard was set to true on initial request and paymentBrand is a card type.")

  public String getRegistrationId() {
    return registrationId;
  }


  public void setRegistrationId(String registrationId) {
    
    
    
    this.registrationId = registrationId;
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
   * @return the PaymentLinkCompletedWebhookAllOf instance itself
   */
  public PaymentLinkCompletedWebhookAllOf putAdditionalProperty(String key, Object value) {
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
    PaymentLinkCompletedWebhookAllOf paymentLinkCompletedWebhookAllOf = (PaymentLinkCompletedWebhookAllOf) o;
    return Objects.equals(this.status, paymentLinkCompletedWebhookAllOf.status) &&
        Objects.equals(this.paymentBrand, paymentLinkCompletedWebhookAllOf.paymentBrand) &&
        Objects.equals(this.registrationId, paymentLinkCompletedWebhookAllOf.registrationId)&&
        Objects.equals(this.additionalProperties, paymentLinkCompletedWebhookAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, paymentBrand, registrationId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentLinkCompletedWebhookAllOf {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paymentBrand: ").append(toIndentedString(paymentBrand)).append("\n");
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("paymentBrand");
    openapiFields.add("registrationId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentLinkCompletedWebhookAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentLinkCompletedWebhookAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentLinkCompletedWebhookAllOf is not found in the empty JSON string", PaymentLinkCompletedWebhookAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("paymentBrand") != null && !jsonObj.get("paymentBrand").isJsonNull()) && !jsonObj.get("paymentBrand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentBrand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentBrand").toString()));
      }
      if ((jsonObj.get("registrationId") != null && !jsonObj.get("registrationId").isJsonNull()) && !jsonObj.get("registrationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registrationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrationId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentLinkCompletedWebhookAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentLinkCompletedWebhookAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentLinkCompletedWebhookAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentLinkCompletedWebhookAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentLinkCompletedWebhookAllOf>() {
           @Override
           public void write(JsonWriter out, PaymentLinkCompletedWebhookAllOf value) throws IOException {
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
           public PaymentLinkCompletedWebhookAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentLinkCompletedWebhookAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaymentLinkCompletedWebhookAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentLinkCompletedWebhookAllOf
  * @throws IOException if the JSON string is invalid with respect to PaymentLinkCompletedWebhookAllOf
  */
  public static PaymentLinkCompletedWebhookAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentLinkCompletedWebhookAllOf.class);
  }

 /**
  * Convert an instance of PaymentLinkCompletedWebhookAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

