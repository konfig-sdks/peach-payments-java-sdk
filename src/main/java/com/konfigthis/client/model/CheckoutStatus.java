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
import com.konfigthis.client.model.RedirectPostData;
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
 * CheckoutStatus
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CheckoutStatus {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirect_url";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private String redirectUrl;

  public static final String SERIALIZED_NAME_REDIRECT_POST_DATA = "redirect_post_data";
  @SerializedName(SERIALIZED_NAME_REDIRECT_POST_DATA)
  private RedirectPostData redirectPostData;

  public CheckoutStatus() {
  }

  public CheckoutStatus status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The status of the object.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PROCESSING", value = "The status of the object.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public CheckoutStatus timestamp(String timestamp) {
    
    
    
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The remaining time, in seconds, of the checkout instance.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1800", value = "The remaining time, in seconds, of the checkout instance.")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    
    
    
    this.timestamp = timestamp;
  }


  public CheckoutStatus redirectUrl(String redirectUrl) {
    
    
    
    
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * Redirect URL for Checkout.
   * @return redirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Redirect URL for Checkout.")

  public String getRedirectUrl() {
    return redirectUrl;
  }


  public void setRedirectUrl(String redirectUrl) {
    
    
    
    this.redirectUrl = redirectUrl;
  }


  public CheckoutStatus redirectPostData(RedirectPostData redirectPostData) {
    
    
    
    
    this.redirectPostData = redirectPostData;
    return this;
  }

   /**
   * Get redirectPostData
   * @return redirectPostData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RedirectPostData getRedirectPostData() {
    return redirectPostData;
  }


  public void setRedirectPostData(RedirectPostData redirectPostData) {
    
    
    
    this.redirectPostData = redirectPostData;
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
   * @return the CheckoutStatus instance itself
   */
  public CheckoutStatus putAdditionalProperty(String key, Object value) {
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
    CheckoutStatus checkoutStatus = (CheckoutStatus) o;
    return Objects.equals(this.status, checkoutStatus.status) &&
        Objects.equals(this.timestamp, checkoutStatus.timestamp) &&
        Objects.equals(this.redirectUrl, checkoutStatus.redirectUrl) &&
        Objects.equals(this.redirectPostData, checkoutStatus.redirectPostData)&&
        Objects.equals(this.additionalProperties, checkoutStatus.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, timestamp, redirectUrl, redirectPostData, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutStatus {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    redirectPostData: ").append(toIndentedString(redirectPostData)).append("\n");
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
    openapiFields.add("timestamp");
    openapiFields.add("redirect_url");
    openapiFields.add("redirect_post_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CheckoutStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CheckoutStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckoutStatus is not found in the empty JSON string", CheckoutStatus.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("timestamp") != null && !jsonObj.get("timestamp").isJsonNull()) && !jsonObj.get("timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp").toString()));
      }
      if ((jsonObj.get("redirect_url") != null && !jsonObj.get("redirect_url").isJsonNull()) && !jsonObj.get("redirect_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirect_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirect_url").toString()));
      }
      // validate the optional field `redirect_post_data`
      if (jsonObj.get("redirect_post_data") != null && !jsonObj.get("redirect_post_data").isJsonNull()) {
        RedirectPostData.validateJsonObject(jsonObj.getAsJsonObject("redirect_post_data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckoutStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckoutStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckoutStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckoutStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckoutStatus>() {
           @Override
           public void write(JsonWriter out, CheckoutStatus value) throws IOException {
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
           public CheckoutStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CheckoutStatus instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CheckoutStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckoutStatus
  * @throws IOException if the JSON string is invalid with respect to CheckoutStatus
  */
  public static CheckoutStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckoutStatus.class);
  }

 /**
  * Convert an instance of CheckoutStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

