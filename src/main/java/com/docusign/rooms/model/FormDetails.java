package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * FormDetails.
 *
 */

public class FormDetails {
  @JsonProperty("formId")
  private java.util.UUID formId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  @JsonProperty("lastUpdatedDate")
  private String lastUpdatedDate = null;

  @JsonProperty("availableOnDate")
  private String availableOnDate = null;

  @JsonProperty("ownerName")
  private String ownerName = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("numberOfPages")
  private Integer numberOfPages = null;

  /**
   * Get formId.
   * @return formId
   **/
  @Schema(description = "")
  public java.util.UUID getFormId() {
    return formId;
  }

  /**
   * Get name.
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * Get createdDate.
   * @return createdDate
   **/
  @Schema(description = "")
  public String getCreatedDate() {
    return createdDate;
  }

  /**
   * Get lastUpdatedDate.
   * @return lastUpdatedDate
   **/
  @Schema(description = "")
  public String getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  /**
   * Get availableOnDate.
   * @return availableOnDate
   **/
  @Schema(description = "")
  public String getAvailableOnDate() {
    return availableOnDate;
  }

  /**
   * Get ownerName.
   * @return ownerName
   **/
  @Schema(description = "")
  public String getOwnerName() {
    return ownerName;
  }

  /**
   * Get version.
   * @return version
   **/
  @Schema(description = "")
  public String getVersion() {
    return version;
  }

  /**
   * Get numberOfPages.
   * @return numberOfPages
   **/
  @Schema(description = "")
  public Integer getNumberOfPages() {
    return numberOfPages;
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
    FormDetails formDetails = (FormDetails) o;
    return Objects.equals(this.formId, formDetails.formId) &&
        Objects.equals(this.name, formDetails.name) &&
        Objects.equals(this.createdDate, formDetails.createdDate) &&
        Objects.equals(this.lastUpdatedDate, formDetails.lastUpdatedDate) &&
        Objects.equals(this.availableOnDate, formDetails.availableOnDate) &&
        Objects.equals(this.ownerName, formDetails.ownerName) &&
        Objects.equals(this.version, formDetails.version) &&
        Objects.equals(this.numberOfPages, formDetails.numberOfPages);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(formId, name, createdDate, lastUpdatedDate, availableOnDate, ownerName, version, numberOfPages);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormDetails {\n");
    
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    availableOnDate: ").append(toIndentedString(availableOnDate)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    numberOfPages: ").append(toIndentedString(numberOfPages)).append("\n");
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

