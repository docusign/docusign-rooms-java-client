package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.Permissions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RoleForUpdate.
 *
 */

public class RoleForUpdate {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isExternal")
  private Boolean isExternal = null;

  @JsonProperty("permissions")
  private Permissions permissions = null;


  /**
   * name.
   *
   * @return RoleForUpdate
   **/
  public RoleForUpdate name(String name) {
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
   * isExternal.
   *
   * @return RoleForUpdate
   **/
  public RoleForUpdate isExternal(Boolean isExternal) {
    this.isExternal = isExternal;
    return this;
  }

  /**
   * Get isExternal.
   * @return isExternal
   **/
  @Schema(description = "")
  public Boolean isIsExternal() {
    return isExternal;
  }

  /**
   * setIsExternal.
   **/
  public void setIsExternal(Boolean isExternal) {
    this.isExternal = isExternal;
  }


  /**
   * permissions.
   *
   * @return RoleForUpdate
   **/
  public RoleForUpdate permissions(Permissions permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Get permissions.
   * @return permissions
   **/
  @Schema(description = "")
  public Permissions getPermissions() {
    return permissions;
  }

  /**
   * setPermissions.
   **/
  public void setPermissions(Permissions permissions) {
    this.permissions = permissions;
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
    RoleForUpdate roleForUpdate = (RoleForUpdate) o;
    return Objects.equals(this.name, roleForUpdate.name) &&
        Objects.equals(this.isExternal, roleForUpdate.isExternal) &&
        Objects.equals(this.permissions, roleForUpdate.permissions);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(name, isExternal, permissions);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleForUpdate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isExternal: ").append(toIndentedString(isExternal)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

