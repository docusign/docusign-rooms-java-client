package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;

/**
 * RoomUserRemovalDetail.
 *
 */

public class RoomUserRemovalDetail {
  @JsonProperty("revocationDate")
  private OffsetDateTime revocationDate = null;


  /**
   * revocationDate.
   *
   * @return RoomUserRemovalDetail
   **/
  public RoomUserRemovalDetail revocationDate(OffsetDateTime revocationDate) {
    this.revocationDate = revocationDate;
    return this;
  }

  /**
   * Get revocationDate.
   * @return revocationDate
   **/
  @Schema(description = "")
  public OffsetDateTime getRevocationDate() {
    return revocationDate;
  }

  /**
   * setRevocationDate.
   **/
  public void setRevocationDate(OffsetDateTime revocationDate) {
    this.revocationDate = revocationDate;
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
    RoomUserRemovalDetail roomUserRemovalDetail = (RoomUserRemovalDetail) o;
    return Objects.equals(this.revocationDate, roomUserRemovalDetail.revocationDate);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(revocationDate);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomUserRemovalDetail {\n");
    
    sb.append("    revocationDate: ").append(toIndentedString(revocationDate)).append("\n");
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

