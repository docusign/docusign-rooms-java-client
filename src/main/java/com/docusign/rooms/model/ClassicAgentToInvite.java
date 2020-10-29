package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassicAgentToInvite
 */

public class ClassicAgentToInvite {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("officeId")
  private Integer officeId = null;

  @JsonProperty("eSignPermissionProfileId")
  private String eSignPermissionProfileId = null;

  public ClassicAgentToInvite firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ClassicAgentToInvite lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ClassicAgentToInvite email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ClassicAgentToInvite officeId(Integer officeId) {
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getOfficeId() {
    return officeId;
  }

  public void setOfficeId(Integer officeId) {
    this.officeId = officeId;
  }

  public ClassicAgentToInvite eSignPermissionProfileId(String eSignPermissionProfileId) {
    this.eSignPermissionProfileId = eSignPermissionProfileId;
    return this;
  }

   /**
   * Required when the company is tightly bound to an eSign account; otherwise ignored.
   * @return eSignPermissionProfileId
  **/
  @ApiModelProperty(value = "Required when the company is tightly bound to an eSign account; otherwise ignored.")
  public String getESignPermissionProfileId() {
    return eSignPermissionProfileId;
  }

  public void setESignPermissionProfileId(String eSignPermissionProfileId) {
    this.eSignPermissionProfileId = eSignPermissionProfileId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassicAgentToInvite classicAgentToInvite = (ClassicAgentToInvite) o;
    return Objects.equals(this.firstName, classicAgentToInvite.firstName) &&
        Objects.equals(this.lastName, classicAgentToInvite.lastName) &&
        Objects.equals(this.email, classicAgentToInvite.email) &&
        Objects.equals(this.officeId, classicAgentToInvite.officeId) &&
        Objects.equals(this.eSignPermissionProfileId, classicAgentToInvite.eSignPermissionProfileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, officeId, eSignPermissionProfileId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassicAgentToInvite {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    eSignPermissionProfileId: ").append(toIndentedString(eSignPermissionProfileId)).append("\n");
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

