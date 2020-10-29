package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OfficeForCreate
 */

public class OfficeForCreate {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("regionId")
  private Integer regionId = null;

  @JsonProperty("address1")
  private String address1 = null;

  @JsonProperty("address2")
  private String address2 = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("stateId")
  private String stateId = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("countryId")
  private String countryId = null;

  @JsonProperty("timeZoneId")
  private String timeZoneId = null;

  @JsonProperty("phone")
  private String phone = null;

  public OfficeForCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OfficeForCreate regionId(Integer regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Get regionId
   * @return regionId
  **/
  @ApiModelProperty(value = "")
  public Integer getRegionId() {
    return regionId;
  }

  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }

  public OfficeForCreate address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Get address1
   * @return address1
  **/
  @ApiModelProperty(value = "")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public OfficeForCreate address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Get address2
   * @return address2
  **/
  @ApiModelProperty(value = "")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public OfficeForCreate city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public OfficeForCreate stateId(String stateId) {
    this.stateId = stateId;
    return this;
  }

   /**
   * Get stateId
   * @return stateId
  **/
  @ApiModelProperty(value = "")
  public String getStateId() {
    return stateId;
  }

  public void setStateId(String stateId) {
    this.stateId = stateId;
  }

  public OfficeForCreate postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(value = "")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public OfficeForCreate countryId(String countryId) {
    this.countryId = countryId;
    return this;
  }

   /**
   * Get countryId
   * @return countryId
  **/
  @ApiModelProperty(value = "")
  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }

  public OfficeForCreate timeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
    return this;
  }

   /**
   * Get timeZoneId
   * @return timeZoneId
  **/
  @ApiModelProperty(value = "")
  public String getTimeZoneId() {
    return timeZoneId;
  }

  public void setTimeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
  }

  public OfficeForCreate phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfficeForCreate officeForCreate = (OfficeForCreate) o;
    return Objects.equals(this.name, officeForCreate.name) &&
        Objects.equals(this.regionId, officeForCreate.regionId) &&
        Objects.equals(this.address1, officeForCreate.address1) &&
        Objects.equals(this.address2, officeForCreate.address2) &&
        Objects.equals(this.city, officeForCreate.city) &&
        Objects.equals(this.stateId, officeForCreate.stateId) &&
        Objects.equals(this.postalCode, officeForCreate.postalCode) &&
        Objects.equals(this.countryId, officeForCreate.countryId) &&
        Objects.equals(this.timeZoneId, officeForCreate.timeZoneId) &&
        Objects.equals(this.phone, officeForCreate.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, regionId, address1, address2, city, stateId, postalCode, countryId, timeZoneId, phone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfficeForCreate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

