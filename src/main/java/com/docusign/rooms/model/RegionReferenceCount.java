package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RegionReferenceCount
 */

public class RegionReferenceCount {
  @JsonProperty("referenceType")
  private String referenceType = null;

  @JsonProperty("referenceCount")
  private Integer referenceCount = null;

  public RegionReferenceCount referenceType(String referenceType) {
    this.referenceType = referenceType;
    return this;
  }

   /**
   * Get referenceType
   * @return referenceType
  **/
  @ApiModelProperty(value = "")
  public String getReferenceType() {
    return referenceType;
  }

  public void setReferenceType(String referenceType) {
    this.referenceType = referenceType;
  }

  public RegionReferenceCount referenceCount(Integer referenceCount) {
    this.referenceCount = referenceCount;
    return this;
  }

   /**
   * Get referenceCount
   * @return referenceCount
  **/
  @ApiModelProperty(value = "")
  public Integer getReferenceCount() {
    return referenceCount;
  }

  public void setReferenceCount(Integer referenceCount) {
    this.referenceCount = referenceCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegionReferenceCount regionReferenceCount = (RegionReferenceCount) o;
    return Objects.equals(this.referenceType, regionReferenceCount.referenceType) &&
        Objects.equals(this.referenceCount, regionReferenceCount.referenceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceType, referenceCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionReferenceCount {\n");
    
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
    sb.append("    referenceCount: ").append(toIndentedString(referenceCount)).append("\n");
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

