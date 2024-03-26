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
 * Merchant object with data relevant to an EFTsecure transaction.
 */
@ApiModel(description = "Merchant object with data relevant to an EFTsecure transaction.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MerchantWebhookDataPayloadMerchant {
  public static final String SERIALIZED_NAME_API_USERNAME = "apiUsername";
  @SerializedName(SERIALIZED_NAME_API_USERNAME)
  private String apiUsername;

  public static final String SERIALIZED_NAME_EFT_ID = "eftId";
  @SerializedName(SERIALIZED_NAME_EFT_ID)
  private String eftId;

  public MerchantWebhookDataPayloadMerchant() {
  }

  public MerchantWebhookDataPayloadMerchant apiUsername(String apiUsername) {
    
    
    
    
    this.apiUsername = apiUsername;
    return this;
  }

   /**
   * Get apiUsername
   * @return apiUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiUsername() {
    return apiUsername;
  }


  public void setApiUsername(String apiUsername) {
    
    
    
    this.apiUsername = apiUsername;
  }


  public MerchantWebhookDataPayloadMerchant eftId(String eftId) {
    
    
    
    
    this.eftId = eftId;
    return this;
  }

   /**
   * Get eftId
   * @return eftId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEftId() {
    return eftId;
  }


  public void setEftId(String eftId) {
    
    
    
    this.eftId = eftId;
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
   * @return the MerchantWebhookDataPayloadMerchant instance itself
   */
  public MerchantWebhookDataPayloadMerchant putAdditionalProperty(String key, Object value) {
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
    MerchantWebhookDataPayloadMerchant merchantWebhookDataPayloadMerchant = (MerchantWebhookDataPayloadMerchant) o;
    return Objects.equals(this.apiUsername, merchantWebhookDataPayloadMerchant.apiUsername) &&
        Objects.equals(this.eftId, merchantWebhookDataPayloadMerchant.eftId)&&
        Objects.equals(this.additionalProperties, merchantWebhookDataPayloadMerchant.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiUsername, eftId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantWebhookDataPayloadMerchant {\n");
    sb.append("    apiUsername: ").append(toIndentedString(apiUsername)).append("\n");
    sb.append("    eftId: ").append(toIndentedString(eftId)).append("\n");
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
    openapiFields.add("apiUsername");
    openapiFields.add("eftId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantWebhookDataPayloadMerchant
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MerchantWebhookDataPayloadMerchant.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantWebhookDataPayloadMerchant is not found in the empty JSON string", MerchantWebhookDataPayloadMerchant.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("apiUsername") != null && !jsonObj.get("apiUsername").isJsonNull()) && !jsonObj.get("apiUsername").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiUsername` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiUsername").toString()));
      }
      if ((jsonObj.get("eftId") != null && !jsonObj.get("eftId").isJsonNull()) && !jsonObj.get("eftId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eftId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eftId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantWebhookDataPayloadMerchant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantWebhookDataPayloadMerchant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantWebhookDataPayloadMerchant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantWebhookDataPayloadMerchant.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantWebhookDataPayloadMerchant>() {
           @Override
           public void write(JsonWriter out, MerchantWebhookDataPayloadMerchant value) throws IOException {
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
           public MerchantWebhookDataPayloadMerchant read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MerchantWebhookDataPayloadMerchant instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MerchantWebhookDataPayloadMerchant given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantWebhookDataPayloadMerchant
  * @throws IOException if the JSON string is invalid with respect to MerchantWebhookDataPayloadMerchant
  */
  public static MerchantWebhookDataPayloadMerchant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantWebhookDataPayloadMerchant.class);
  }

 /**
  * Convert an instance of MerchantWebhookDataPayloadMerchant to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

