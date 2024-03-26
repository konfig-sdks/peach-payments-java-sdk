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
 * StatusQueryPaymentStatusResponseAuditInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class StatusQueryPaymentStatusResponseAuditInner {
  /**
   * The previous status of the payment link.
   */
  @JsonAdapter(OldStatusEnum.Adapter.class)
 public enum OldStatusEnum {
    NONE("none"),
    
    INITIATED("initiated"),
    
    PROCESSING("processing"),
    
    EXPIRED("expired"),
    
    CANCELLED("cancelled"),
    
    COMPLETED("completed");

    private String value;

    OldStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OldStatusEnum fromValue(String value) {
      for (OldStatusEnum b : OldStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OldStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OldStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OldStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OldStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OLD_STATUS = "oldStatus";
  @SerializedName(SERIALIZED_NAME_OLD_STATUS)
  private OldStatusEnum oldStatus;

  /**
   * The new status of the payment link.
   */
  @JsonAdapter(NewStatusEnum.Adapter.class)
 public enum NewStatusEnum {
    INITIATED("initiated"),
    
    PROCESSING("processing"),
    
    EXPIRED("expired"),
    
    CANCELLED("cancelled"),
    
    COMPLETED("completed");

    private String value;

    NewStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NewStatusEnum fromValue(String value) {
      for (NewStatusEnum b : NewStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NewStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NewStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NewStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NewStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NEW_STATUS = "newStatus";
  @SerializedName(SERIALIZED_NAME_NEW_STATUS)
  private NewStatusEnum newStatus;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public StatusQueryPaymentStatusResponseAuditInner() {
  }

  public StatusQueryPaymentStatusResponseAuditInner oldStatus(OldStatusEnum oldStatus) {
    
    
    
    
    this.oldStatus = oldStatus;
    return this;
  }

   /**
   * The previous status of the payment link.
   * @return oldStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INITIATED", value = "The previous status of the payment link.")

  public OldStatusEnum getOldStatus() {
    return oldStatus;
  }


  public void setOldStatus(OldStatusEnum oldStatus) {
    
    
    
    this.oldStatus = oldStatus;
  }


  public StatusQueryPaymentStatusResponseAuditInner newStatus(NewStatusEnum newStatus) {
    
    
    
    
    this.newStatus = newStatus;
    return this;
  }

   /**
   * The new status of the payment link.
   * @return newStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PROCESSING", value = "The new status of the payment link.")

  public NewStatusEnum getNewStatus() {
    return newStatus;
  }


  public void setNewStatus(NewStatusEnum newStatus) {
    
    
    
    this.newStatus = newStatus;
  }


  public StatusQueryPaymentStatusResponseAuditInner timestamp(String timestamp) {
    
    
    
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The UTC time that the status changed.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-27T12:45:43Z", value = "The UTC time that the status changed.")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    
    
    
    this.timestamp = timestamp;
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
   * @return the StatusQueryPaymentStatusResponseAuditInner instance itself
   */
  public StatusQueryPaymentStatusResponseAuditInner putAdditionalProperty(String key, Object value) {
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
    StatusQueryPaymentStatusResponseAuditInner statusQueryPaymentStatusResponseAuditInner = (StatusQueryPaymentStatusResponseAuditInner) o;
    return Objects.equals(this.oldStatus, statusQueryPaymentStatusResponseAuditInner.oldStatus) &&
        Objects.equals(this.newStatus, statusQueryPaymentStatusResponseAuditInner.newStatus) &&
        Objects.equals(this.timestamp, statusQueryPaymentStatusResponseAuditInner.timestamp)&&
        Objects.equals(this.additionalProperties, statusQueryPaymentStatusResponseAuditInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldStatus, newStatus, timestamp, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusQueryPaymentStatusResponseAuditInner {\n");
    sb.append("    oldStatus: ").append(toIndentedString(oldStatus)).append("\n");
    sb.append("    newStatus: ").append(toIndentedString(newStatus)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
    openapiFields.add("oldStatus");
    openapiFields.add("newStatus");
    openapiFields.add("timestamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StatusQueryPaymentStatusResponseAuditInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StatusQueryPaymentStatusResponseAuditInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatusQueryPaymentStatusResponseAuditInner is not found in the empty JSON string", StatusQueryPaymentStatusResponseAuditInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("oldStatus") != null && !jsonObj.get("oldStatus").isJsonNull()) && !jsonObj.get("oldStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oldStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oldStatus").toString()));
      }
      if ((jsonObj.get("newStatus") != null && !jsonObj.get("newStatus").isJsonNull()) && !jsonObj.get("newStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newStatus").toString()));
      }
      if ((jsonObj.get("timestamp") != null && !jsonObj.get("timestamp").isJsonNull()) && !jsonObj.get("timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatusQueryPaymentStatusResponseAuditInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatusQueryPaymentStatusResponseAuditInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatusQueryPaymentStatusResponseAuditInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatusQueryPaymentStatusResponseAuditInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StatusQueryPaymentStatusResponseAuditInner>() {
           @Override
           public void write(JsonWriter out, StatusQueryPaymentStatusResponseAuditInner value) throws IOException {
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
           public StatusQueryPaymentStatusResponseAuditInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             StatusQueryPaymentStatusResponseAuditInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of StatusQueryPaymentStatusResponseAuditInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StatusQueryPaymentStatusResponseAuditInner
  * @throws IOException if the JSON string is invalid with respect to StatusQueryPaymentStatusResponseAuditInner
  */
  public static StatusQueryPaymentStatusResponseAuditInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatusQueryPaymentStatusResponseAuditInner.class);
  }

 /**
  * Convert an instance of StatusQueryPaymentStatusResponseAuditInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

