package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DesignatedRegion.
 *
 */

public class DesignatedRegion {
  @JsonProperty("regionId")
  private Integer regionId = null;


  /**
   * regionId.
   *
   * @return DesignatedRegion
   **/
  public DesignatedRegion regionId(Integer regionId) {
    this.regionId = regionId;
    return this;
  }

  /**
   * Get regionId.
   * @return regionId
   **/
  @Schema(required = true, description = "")
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
    DesignatedRegion designatedRegion = (DesignatedRegion) o;
    return Objects.equals(this.regionId, designatedRegion.regionId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(regionId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DesignatedRegion {\n");
    
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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

