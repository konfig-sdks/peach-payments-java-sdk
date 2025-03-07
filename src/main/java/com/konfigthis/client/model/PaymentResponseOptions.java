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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * PaymentResponseOptions
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaymentResponseOptions {
  public static final String SERIALIZED_NAME_SEND_EMAIL = "sendEmail";
  @SerializedName(SERIALIZED_NAME_SEND_EMAIL)
  private Boolean sendEmail = false;

  public static final String SERIALIZED_NAME_SEND_SMS = "sendSms";
  @SerializedName(SERIALIZED_NAME_SEND_SMS)
  private Boolean sendSms = false;

  public static final String SERIALIZED_NAME_SEND_WHATSAPP = "sendWhatsapp";
  @SerializedName(SERIALIZED_NAME_SEND_WHATSAPP)
  private Boolean sendWhatsapp = false;

  public static final String SERIALIZED_NAME_EMAIL_CC = "emailCc";
  @SerializedName(SERIALIZED_NAME_EMAIL_CC)
  private String emailCc;

  public static final String SERIALIZED_NAME_EMAIL_BCC = "emailBcc";
  @SerializedName(SERIALIZED_NAME_EMAIL_BCC)
  private String emailBcc;

  public static final String SERIALIZED_NAME_NOTIFICATION_URL = "notificationUrl";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_URL)
  private String notificationUrl;

  public PaymentResponseOptions() {
  }

  public PaymentResponseOptions sendEmail(Boolean sendEmail) {
    
    
    
    
    this.sendEmail = sendEmail;
    return this;
  }

   /**
   * Indicates whether to send an email to the customer after creating the payment link.
   * @return sendEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicates whether to send an email to the customer after creating the payment link.")

  public Boolean getSendEmail() {
    return sendEmail;
  }


  public void setSendEmail(Boolean sendEmail) {
    
    
    
    this.sendEmail = sendEmail;
  }


  public PaymentResponseOptions sendSms(Boolean sendSms) {
    
    
    
    
    this.sendSms = sendSms;
    return this;
  }

   /**
   * Indicates whether to send an SMS to the customer after creating the payment link.
   * @return sendSms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicates whether to send an SMS to the customer after creating the payment link.")

  public Boolean getSendSms() {
    return sendSms;
  }


  public void setSendSms(Boolean sendSms) {
    
    
    
    this.sendSms = sendSms;
  }


  public PaymentResponseOptions sendWhatsapp(Boolean sendWhatsapp) {
    
    
    
    
    this.sendWhatsapp = sendWhatsapp;
    return this;
  }

   /**
   * Indicates whether to send a WhatsApp message to the customer after creating the payment link.
   * @return sendWhatsapp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicates whether to send a WhatsApp message to the customer after creating the payment link.")

  public Boolean getSendWhatsapp() {
    return sendWhatsapp;
  }


  public void setSendWhatsapp(Boolean sendWhatsapp) {
    
    
    
    this.sendWhatsapp = sendWhatsapp;
  }


  public PaymentResponseOptions emailCc(String emailCc) {
    
    
    
    
    this.emailCc = emailCc;
    return this;
  }

   /**
   * List of comma-separated email addresses to CC.
   * @return emailCc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ccexample@mail.com", value = "List of comma-separated email addresses to CC.")

  public String getEmailCc() {
    return emailCc;
  }


  public void setEmailCc(String emailCc) {
    
    
    
    this.emailCc = emailCc;
  }


  public PaymentResponseOptions emailBcc(String emailBcc) {
    
    
    
    
    this.emailBcc = emailBcc;
    return this;
  }

   /**
   * List of comma-separated email addresses to BCC.
   * @return emailBcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bccexample@mail.com", value = "List of comma-separated email addresses to BCC.")

  public String getEmailBcc() {
    return emailBcc;
  }


  public void setEmailBcc(String emailBcc) {
    
    
    
    this.emailBcc = emailBcc;
  }


  public PaymentResponseOptions notificationUrl(String notificationUrl) {
    
    
    
    
    this.notificationUrl = notificationUrl;
    return this;
  }

   /**
   * Webhook notification URL for this payment. Overrides the default set on the merchant.
   * @return notificationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://webhook.site/", value = "Webhook notification URL for this payment. Overrides the default set on the merchant.")

  public String getNotificationUrl() {
    return notificationUrl;
  }


  public void setNotificationUrl(String notificationUrl) {
    
    
    
    this.notificationUrl = notificationUrl;
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
   * @return the PaymentResponseOptions instance itself
   */
  public PaymentResponseOptions putAdditionalProperty(String key, Object value) {
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
    PaymentResponseOptions paymentResponseOptions = (PaymentResponseOptions) o;
    return Objects.equals(this.sendEmail, paymentResponseOptions.sendEmail) &&
        Objects.equals(this.sendSms, paymentResponseOptions.sendSms) &&
        Objects.equals(this.sendWhatsapp, paymentResponseOptions.sendWhatsapp) &&
        Objects.equals(this.emailCc, paymentResponseOptions.emailCc) &&
        Objects.equals(this.emailBcc, paymentResponseOptions.emailBcc) &&
        Objects.equals(this.notificationUrl, paymentResponseOptions.notificationUrl)&&
        Objects.equals(this.additionalProperties, paymentResponseOptions.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sendEmail, sendSms, sendWhatsapp, emailCc, emailBcc, notificationUrl, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentResponseOptions {\n");
    sb.append("    sendEmail: ").append(toIndentedString(sendEmail)).append("\n");
    sb.append("    sendSms: ").append(toIndentedString(sendSms)).append("\n");
    sb.append("    sendWhatsapp: ").append(toIndentedString(sendWhatsapp)).append("\n");
    sb.append("    emailCc: ").append(toIndentedString(emailCc)).append("\n");
    sb.append("    emailBcc: ").append(toIndentedString(emailBcc)).append("\n");
    sb.append("    notificationUrl: ").append(toIndentedString(notificationUrl)).append("\n");
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
    openapiFields.add("sendEmail");
    openapiFields.add("sendSms");
    openapiFields.add("sendWhatsapp");
    openapiFields.add("emailCc");
    openapiFields.add("emailBcc");
    openapiFields.add("notificationUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentResponseOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentResponseOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentResponseOptions is not found in the empty JSON string", PaymentResponseOptions.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("emailCc").isJsonNull() && (jsonObj.get("emailCc") != null && !jsonObj.get("emailCc").isJsonNull()) && !jsonObj.get("emailCc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailCc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailCc").toString()));
      }
      if (!jsonObj.get("emailBcc").isJsonNull() && (jsonObj.get("emailBcc") != null && !jsonObj.get("emailBcc").isJsonNull()) && !jsonObj.get("emailBcc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailBcc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailBcc").toString()));
      }
      if ((jsonObj.get("notificationUrl") != null && !jsonObj.get("notificationUrl").isJsonNull()) && !jsonObj.get("notificationUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notificationUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notificationUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentResponseOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentResponseOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentResponseOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentResponseOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentResponseOptions>() {
           @Override
           public void write(JsonWriter out, PaymentResponseOptions value) throws IOException {
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
           public PaymentResponseOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentResponseOptions instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaymentResponseOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentResponseOptions
  * @throws IOException if the JSON string is invalid with respect to PaymentResponseOptions
  */
  public static PaymentResponseOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentResponseOptions.class);
  }

 /**
  * Convert an instance of PaymentResponseOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

