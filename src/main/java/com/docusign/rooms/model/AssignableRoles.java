package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.RoleSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AssignableRoles
 */

public class AssignableRoles {
  @JsonProperty("currentRoleId")
  private Integer currentRoleId = null;

  @JsonProperty("roles")
  private java.util.List<RoleSummary> roles = null;

  @JsonProperty("resultSetSize")
  private Integer resultSetSize = null;

  @JsonProperty("startPosition")
  private Integer startPosition = null;

  @JsonProperty("endPosition")
  private Integer endPosition = null;

  @JsonProperty("nextUri")
  private String nextUri = null;

  @JsonProperty("priorUri")
  private String priorUri = null;

  @JsonProperty("totalRowCount")
  private Integer totalRowCount = null;

  public AssignableRoles currentRoleId(Integer currentRoleId) {
    this.currentRoleId = currentRoleId;
    return this;
  }

   /**
   * Get currentRoleId
   * @return currentRoleId
  **/
  @ApiModelProperty(value = "")
  public Integer getCurrentRoleId() {
    return currentRoleId;
  }

  public void setCurrentRoleId(Integer currentRoleId) {
    this.currentRoleId = currentRoleId;
  }

  public AssignableRoles roles(java.util.List<RoleSummary> roles) {
    this.roles = roles;
    return this;
  }

  public AssignableRoles addRolesItem(RoleSummary rolesItem) {
    if (this.roles == null) {
      this.roles = new java.util.ArrayList<RoleSummary>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")
  public java.util.List<RoleSummary> getRoles() {
    return roles;
  }

  public void setRoles(java.util.List<RoleSummary> roles) {
    this.roles = roles;
  }

  public AssignableRoles resultSetSize(Integer resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

   /**
   * Get resultSetSize
   * @return resultSetSize
  **/
  @ApiModelProperty(value = "")
  public Integer getResultSetSize() {
    return resultSetSize;
  }

  public void setResultSetSize(Integer resultSetSize) {
    this.resultSetSize = resultSetSize;
  }

  public AssignableRoles startPosition(Integer startPosition) {
    this.startPosition = startPosition;
    return this;
  }

   /**
   * Get startPosition
   * @return startPosition
  **/
  @ApiModelProperty(value = "")
  public Integer getStartPosition() {
    return startPosition;
  }

  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

   /**
   * Get endPosition
   * @return endPosition
  **/
  @ApiModelProperty(value = "")
  public Integer getEndPosition() {
    return endPosition;
  }

  public AssignableRoles nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }

   /**
   * Get nextUri
   * @return nextUri
  **/
  @ApiModelProperty(value = "")
  public String getNextUri() {
    return nextUri;
  }

  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }

  public AssignableRoles priorUri(String priorUri) {
    this.priorUri = priorUri;
    return this;
  }

   /**
   * Get priorUri
   * @return priorUri
  **/
  @ApiModelProperty(value = "")
  public String getPriorUri() {
    return priorUri;
  }

  public void setPriorUri(String priorUri) {
    this.priorUri = priorUri;
  }

  public AssignableRoles totalRowCount(Integer totalRowCount) {
    this.totalRowCount = totalRowCount;
    return this;
  }

   /**
   * Get totalRowCount
   * @return totalRowCount
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalRowCount() {
    return totalRowCount;
  }

  public void setTotalRowCount(Integer totalRowCount) {
    this.totalRowCount = totalRowCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignableRoles assignableRoles = (AssignableRoles) o;
    return Objects.equals(this.currentRoleId, assignableRoles.currentRoleId) &&
        Objects.equals(this.roles, assignableRoles.roles) &&
        Objects.equals(this.resultSetSize, assignableRoles.resultSetSize) &&
        Objects.equals(this.startPosition, assignableRoles.startPosition) &&
        Objects.equals(this.endPosition, assignableRoles.endPosition) &&
        Objects.equals(this.nextUri, assignableRoles.nextUri) &&
        Objects.equals(this.priorUri, assignableRoles.priorUri) &&
        Objects.equals(this.totalRowCount, assignableRoles.totalRowCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentRoleId, roles, resultSetSize, startPosition, endPosition, nextUri, priorUri, totalRowCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignableRoles {\n");
    
    sb.append("    currentRoleId: ").append(toIndentedString(currentRoleId)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    priorUri: ").append(toIndentedString(priorUri)).append("\n");
    sb.append("    totalRowCount: ").append(toIndentedString(totalRowCount)).append("\n");
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

