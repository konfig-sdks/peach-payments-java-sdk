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
 * CheckoutState
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CheckoutState {
  public static final String SERIALIZED_NAME_DEFAULT_PAYMENT_METHOD = "defaultPaymentMethod";
  @SerializedName(SERIALIZED_NAME_DEFAULT_PAYMENT_METHOD)
  private String defaultPaymentMethod;

  public static final String SERIALIZED_NAME_FORCE_DEFAULT_METHOD = "forceDefaultMethod";
  @SerializedName(SERIALIZED_NAME_FORCE_DEFAULT_METHOD)
  private Boolean forceDefaultMethod = false;

  public static final String SERIALIZED_NAME_TOKENISE_CARD = "tokeniseCard";
  @SerializedName(SERIALIZED_NAME_TOKENISE_CARD)
  private Boolean tokeniseCard = false;

  public static final String SERIALIZED_NAME_REGISTRATION_ID = "registrationId";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_ID)
  private String registrationId;

  public static final String SERIALIZED_NAME_CHECKOUT_ID = "checkoutId";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_ID)
  private String checkoutId;

  public static final String SERIALIZED_NAME_TRANSACTION_UNIQUE_ID = "transactionUniqueId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_UNIQUE_ID)
  private String transactionUniqueId;

  public static final String SERIALIZED_NAME_RESULT_CODE = "resultCode";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private String resultCode;

  public static final String SERIALIZED_NAME_PAYMENT_BRAND = "paymentBrand";
  @SerializedName(SERIALIZED_NAME_PAYMENT_BRAND)
  private String paymentBrand;

  public CheckoutState() {
  }

  public CheckoutState defaultPaymentMethod(String defaultPaymentMethod) {
    
    
    
    
    this.defaultPaymentMethod = defaultPaymentMethod;
    return this;
  }

   /**
   * The default payment method to show when Checkout loads.
   * @return defaultPaymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CARD", value = "The default payment method to show when Checkout loads.")

  public String getDefaultPaymentMethod() {
    return defaultPaymentMethod;
  }


  public void setDefaultPaymentMethod(String defaultPaymentMethod) {
    
    
    
    this.defaultPaymentMethod = defaultPaymentMethod;
  }


  public CheckoutState forceDefaultMethod(Boolean forceDefaultMethod) {
    
    
    
    
    this.forceDefaultMethod = forceDefaultMethod;
    return this;
  }

   /**
   * Force the default payment method to be the only payment method.
   * @return forceDefaultMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Force the default payment method to be the only payment method.")

  public Boolean getForceDefaultMethod() {
    return forceDefaultMethod;
  }


  public void setForceDefaultMethod(Boolean forceDefaultMethod) {
    
    
    
    this.forceDefaultMethod = forceDefaultMethod;
  }


  public CheckoutState tokeniseCard(Boolean tokeniseCard) {
    
    
    
    
    this.tokeniseCard = tokeniseCard;
    return this;
  }

   /**
   * Tokenise the card number to allow it to be stored.
   * @return tokeniseCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Tokenise the card number to allow it to be stored.")

  public Boolean getTokeniseCard() {
    return tokeniseCard;
  }


  public void setTokeniseCard(Boolean tokeniseCard) {
    
    
    
    this.tokeniseCard = tokeniseCard;
  }


  public CheckoutState registrationId(String registrationId) {
    
    
    
    
    this.registrationId = registrationId;
    return this;
  }

   /**
   * Registration ID added if tokeniseCard is true on card payment.
   * @return registrationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8ac7a4a180223d220180227b2cf649f0", value = "Registration ID added if tokeniseCard is true on card payment.")

  public String getRegistrationId() {
    return registrationId;
  }


  public void setRegistrationId(String registrationId) {
    
    
    
    this.registrationId = registrationId;
  }


  public CheckoutState checkoutId(String checkoutId) {
    
    
    
    
    this.checkoutId = checkoutId;
    return this;
  }

   /**
   * Checkout ID of payment.
   * @return checkoutId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d6a8014a622a442aad90c72320419b2b", value = "Checkout ID of payment.")

  public String getCheckoutId() {
    return checkoutId;
  }


  public void setCheckoutId(String checkoutId) {
    
    
    
    this.checkoutId = checkoutId;
  }


  public CheckoutState transactionUniqueId(String transactionUniqueId) {
    
    
    
    
    this.transactionUniqueId = transactionUniqueId;
    return this;
  }

   /**
   * Unique transaction ID of payment.
   * @return transactionUniqueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "450bf3b1-c479-4b30-99ca-5b598a889b8f", value = "Unique transaction ID of payment.")

  public String getTransactionUniqueId() {
    return transactionUniqueId;
  }


  public void setTransactionUniqueId(String transactionUniqueId) {
    
    
    
    this.transactionUniqueId = transactionUniqueId;
  }


  public CheckoutState resultCode(String resultCode) {
    
    
    
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * Result code returned for payment.
   * @return resultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "000.100.110", value = "Result code returned for payment.")

  public String getResultCode() {
    return resultCode;
  }


  public void setResultCode(String resultCode) {
    
    
    
    this.resultCode = resultCode;
  }


  public CheckoutState paymentBrand(String paymentBrand) {
    
    
    
    
    this.paymentBrand = paymentBrand;
    return this;
  }

   /**
   * Payment brand used for payment.
   * @return paymentBrand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VISA", value = "Payment brand used for payment.")

  public String getPaymentBrand() {
    return paymentBrand;
  }


  public void setPaymentBrand(String paymentBrand) {
    
    
    
    this.paymentBrand = paymentBrand;
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
   * @return the CheckoutState instance itself
   */
  public CheckoutState putAdditionalProperty(String key, Object value) {
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
    CheckoutState checkoutState = (CheckoutState) o;
    return Objects.equals(this.defaultPaymentMethod, checkoutState.defaultPaymentMethod) &&
        Objects.equals(this.forceDefaultMethod, checkoutState.forceDefaultMethod) &&
        Objects.equals(this.tokeniseCard, checkoutState.tokeniseCard) &&
        Objects.equals(this.registrationId, checkoutState.registrationId) &&
        Objects.equals(this.checkoutId, checkoutState.checkoutId) &&
        Objects.equals(this.transactionUniqueId, checkoutState.transactionUniqueId) &&
        Objects.equals(this.resultCode, checkoutState.resultCode) &&
        Objects.equals(this.paymentBrand, checkoutState.paymentBrand)&&
        Objects.equals(this.additionalProperties, checkoutState.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultPaymentMethod, forceDefaultMethod, tokeniseCard, registrationId, checkoutId, transactionUniqueId, resultCode, paymentBrand, additionalProperties);
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
    sb.append("class CheckoutState {\n");
    sb.append("    defaultPaymentMethod: ").append(toIndentedString(defaultPaymentMethod)).append("\n");
    sb.append("    forceDefaultMethod: ").append(toIndentedString(forceDefaultMethod)).append("\n");
    sb.append("    tokeniseCard: ").append(toIndentedString(tokeniseCard)).append("\n");
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    checkoutId: ").append(toIndentedString(checkoutId)).append("\n");
    sb.append("    transactionUniqueId: ").append(toIndentedString(transactionUniqueId)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    paymentBrand: ").append(toIndentedString(paymentBrand)).append("\n");
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
    openapiFields.add("defaultPaymentMethod");
    openapiFields.add("forceDefaultMethod");
    openapiFields.add("tokeniseCard");
    openapiFields.add("registrationId");
    openapiFields.add("checkoutId");
    openapiFields.add("transactionUniqueId");
    openapiFields.add("resultCode");
    openapiFields.add("paymentBrand");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CheckoutState
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CheckoutState.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckoutState is not found in the empty JSON string", CheckoutState.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("defaultPaymentMethod").isJsonNull() && (jsonObj.get("defaultPaymentMethod") != null && !jsonObj.get("defaultPaymentMethod").isJsonNull()) && !jsonObj.get("defaultPaymentMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultPaymentMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultPaymentMethod").toString()));
      }
      if ((jsonObj.get("registrationId") != null && !jsonObj.get("registrationId").isJsonNull()) && !jsonObj.get("registrationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registrationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrationId").toString()));
      }
      if ((jsonObj.get("checkoutId") != null && !jsonObj.get("checkoutId").isJsonNull()) && !jsonObj.get("checkoutId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkoutId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkoutId").toString()));
      }
      if ((jsonObj.get("transactionUniqueId") != null && !jsonObj.get("transactionUniqueId").isJsonNull()) && !jsonObj.get("transactionUniqueId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionUniqueId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionUniqueId").toString()));
      }
      if ((jsonObj.get("resultCode") != null && !jsonObj.get("resultCode").isJsonNull()) && !jsonObj.get("resultCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resultCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resultCode").toString()));
      }
      if ((jsonObj.get("paymentBrand") != null && !jsonObj.get("paymentBrand").isJsonNull()) && !jsonObj.get("paymentBrand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentBrand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentBrand").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckoutState.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckoutState' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckoutState> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckoutState.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckoutState>() {
           @Override
           public void write(JsonWriter out, CheckoutState value) throws IOException {
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
           public CheckoutState read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CheckoutState instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CheckoutState given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckoutState
  * @throws IOException if the JSON string is invalid with respect to CheckoutState
  */
  public static CheckoutState fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckoutState.class);
  }

 /**
  * Convert an instance of CheckoutState to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

