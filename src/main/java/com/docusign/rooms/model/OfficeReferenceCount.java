package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OfficeReferenceCount
 */

public class OfficeReferenceCount {
  @JsonProperty("referenceType")
  private String referenceType = null;

  @JsonProperty("referencedCount")
  private Integer referencedCount = null;

   /**
   * Get referenceType
   * @return referenceType
  **/
  @ApiModelProperty(value = "")
  public String getReferenceType() {
    return referenceType;
  }

   /**
   * Get referencedCount
   * @return referencedCount
  **/
  @ApiModelProperty(value = "")
  public Integer getReferencedCount() {
    return referencedCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfficeReferenceCount officeReferenceCount = (OfficeReferenceCount) o;
    return Objects.equals(this.referenceType, officeReferenceCount.referenceType) &&
        Objects.equals(this.referencedCount, officeReferenceCount.referencedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceType, referencedCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfficeReferenceCount {\n");
    
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
    sb.append("    referencedCount: ").append(toIndentedString(referencedCount)).append("\n");
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

