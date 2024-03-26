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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
 * The payment object contains the payment details, files, and notes for the payment link.
 */
@ApiModel(description = "The payment object contains the payment details, files, and notes for the payment link.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GenerateLinkPaymentPayment {
  public static final String SERIALIZED_NAME_MERCHANT_INVOICE_ID = "merchantInvoiceId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_INVOICE_ID)
  private String merchantInvoiceId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  /**
   * The currency code of the payment request amount (ISO 4217).
   */
  @JsonAdapter(CurrencyEnum.Adapter.class)
 public enum CurrencyEnum {
    ZAR("ZAR"),
    
    KES("KES"),
    
    USD("USD");

    private String value;

    CurrencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CurrencyEnum fromValue(String value) {
      for (CurrencyEnum b : CurrencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CurrencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CurrencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CurrencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CurrencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private CurrencyEnum currency;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<UUID> files = null;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public GenerateLinkPaymentPayment() {
  }

  public GenerateLinkPaymentPayment merchantInvoiceId(String merchantInvoiceId) {
    
    
    if (merchantInvoiceId != null && merchantInvoiceId.length() < 8) {
      throw new IllegalArgumentException("Invalid value for merchantInvoiceId. Length must be greater than or equal to 8.");
    }
    
    this.merchantInvoiceId = merchantInvoiceId;
    return this;
  }

   /**
   * Invoice ID that can be used to link the payment to an invoice on the merchant&#39;s system. Must be less than 17 characters.
   * @return merchantInvoiceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "INV-9001", required = true, value = "Invoice ID that can be used to link the payment to an invoice on the merchant's system. Must be less than 17 characters.")

  public String getMerchantInvoiceId() {
    return merchantInvoiceId;
  }


  public void setMerchantInvoiceId(String merchantInvoiceId) {
    
    
    if (merchantInvoiceId != null && merchantInvoiceId.length() < 8) {
      throw new IllegalArgumentException("Invalid value for merchantInvoiceId. Length must be greater than or equal to 8.");
    }
    this.merchantInvoiceId = merchantInvoiceId;
  }


  public GenerateLinkPaymentPayment amount(Double amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

  public GenerateLinkPaymentPayment amount(Integer amount) {
    
    
    
    
    this.amount = amount.doubleValue();
    return this;
  }

   /**
   * Payment amount. Must be positive and less than 1000000.00.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "10", required = true, value = "Payment amount. Must be positive and less than 1000000.00.")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    
    
    
    this.amount = amount;
  }


  public GenerateLinkPaymentPayment currency(CurrencyEnum currency) {
    
    
    if (currency != null && currency.length() < 3) {
      throw new IllegalArgumentException("Invalid value for currency. Length must be greater than or equal to 3.");
    }
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency code of the payment request amount (ISO 4217).
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ZAR", required = true, value = "The currency code of the payment request amount (ISO 4217).")

  public CurrencyEnum getCurrency() {
    return currency;
  }


  public void setCurrency(CurrencyEnum currency) {
    
    
    if (currency != null && currency.length() < 3) {
      throw new IllegalArgumentException("Invalid value for currency. Length must be greater than or equal to 3.");
    }
    this.currency = currency;
  }


  public GenerateLinkPaymentPayment files(List<UUID> files) {
    
    
    
    
    this.files = files;
    return this;
  }

  public GenerateLinkPaymentPayment addFilesItem(UUID filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * Files to attach to the payment link.
   * @return files
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Files to attach to the payment link.")

  public List<UUID> getFiles() {
    return files;
  }


  public void setFiles(List<UUID> files) {
    
    
    
    this.files = files;
  }


  public GenerateLinkPaymentPayment notes(String notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

   /**
   * A note to include with the payment link.
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Please pay this at your earliest convenience.", value = "A note to include with the payment link.")

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    
    
    
    this.notes = notes;
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
   * @return the GenerateLinkPaymentPayment instance itself
   */
  public GenerateLinkPaymentPayment putAdditionalProperty(String key, Object value) {
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
    GenerateLinkPaymentPayment generateLinkPaymentPayment = (GenerateLinkPaymentPayment) o;
    return Objects.equals(this.merchantInvoiceId, generateLinkPaymentPayment.merchantInvoiceId) &&
        Objects.equals(this.amount, generateLinkPaymentPayment.amount) &&
        Objects.equals(this.currency, generateLinkPaymentPayment.currency) &&
        Objects.equals(this.files, generateLinkPaymentPayment.files) &&
        Objects.equals(this.notes, generateLinkPaymentPayment.notes)&&
        Objects.equals(this.additionalProperties, generateLinkPaymentPayment.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantInvoiceId, amount, currency, files, notes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateLinkPaymentPayment {\n");
    sb.append("    merchantInvoiceId: ").append(toIndentedString(merchantInvoiceId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
    openapiFields.add("merchantInvoiceId");
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("files");
    openapiFields.add("notes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("merchantInvoiceId");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("currency");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GenerateLinkPaymentPayment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GenerateLinkPaymentPayment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenerateLinkPaymentPayment is not found in the empty JSON string", GenerateLinkPaymentPayment.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GenerateLinkPaymentPayment.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("merchantInvoiceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantInvoiceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantInvoiceId").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("files") != null && !jsonObj.get("files").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `files` to be an array in the JSON string but got `%s`", jsonObj.get("files").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenerateLinkPaymentPayment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenerateLinkPaymentPayment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenerateLinkPaymentPayment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenerateLinkPaymentPayment.class));

       return (TypeAdapter<T>) new TypeAdapter<GenerateLinkPaymentPayment>() {
           @Override
           public void write(JsonWriter out, GenerateLinkPaymentPayment value) throws IOException {
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
           public GenerateLinkPaymentPayment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GenerateLinkPaymentPayment instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GenerateLinkPaymentPayment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GenerateLinkPaymentPayment
  * @throws IOException if the JSON string is invalid with respect to GenerateLinkPaymentPayment
  */
  public static GenerateLinkPaymentPayment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenerateLinkPaymentPayment.class);
  }

 /**
  * Convert an instance of GenerateLinkPaymentPayment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

