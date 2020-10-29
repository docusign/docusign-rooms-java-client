package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.OfficeReferenceCount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OfficeReferenceCountList
 */

public class OfficeReferenceCountList {
  @JsonProperty("referencesCounts")
  private java.util.List<OfficeReferenceCount> referencesCounts = null;

  public OfficeReferenceCountList referencesCounts(java.util.List<OfficeReferenceCount> referencesCounts) {
    this.referencesCounts = referencesCounts;
    return this;
  }

  public OfficeReferenceCountList addReferencesCountsItem(OfficeReferenceCount referencesCountsItem) {
    if (this.referencesCounts == null) {
      this.referencesCounts = new java.util.ArrayList<OfficeReferenceCount>();
    }
    this.referencesCounts.add(referencesCountsItem);
    return this;
  }

   /**
   * Get referencesCounts
   * @return referencesCounts
  **/
  @ApiModelProperty(value = "")
  public java.util.List<OfficeReferenceCount> getReferencesCounts() {
    return referencesCounts;
  }

  public void setReferencesCounts(java.util.List<OfficeReferenceCount> referencesCounts) {
    this.referencesCounts = referencesCounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfficeReferenceCountList officeReferenceCountList = (OfficeReferenceCountList) o;
    return Objects.equals(this.referencesCounts, officeReferenceCountList.referencesCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referencesCounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfficeReferenceCountList {\n");
    
    sb.append("    referencesCounts: ").append(toIndentedString(referencesCounts)).append("\n");
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

