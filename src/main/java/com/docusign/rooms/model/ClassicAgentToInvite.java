package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ClassicAgentToInvite.
 *
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

  @JsonProperty("companyTypeId")
  private String companyTypeId = null;

  @JsonProperty("eSignPermissionProfileId")
  private String eSignPermissionProfileId = null;


  /**
   * firstName.
   *
   * @return ClassicAgentToInvite
   **/
  public ClassicAgentToInvite firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName.
   * @return firstName
   **/
  @Schema(required = true, description = "")
  public String getFirstName() {
    return firstName;
  }

  /**
   * setFirstName.
   **/
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   * lastName.
   *
   * @return ClassicAgentToInvite
   **/
  public ClassicAgentToInvite lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName.
   * @return lastName
   **/
  @Schema(required = true, description = "")
  public String getLastName() {
    return lastName;
  }

  /**
   * setLastName.
   **/
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   * email.
   *
   * @return ClassicAgentToInvite
   **/
  public ClassicAgentToInvite email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email.
   * @return email
   **/
  @Schema(required = true, description = "")
  public String getEmail() {
    return email;
  }

  /**
   * setEmail.
   **/
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * officeId.
   *
   * @return ClassicAgentToInvite
   **/
  public ClassicAgentToInvite officeId(Integer officeId) {
    this.officeId = officeId;
    return this;
  }

  /**
   * Get officeId.
   * @return officeId
   **/
  @Schema(required = true, description = "")
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
   * companyTypeId.
   *
   * @return ClassicAgentToInvite
   **/
  public ClassicAgentToInvite companyTypeId(String companyTypeId) {
    this.companyTypeId = companyTypeId;
    return this;
  }

  /**
   * Get companyTypeId.
   * @return companyTypeId
   **/
  @Schema(description = "")
  public String getCompanyTypeId() {
    return companyTypeId;
  }

  /**
   * setCompanyTypeId.
   **/
  public void setCompanyTypeId(String companyTypeId) {
    this.companyTypeId = companyTypeId;
  }


  /**
   * eSignPermissionProfileId.
   *
   * @return ClassicAgentToInvite
   **/
  public ClassicAgentToInvite eSignPermissionProfileId(String eSignPermissionProfileId) {
    this.eSignPermissionProfileId = eSignPermissionProfileId;
    return this;
  }

  /**
   * Required when the company is tightly bound to an eSign account; otherwise ignored..
   * @return eSignPermissionProfileId
   **/
  @Schema(description = "Required when the company is tightly bound to an eSign account; otherwise ignored.")
  public String getESignPermissionProfileId() {
    return eSignPermissionProfileId;
  }

  /**
   * setESignPermissionProfileId.
   **/
  public void setESignPermissionProfileId(String eSignPermissionProfileId) {
    this.eSignPermissionProfileId = eSignPermissionProfileId;
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
    ClassicAgentToInvite classicAgentToInvite = (ClassicAgentToInvite) o;
    return Objects.equals(this.firstName, classicAgentToInvite.firstName) &&
        Objects.equals(this.lastName, classicAgentToInvite.lastName) &&
        Objects.equals(this.email, classicAgentToInvite.email) &&
        Objects.equals(this.officeId, classicAgentToInvite.officeId) &&
        Objects.equals(this.companyTypeId, classicAgentToInvite.companyTypeId) &&
        Objects.equals(this.eSignPermissionProfileId, classicAgentToInvite.eSignPermissionProfileId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, officeId, companyTypeId, eSignPermissionProfileId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassicAgentToInvite {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    companyTypeId: ").append(toIndentedString(companyTypeId)).append("\n");
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

