package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.ESignPermissionProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ESignPermissionProfileList.
 *
 */

public class ESignPermissionProfileList {
  @JsonProperty("permissionProfiles")
  private java.util.List<ESignPermissionProfile> permissionProfiles = null;

  /**
   * Get permissionProfiles.
   * @return permissionProfiles
   **/
  @Schema(description = "")
  public java.util.List<ESignPermissionProfile> getPermissionProfiles() {
    return permissionProfiles;
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
    ESignPermissionProfileList esignPermissionProfileList = (ESignPermissionProfileList) o;
    return Objects.equals(this.permissionProfiles, esignPermissionProfileList.permissionProfiles);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(permissionProfiles);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ESignPermissionProfileList {\n");
    
    sb.append("    permissionProfiles: ").append(toIndentedString(permissionProfiles)).append("\n");
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

