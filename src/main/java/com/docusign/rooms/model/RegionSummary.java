package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * RegionSummary.
 *
 */

public class RegionSummary {
  @JsonProperty("regionId")
  private Integer regionId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("createdDate")
  private String createdDate = null;


  /**
   * regionId.
   *
   * @return RegionSummary
   **/
  public RegionSummary regionId(Integer regionId) {
    this.regionId = regionId;
    return this;
  }

  /**
   * Get regionId.
   * @return regionId
   **/
  @Schema(description = "")
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
   * name.
   *
   * @return RegionSummary
   **/
  public RegionSummary name(String name) {
    this.name = name;
    return this;
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
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * createdDate.
   *
   * @return RegionSummary
   **/
  public RegionSummary createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
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
   * setCreatedDate.
   **/
  public void setCreatedDate(String createdDate) {
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
    RegionSummary regionSummary = (RegionSummary) o;
    return Objects.equals(this.regionId, regionSummary.regionId) &&
        Objects.equals(this.name, regionSummary.name) &&
        Objects.equals(this.createdDate, regionSummary.createdDate);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(regionId, name, createdDate);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionSummary {\n");
    
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

