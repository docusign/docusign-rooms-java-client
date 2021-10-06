package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DesignatedOffice.
 *
 */

public class DesignatedOffice {
  @JsonProperty("officeId")
  private Integer officeId = null;


  /**
   * officeId.
   *
   * @return DesignatedOffice
   **/
  public DesignatedOffice officeId(Integer officeId) {
    this.officeId = officeId;
    return this;
  }

  /**
   * Get officeId.
   * @return officeId
   **/
  @ApiModelProperty(required = true, value = "")
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
    DesignatedOffice designatedOffice = (DesignatedOffice) o;
    return Objects.equals(this.officeId, designatedOffice.officeId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(officeId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DesignatedOffice {\n");
    
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
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

