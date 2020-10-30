package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.Permissions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RoleForUpdate
 */

public class RoleForUpdate {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isExternal")
  private Boolean isExternal = null;

  @JsonProperty("permissions")
  private Permissions permissions = null;

  public RoleForUpdate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RoleForUpdate isExternal(Boolean isExternal) {
    this.isExternal = isExternal;
    return this;
  }

   /**
   * Get isExternal
   * @return isExternal
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsExternal() {
    return isExternal;
  }

  public void setIsExternal(Boolean isExternal) {
    this.isExternal = isExternal;
  }

  public RoleForUpdate permissions(Permissions permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @ApiModelProperty(value = "")
  public Permissions getPermissions() {
    return permissions;
  }

  public void setPermissions(Permissions permissions) {
    this.permissions = permissions;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(name, isExternal, permissions);
  }


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

