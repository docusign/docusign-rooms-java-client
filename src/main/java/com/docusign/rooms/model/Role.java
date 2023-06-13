package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.Permissions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * Role.
 *
 */

public class Role {
  @JsonProperty("roleId")
  private Integer roleId = null;

  @JsonProperty("legacyRoleId")
  private String legacyRoleId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isDefaultForAdmin")
  private Boolean isDefaultForAdmin = null;

  @JsonProperty("isExternal")
  private Boolean isExternal = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  @JsonProperty("isAssigned")
  private Boolean isAssigned = null;

  @JsonProperty("permissions")
  private Permissions permissions = null;


  /**
   * roleId.
   *
   * @return Role
   **/
  public Role roleId(Integer roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Get roleId.
   * @return roleId
   **/
  @Schema(description = "")
  public Integer getRoleId() {
    return roleId;
  }

  /**
   * setRoleId.
   **/
  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }


  /**
   * legacyRoleId.
   *
   * @return Role
   **/
  public Role legacyRoleId(String legacyRoleId) {
    this.legacyRoleId = legacyRoleId;
    return this;
  }

  /**
   * Get legacyRoleId.
   * @return legacyRoleId
   **/
  @Schema(description = "")
  public String getLegacyRoleId() {
    return legacyRoleId;
  }

  /**
   * setLegacyRoleId.
   **/
  public void setLegacyRoleId(String legacyRoleId) {
    this.legacyRoleId = legacyRoleId;
  }


  /**
   * name.
   *
   * @return Role
   **/
  public Role name(String name) {
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
   * isDefaultForAdmin.
   *
   * @return Role
   **/
  public Role isDefaultForAdmin(Boolean isDefaultForAdmin) {
    this.isDefaultForAdmin = isDefaultForAdmin;
    return this;
  }

  /**
   * Get isDefaultForAdmin.
   * @return isDefaultForAdmin
   **/
  @Schema(description = "")
  public Boolean isIsDefaultForAdmin() {
    return isDefaultForAdmin;
  }

  /**
   * setIsDefaultForAdmin.
   **/
  public void setIsDefaultForAdmin(Boolean isDefaultForAdmin) {
    this.isDefaultForAdmin = isDefaultForAdmin;
  }


  /**
   * isExternal.
   *
   * @return Role
   **/
  public Role isExternal(Boolean isExternal) {
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
   * createdDate.
   *
   * @return Role
   **/
  public Role createdDate(String createdDate) {
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
   * isAssigned.
   *
   * @return Role
   **/
  public Role isAssigned(Boolean isAssigned) {
    this.isAssigned = isAssigned;
    return this;
  }

  /**
   * Get isAssigned.
   * @return isAssigned
   **/
  @Schema(description = "")
  public Boolean isIsAssigned() {
    return isAssigned;
  }

  /**
   * setIsAssigned.
   **/
  public void setIsAssigned(Boolean isAssigned) {
    this.isAssigned = isAssigned;
  }


  /**
   * permissions.
   *
   * @return Role
   **/
  public Role permissions(Permissions permissions) {
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
    Role role = (Role) o;
    return Objects.equals(this.roleId, role.roleId) &&
        Objects.equals(this.legacyRoleId, role.legacyRoleId) &&
        Objects.equals(this.name, role.name) &&
        Objects.equals(this.isDefaultForAdmin, role.isDefaultForAdmin) &&
        Objects.equals(this.isExternal, role.isExternal) &&
        Objects.equals(this.createdDate, role.createdDate) &&
        Objects.equals(this.isAssigned, role.isAssigned) &&
        Objects.equals(this.permissions, role.permissions);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(roleId, legacyRoleId, name, isDefaultForAdmin, isExternal, createdDate, isAssigned, permissions);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    legacyRoleId: ").append(toIndentedString(legacyRoleId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isDefaultForAdmin: ").append(toIndentedString(isDefaultForAdmin)).append("\n");
    sb.append("    isExternal: ").append(toIndentedString(isExternal)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    isAssigned: ").append(toIndentedString(isAssigned)).append("\n");
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

