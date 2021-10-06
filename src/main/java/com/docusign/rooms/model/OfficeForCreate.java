package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OfficeForCreate.
 *
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


  /**
   * name.
   *
   * @return OfficeForCreate
   **/
  public OfficeForCreate name(String name) {
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
   * @return OfficeForCreate
   **/
  public OfficeForCreate regionId(Integer regionId) {
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
   * @return OfficeForCreate
   **/
  public OfficeForCreate address1(String address1) {
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
   * @return OfficeForCreate
   **/
  public OfficeForCreate address2(String address2) {
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
   * @return OfficeForCreate
   **/
  public OfficeForCreate city(String city) {
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
   * @return OfficeForCreate
   **/
  public OfficeForCreate stateId(String stateId) {
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
   * @return OfficeForCreate
   **/
  public OfficeForCreate postalCode(String postalCode) {
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
   * @return OfficeForCreate
   **/
  public OfficeForCreate countryId(String countryId) {
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
   * @return OfficeForCreate
   **/
  public OfficeForCreate timeZoneId(String timeZoneId) {
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
   * @return OfficeForCreate
   **/
  public OfficeForCreate phone(String phone) {
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(name, regionId, address1, address2, city, stateId, postalCode, countryId, timeZoneId, phone);
  }


  /**
   * Converts the given object to string.
   */
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

