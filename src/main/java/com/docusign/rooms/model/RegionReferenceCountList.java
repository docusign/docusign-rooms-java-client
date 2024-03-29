package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.RegionReferenceCount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RegionReferenceCountList.
 *
 */

public class RegionReferenceCountList {
  @JsonProperty("referenceCounts")
  private java.util.List<RegionReferenceCount> referenceCounts = null;


  /**
   * referenceCounts.
   *
   * @return RegionReferenceCountList
   **/
  public RegionReferenceCountList referenceCounts(java.util.List<RegionReferenceCount> referenceCounts) {
    this.referenceCounts = referenceCounts;
    return this;
  }
  
  /**
   * addReferenceCountsItem.
   *
   * @return RegionReferenceCountList
   **/
  public RegionReferenceCountList addReferenceCountsItem(RegionReferenceCount referenceCountsItem) {
    if (this.referenceCounts == null) {
      this.referenceCounts = new java.util.ArrayList<>();
    }
    this.referenceCounts.add(referenceCountsItem);
    return this;
  }

  /**
   * Get referenceCounts.
   * @return referenceCounts
   **/
  @Schema(description = "")
  public java.util.List<RegionReferenceCount> getReferenceCounts() {
    return referenceCounts;
  }

  /**
   * setReferenceCounts.
   **/
  public void setReferenceCounts(java.util.List<RegionReferenceCount> referenceCounts) {
    this.referenceCounts = referenceCounts;
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
    RegionReferenceCountList regionReferenceCountList = (RegionReferenceCountList) o;
    return Objects.equals(this.referenceCounts, regionReferenceCountList.referenceCounts);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(referenceCounts);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionReferenceCountList {\n");
    
    sb.append("    referenceCounts: ").append(toIndentedString(referenceCounts)).append("\n");
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

