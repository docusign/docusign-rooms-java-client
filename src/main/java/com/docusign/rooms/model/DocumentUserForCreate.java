package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DocumentUserForCreate.
 *
 */

public class DocumentUserForCreate {
  @JsonProperty("userId")
  private Integer userId = null;


  /**
   * userId.
   *
   * @return DocumentUserForCreate
   **/
  public DocumentUserForCreate userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId.
   * @return userId
   **/
  @Schema(required = true, description = "")
  public Integer getUserId() {
    return userId;
  }

  /**
   * setUserId.
   **/
  public void setUserId(Integer userId) {
    this.userId = userId;
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
    DocumentUserForCreate documentUserForCreate = (DocumentUserForCreate) o;
    return Objects.equals(this.userId, documentUserForCreate.userId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(userId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentUserForCreate {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

