package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.Permissions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * Role
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
  private DateTime createdDate = null;

  @JsonProperty("isAssigned")
  private Boolean isAssigned = null;

  @JsonProperty("permissions")
  private Permissions permissions = null;

  public Role roleId(Integer roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * Get roleId
   * @return roleId
  **/
  @ApiModelProperty(value = "")
  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  public Role legacyRoleId(String legacyRoleId) {
    this.legacyRoleId = legacyRoleId;
    return this;
  }

   /**
   * Get legacyRoleId
   * @return legacyRoleId
  **/
  @ApiModelProperty(value = "")
  public String getLegacyRoleId() {
    return legacyRoleId;
  }

  public void setLegacyRoleId(String legacyRoleId) {
    this.legacyRoleId = legacyRoleId;
  }

  public Role name(String name) {
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

  public Role isDefaultForAdmin(Boolean isDefaultForAdmin) {
    this.isDefaultForAdmin = isDefaultForAdmin;
    return this;
  }

   /**
   * Get isDefaultForAdmin
   * @return isDefaultForAdmin
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsDefaultForAdmin() {
    return isDefaultForAdmin;
  }

  public void setIsDefaultForAdmin(Boolean isDefaultForAdmin) {
    this.isDefaultForAdmin = isDefaultForAdmin;
  }

  public Role isExternal(Boolean isExternal) {
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

  public Role createdDate(DateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(DateTime createdDate) {
    this.createdDate = createdDate;
  }

  public Role isAssigned(Boolean isAssigned) {
    this.isAssigned = isAssigned;
    return this;
  }

   /**
   * Get isAssigned
   * @return isAssigned
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsAssigned() {
    return isAssigned;
  }

  public void setIsAssigned(Boolean isAssigned) {
    this.isAssigned = isAssigned;
  }

  public Role permissions(Permissions permissions) {
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

  @Override
  public int hashCode() {
    return Objects.hash(roleId, legacyRoleId, name, isDefaultForAdmin, isExternal, createdDate, isAssigned, permissions);
  }


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

