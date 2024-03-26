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
 * The Shopify object.
 */
@ApiModel(description = "The Shopify object.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Shopify {
  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;

  public static final String SERIALIZED_NAME_TEST_MODE = "testMode";
  @SerializedName(SERIALIZED_NAME_TEST_MODE)
  private String testMode;

  public Shopify() {
  }

  public Shopify orderId(String orderId) {
    
    
    
    
    this.orderId = orderId;
    return this;
  }

   /**
   * The Shopify order ID.
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567891234", value = "The Shopify order ID.")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    
    
    
    this.orderId = orderId;
  }


  public Shopify accountId(String accountId) {
    
    
    
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The Shopify account ID.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6370", value = "The Shopify account ID.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    
    
    
    this.accountId = accountId;
  }


  public Shopify signature(String signature) {
    
    
    
    
    this.signature = signature;
    return this;
  }

   /**
   * The Shopify signature.
   * @return signature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7292b834263177afa7fddbea3fa7a81f20818ee7cf05d1c4b4cac1677dc7a8f7", value = "The Shopify signature.")

  public String getSignature() {
    return signature;
  }


  public void setSignature(String signature) {
    
    
    
    this.signature = signature;
  }


  public Shopify testMode(String testMode) {
    
    
    
    
    this.testMode = testMode;
    return this;
  }

   /**
   * Shopify test mode.
   * @return testMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Shopify test mode.")

  public String getTestMode() {
    return testMode;
  }


  public void setTestMode(String testMode) {
    
    
    
    this.testMode = testMode;
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
   * @return the Shopify instance itself
   */
  public Shopify putAdditionalProperty(String key, Object value) {
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
    Shopify shopify = (Shopify) o;
    return Objects.equals(this.orderId, shopify.orderId) &&
        Objects.equals(this.accountId, shopify.accountId) &&
        Objects.equals(this.signature, shopify.signature) &&
        Objects.equals(this.testMode, shopify.testMode)&&
        Objects.equals(this.additionalProperties, shopify.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, accountId, signature, testMode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shopify {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    testMode: ").append(toIndentedString(testMode)).append("\n");
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
    openapiFields.add("orderId");
    openapiFields.add("accountId");
    openapiFields.add("signature");
    openapiFields.add("testMode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Shopify
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Shopify.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Shopify is not found in the empty JSON string", Shopify.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("orderId") != null && !jsonObj.get("orderId").isJsonNull()) && !jsonObj.get("orderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderId").toString()));
      }
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("signature") != null && !jsonObj.get("signature").isJsonNull()) && !jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
      }
      if ((jsonObj.get("testMode") != null && !jsonObj.get("testMode").isJsonNull()) && !jsonObj.get("testMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testMode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Shopify.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Shopify' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Shopify> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Shopify.class));

       return (TypeAdapter<T>) new TypeAdapter<Shopify>() {
           @Override
           public void write(JsonWriter out, Shopify value) throws IOException {
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
           public Shopify read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Shopify instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Shopify given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Shopify
  * @throws IOException if the JSON string is invalid with respect to Shopify
  */
  public static Shopify fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Shopify.class);
  }

 /**
  * Convert an instance of Shopify to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

