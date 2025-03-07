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
 * PaymentGetAllPaymentLinksResponseMeta
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaymentGetAllPaymentLinksResponseMeta {
  public static final String SERIALIZED_NAME_PER_PAGE = "perPage";
  @SerializedName(SERIALIZED_NAME_PER_PAGE)
  private Double perPage;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Double offset;

  public static final String SERIALIZED_NAME_NEXT_OFFSET = "nextOffset";
  @SerializedName(SERIALIZED_NAME_NEXT_OFFSET)
  private Double nextOffset;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Double total;

  public PaymentGetAllPaymentLinksResponseMeta() {
  }

  public PaymentGetAllPaymentLinksResponseMeta perPage(Double perPage) {
    
    
    
    
    this.perPage = perPage;
    return this;
  }

  public PaymentGetAllPaymentLinksResponseMeta perPage(Integer perPage) {
    
    
    
    
    this.perPage = perPage.doubleValue();
    return this;
  }

   /**
   * The amount of items to retrieve.
   * @return perPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of items to retrieve.")

  public Double getPerPage() {
    return perPage;
  }


  public void setPerPage(Double perPage) {
    
    
    
    this.perPage = perPage;
  }


  public PaymentGetAllPaymentLinksResponseMeta offset(Double offset) {
    
    
    
    
    this.offset = offset;
    return this;
  }

  public PaymentGetAllPaymentLinksResponseMeta offset(Integer offset) {
    
    
    
    
    this.offset = offset.doubleValue();
    return this;
  }

   /**
   * The offset from which to read data.
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The offset from which to read data.")

  public Double getOffset() {
    return offset;
  }


  public void setOffset(Double offset) {
    
    
    
    this.offset = offset;
  }


  public PaymentGetAllPaymentLinksResponseMeta nextOffset(Double nextOffset) {
    
    
    
    
    this.nextOffset = nextOffset;
    return this;
  }

  public PaymentGetAllPaymentLinksResponseMeta nextOffset(Integer nextOffset) {
    
    
    
    
    this.nextOffset = nextOffset.doubleValue();
    return this;
  }

   /**
   * The offset from which to read data on a subsequent request.
   * @return nextOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The offset from which to read data on a subsequent request.")

  public Double getNextOffset() {
    return nextOffset;
  }


  public void setNextOffset(Double nextOffset) {
    
    
    
    this.nextOffset = nextOffset;
  }


  public PaymentGetAllPaymentLinksResponseMeta total(Double total) {
    
    
    
    
    this.total = total;
    return this;
  }

  public PaymentGetAllPaymentLinksResponseMeta total(Integer total) {
    
    
    
    
    this.total = total.doubleValue();
    return this;
  }

   /**
   * The total number of payment links returned by the filter criteria.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of payment links returned by the filter criteria.")

  public Double getTotal() {
    return total;
  }


  public void setTotal(Double total) {
    
    
    
    this.total = total;
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
   * @return the PaymentGetAllPaymentLinksResponseMeta instance itself
   */
  public PaymentGetAllPaymentLinksResponseMeta putAdditionalProperty(String key, Object value) {
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
    PaymentGetAllPaymentLinksResponseMeta paymentGetAllPaymentLinksResponseMeta = (PaymentGetAllPaymentLinksResponseMeta) o;
    return Objects.equals(this.perPage, paymentGetAllPaymentLinksResponseMeta.perPage) &&
        Objects.equals(this.offset, paymentGetAllPaymentLinksResponseMeta.offset) &&
        Objects.equals(this.nextOffset, paymentGetAllPaymentLinksResponseMeta.nextOffset) &&
        Objects.equals(this.total, paymentGetAllPaymentLinksResponseMeta.total)&&
        Objects.equals(this.additionalProperties, paymentGetAllPaymentLinksResponseMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(perPage, offset, nextOffset, total, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentGetAllPaymentLinksResponseMeta {\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    nextOffset: ").append(toIndentedString(nextOffset)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("perPage");
    openapiFields.add("offset");
    openapiFields.add("nextOffset");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentGetAllPaymentLinksResponseMeta
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentGetAllPaymentLinksResponseMeta.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentGetAllPaymentLinksResponseMeta is not found in the empty JSON string", PaymentGetAllPaymentLinksResponseMeta.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentGetAllPaymentLinksResponseMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentGetAllPaymentLinksResponseMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentGetAllPaymentLinksResponseMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentGetAllPaymentLinksResponseMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentGetAllPaymentLinksResponseMeta>() {
           @Override
           public void write(JsonWriter out, PaymentGetAllPaymentLinksResponseMeta value) throws IOException {
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
           public PaymentGetAllPaymentLinksResponseMeta read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentGetAllPaymentLinksResponseMeta instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaymentGetAllPaymentLinksResponseMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentGetAllPaymentLinksResponseMeta
  * @throws IOException if the JSON string is invalid with respect to PaymentGetAllPaymentLinksResponseMeta
  */
  public static PaymentGetAllPaymentLinksResponseMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentGetAllPaymentLinksResponseMeta.class);
  }

 /**
  * Convert an instance of PaymentGetAllPaymentLinksResponseMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

