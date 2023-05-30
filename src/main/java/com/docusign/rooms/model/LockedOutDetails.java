package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * LockedOutDetails.
 *
 */

public class LockedOutDetails {
  @JsonProperty("reason")
  private String reason = null;


  /**
   * reason.
   *
   * @return LockedOutDetails
   **/
  public LockedOutDetails reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason.
   * @return reason
   **/
  @Schema(required = true, description = "")
  public String getReason() {
    return reason;
  }

  /**
   * setReason.
   **/
  public void setReason(String reason) {
    this.reason = reason;
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
    LockedOutDetails lockedOutDetails = (LockedOutDetails) o;
    return Objects.equals(this.reason, lockedOutDetails.reason);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(reason);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LockedOutDetails {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

