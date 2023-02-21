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
 * OfficeSummary.
 *
 */

public class OfficeSummary {
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
   * Get officeId.
   * @return officeId
   **/
  @ApiModelProperty(value = "")
  public Integer getOfficeId() {
    return officeId;
  }

  /**
   * Get name.
   * @return name
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
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
   * Get address1.
   * @return address1
   **/
  @ApiModelProperty(value = "")
  public String getAddress1() {
    return address1;
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
   * Get city.
   * @return city
   **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
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
   * Get postalCode.
   * @return postalCode
   **/
  @ApiModelProperty(value = "")
  public String getPostalCode() {
    return postalCode;
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
   * Get timeZoneId.
   * @return timeZoneId
   **/
  @ApiModelProperty(value = "")
  public String getTimeZoneId() {
    return timeZoneId;
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
   * Get createdDate.
   * @return createdDate
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
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
    OfficeSummary officeSummary = (OfficeSummary) o;
    return Objects.equals(this.officeId, officeSummary.officeId) &&
        Objects.equals(this.name, officeSummary.name) &&
        Objects.equals(this.regionId, officeSummary.regionId) &&
        Objects.equals(this.address1, officeSummary.address1) &&
        Objects.equals(this.address2, officeSummary.address2) &&
        Objects.equals(this.city, officeSummary.city) &&
        Objects.equals(this.stateId, officeSummary.stateId) &&
        Objects.equals(this.postalCode, officeSummary.postalCode) &&
        Objects.equals(this.countryId, officeSummary.countryId) &&
        Objects.equals(this.timeZoneId, officeSummary.timeZoneId) &&
        Objects.equals(this.phone, officeSummary.phone) &&
        Objects.equals(this.createdDate, officeSummary.createdDate);
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
    sb.append("class OfficeSummary {\n");
    
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

