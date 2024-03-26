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
import com.konfigthis.client.model.Customer;
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
 * Optional object that can be used for billing or shipping information.
 */
@ApiModel(description = "Optional object that can be used for billing or shipping information.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Address {
  public static final String SERIALIZED_NAME_STREET1 = "street1";
  @SerializedName(SERIALIZED_NAME_STREET1)
  private String street1;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;

  public static final String SERIALIZED_NAME_HOUSE_NUMBER1 = "houseNumber1";
  @SerializedName(SERIALIZED_NAME_HOUSE_NUMBER1)
  private String houseNumber1;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode;

  public static final String SERIALIZED_NAME_STREET2 = "street2";
  @SerializedName(SERIALIZED_NAME_STREET2)
  private String street2;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private Customer customer;

  public Address() {
  }

  public Address street1(String street1) {
    
    
    if (street1 != null && street1.length() < 1) {
      throw new IllegalArgumentException("Invalid value for street1. Length must be greater than or equal to 1.");
    }
    
    this.street1 = street1;
    return this;
  }

   /**
   * The door number, floor, building number, building name, and/or street name of the billing or shipping address.
   * @return street1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Langtree Lane", value = "The door number, floor, building number, building name, and/or street name of the billing or shipping address.")

  public String getStreet1() {
    return street1;
  }


  public void setStreet1(String street1) {
    
    
    if (street1 != null && street1.length() < 1) {
      throw new IllegalArgumentException("Invalid value for street1. Length must be greater than or equal to 1.");
    }
    this.street1 = street1;
  }


  public Address city(String city) {
    
    
    if (city != null && city.length() < 1) {
      throw new IllegalArgumentException("Invalid value for city. Length must be greater than or equal to 1.");
    }
    
    this.city = city;
    return this;
  }

   /**
   * The town, district, or city linked to billing or shipping.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Cape Town", value = "The town, district, or city linked to billing or shipping.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    
    
    if (city != null && city.length() < 1) {
      throw new IllegalArgumentException("Invalid value for city. Length must be greater than or equal to 1.");
    }
    this.city = city;
  }


  public Address state(String state) {
    
    
    if (state != null && state.length() < 1) {
      throw new IllegalArgumentException("Invalid value for state. Length must be greater than or equal to 1.");
    }
    
    this.state = state;
    return this;
  }

   /**
   * The county, state, or region of the billing address.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Nasarawa", value = "The county, state, or region of the billing address.")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    
    
    if (state != null && state.length() < 1) {
      throw new IllegalArgumentException("Invalid value for state. Length must be greater than or equal to 1.");
    }
    this.state = state;
  }


  public Address postalCode(String postalCode) {
    
    
    if (postalCode != null && postalCode.length() < 1) {
      throw new IllegalArgumentException("Invalid value for postalCode. Length must be greater than or equal to 1.");
    }
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code or ZIP code of the address.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7000", value = "The postal code or ZIP code of the address.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    
    
    if (postalCode != null && postalCode.length() < 1) {
      throw new IllegalArgumentException("Invalid value for postalCode. Length must be greater than or equal to 1.");
    }
    this.postalCode = postalCode;
  }


  public Address country(String country) {
    
    
    if (country != null && country.length() < 2) {
      throw new IllegalArgumentException("Invalid value for country. Length must be greater than or equal to 2.");
    }
    
    this.country = country;
    return this;
  }

   /**
   * The country linked to billing or shipping as defined by ISO-3166-1 alpha-2.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZA", value = "The country linked to billing or shipping as defined by ISO-3166-1 alpha-2.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    if (country != null && country.length() < 2) {
      throw new IllegalArgumentException("Invalid value for country. Length must be greater than or equal to 2.");
    }
    this.country = country;
  }


  public Address company(String company) {
    
    
    
    
    this.company = company;
    return this;
  }

   /**
   * The customer&#39;s company name.
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Business Mosaics Ltd", value = "The customer's company name.")

  public String getCompany() {
    return company;
  }


  public void setCompany(String company) {
    
    
    
    this.company = company;
  }


  public Address houseNumber1(String houseNumber1) {
    
    
    
    
    this.houseNumber1 = houseNumber1;
    return this;
  }

   /**
   * Primary house number of the billing or shipping address.
   * @return houseNumber1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25567", value = "Primary house number of the billing or shipping address.")

  public String getHouseNumber1() {
    return houseNumber1;
  }


  public void setHouseNumber1(String houseNumber1) {
    
    
    
    this.houseNumber1 = houseNumber1;
  }


  public Address postcode(String postcode) {
    
    
    
    
    this.postcode = postcode;
    return this;
  }

   /**
   * The postal code or zip code of the billing or shipping address.
   * @return postcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8001", value = "The postal code or zip code of the billing or shipping address.")

  public String getPostcode() {
    return postcode;
  }


  public void setPostcode(String postcode) {
    
    
    
    this.postcode = postcode;
  }


  public Address street2(String street2) {
    
    
    
    
    this.street2 = street2;
    return this;
  }

   /**
   * Secondary house number of the billing or shipping address. Used when more addresses are bundled to the same primary house number. If present, houseNumber1 is mandatory.
   * @return street2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Loe Street", value = "Secondary house number of the billing or shipping address. Used when more addresses are bundled to the same primary house number. If present, houseNumber1 is mandatory.")

  public String getStreet2() {
    return street2;
  }


  public void setStreet2(String street2) {
    
    
    
    this.street2 = street2;
  }


  public Address customer(Customer customer) {
    
    
    
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Customer getCustomer() {
    return customer;
  }


  public void setCustomer(Customer customer) {
    
    
    
    this.customer = customer;
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
   * @return the Address instance itself
   */
  public Address putAdditionalProperty(String key, Object value) {
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
    Address address = (Address) o;
    return Objects.equals(this.street1, address.street1) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.company, address.company) &&
        Objects.equals(this.houseNumber1, address.houseNumber1) &&
        Objects.equals(this.postcode, address.postcode) &&
        Objects.equals(this.street2, address.street2) &&
        Objects.equals(this.customer, address.customer)&&
        Objects.equals(this.additionalProperties, address.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street1, city, state, postalCode, country, company, houseNumber1, postcode, street2, customer, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    houseNumber1: ").append(toIndentedString(houseNumber1)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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
    openapiFields.add("street1");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("postalCode");
    openapiFields.add("country");
    openapiFields.add("company");
    openapiFields.add("houseNumber1");
    openapiFields.add("postcode");
    openapiFields.add("street2");
    openapiFields.add("customer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Address
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Address.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Address is not found in the empty JSON string", Address.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("street1") != null && !jsonObj.get("street1").isJsonNull()) && !jsonObj.get("street1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street1").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("postalCode") != null && !jsonObj.get("postalCode").isJsonNull()) && !jsonObj.get("postalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postalCode").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("company") != null && !jsonObj.get("company").isJsonNull()) && !jsonObj.get("company").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company").toString()));
      }
      if ((jsonObj.get("houseNumber1") != null && !jsonObj.get("houseNumber1").isJsonNull()) && !jsonObj.get("houseNumber1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `houseNumber1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("houseNumber1").toString()));
      }
      if ((jsonObj.get("postcode") != null && !jsonObj.get("postcode").isJsonNull()) && !jsonObj.get("postcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postcode").toString()));
      }
      if ((jsonObj.get("street2") != null && !jsonObj.get("street2").isJsonNull()) && !jsonObj.get("street2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street2").toString()));
      }
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        Customer.validateJsonObject(jsonObj.getAsJsonObject("customer"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Address.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Address' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Address> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Address.class));

       return (TypeAdapter<T>) new TypeAdapter<Address>() {
           @Override
           public void write(JsonWriter out, Address value) throws IOException {
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
           public Address read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Address instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Address given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Address
  * @throws IOException if the JSON string is invalid with respect to Address
  */
  public static Address fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Address.class);
  }

 /**
  * Convert an instance of Address to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

