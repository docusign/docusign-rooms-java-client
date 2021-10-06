package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * FormSummary.
 *
 */

public class FormSummary {
  @JsonProperty("libraryFormId")
  private java.util.UUID libraryFormId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("lastUpdatedDate")
  private DateTime lastUpdatedDate = null;

  /**
   * Get libraryFormId.
   * @return libraryFormId
   **/
  @ApiModelProperty(value = "")
  public java.util.UUID getLibraryFormId() {
    return libraryFormId;
  }

  /**
   * Get name.
   * @return name
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  /**
   * Get lastUpdatedDate.
   * @return lastUpdatedDate
   **/
  @ApiModelProperty(value = "")
  public DateTime getLastUpdatedDate() {
    return lastUpdatedDate;
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
    FormSummary formSummary = (FormSummary) o;
    return Objects.equals(this.libraryFormId, formSummary.libraryFormId) &&
        Objects.equals(this.name, formSummary.name) &&
        Objects.equals(this.lastUpdatedDate, formSummary.lastUpdatedDate);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(libraryFormId, name, lastUpdatedDate);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormSummary {\n");
    
    sb.append("    libraryFormId: ").append(toIndentedString(libraryFormId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
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

