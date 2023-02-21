package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * Office.
 *
 */

public class Office {
  @JsonProperty("officeId")
  private Integer officeId = null;

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

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;


  /**
   * officeId.
   *
   * @return Office
   **/
  public Office officeId(Integer officeId) {
    this.officeId = officeId;
    return this;
  }

  /**
   * Get officeId.
   * @return officeId
   **/
  @ApiModelProperty(value = "")
  public Integer getOfficeId() {
    return officeId;
  }

  /**
   * setOfficeId.
   **/
  public void setOfficeId(Integer officeId) {
    this.officeId = officeId;
  }


  /**
   * name.
   *
   * @return Office
   **/
  public Office name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   * @return name
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * regionId.
   *
   * @return Office
   **/
  public Office regionId(Integer regionId) {
    this.regionId = regionId;
    return this;
  }

  /**
   * Get regionId.
   * @return regionId
   **/
  @ApiModelProperty(value = "")
  public Integer getRegionId() {
    return regionId;
  }

  /**
   * setRegionId.
   **/
  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }


  /**
   * address1.
   *
   * @return Office
   **/
  public Office address1(String address1) {
    this.address1 = address1;
    return this;
  }

  /**
   * Get address1.
   * @return address1
   **/
  @ApiModelProperty(value = "")
  public String getAddress1() {
    return address1;
  }

  /**
   * setAddress1.
   **/
  public void setAddress1(String address1) {
    this.address1 = address1;
  }


  /**
   * address2.
   *
   * @return Office
   **/
  public Office address2(String address2) {
    this.address2 = address2;
    return this;
  }

  /**
   * Get address2.
   * @return address2
   **/
  @ApiModelProperty(value = "")
  public String getAddress2() {
    return address2;
  }

  /**
   * setAddress2.
   **/
  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  /**
   * city.
   *
   * @return Office
   **/
  public Office city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city.
   * @return city
   **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  /**
   * setCity.
   **/
  public void setCity(String city) {
    this.city = city;
  }


  /**
   * stateId.
   *
   * @return Office
   **/
  public Office stateId(String stateId) {
    this.stateId = stateId;
    return this;
  }

  /**
   * Get stateId.
   * @return stateId
   **/
  @ApiModelProperty(value = "")
  public String getStateId() {
    return stateId;
  }

  /**
   * setStateId.
   **/
  public void setStateId(String stateId) {
    this.stateId = stateId;
  }


  /**
   * postalCode.
   *
   * @return Office
   **/
  public Office postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode.
   * @return postalCode
   **/
  @ApiModelProperty(value = "")
  public String getPostalCode() {
    return postalCode;
  }

  /**
   * setPostalCode.
   **/
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  /**
   * countryId.
   *
   * @return Office
   **/
  public Office countryId(String countryId) {
    this.countryId = countryId;
    return this;
  }

  /**
   * Get countryId.
   * @return countryId
   **/
  @ApiModelProperty(value = "")
  public String getCountryId() {
    return countryId;
  }

  /**
   * setCountryId.
   **/
  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }


  /**
   * timeZoneId.
   *
   * @return Office
   **/
  public Office timeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
    return this;
  }

  /**
   * Get timeZoneId.
   * @return timeZoneId
   **/
  @ApiModelProperty(value = "")
  public String getTimeZoneId() {
    return timeZoneId;
  }

  /**
   * setTimeZoneId.
   **/
  public void setTimeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
  }


  /**
   * phone.
   *
   * @return Office
   **/
  public Office phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone.
   * @return phone
   **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  /**
   * setPhone.
   **/
  public void setPhone(String phone) {
    this.phone = phone;
  }


  /**
   * createdDate.
   *
   * @return Office
   **/
  public Office createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate.
   * @return createdDate
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  /**
   * setCreatedDate.
   **/
  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Office office = (Office) o;
    return Objects.equals(this.officeId, office.officeId) &&
        Objects.equals(this.name, office.name) &&
        Objects.equals(this.regionId, office.regionId) &&
        Objects.equals(this.address1, office.address1) &&
        Objects.equals(this.address2, office.address2) &&
        Objects.equals(this.city, office.city) &&
        Objects.equals(this.stateId, office.stateId) &&
        Objects.equals(this.postalCode, office.postalCode) &&
        Objects.equals(this.countryId, office.countryId) &&
        Objects.equals(this.timeZoneId, office.timeZoneId) &&
        Objects.equals(this.phone, office.phone) &&
        Objects.equals(this.createdDate, office.createdDate);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(officeId, name, regionId, address1, address2, city, stateId, postalCode, countryId, timeZoneId, phone, createdDate);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Office {\n");
    
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
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
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

