package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.RoleSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AssignableRoles.
 *
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


  /**
   * currentRoleId.
   *
   * @return AssignableRoles
   **/
  public AssignableRoles currentRoleId(Integer currentRoleId) {
    this.currentRoleId = currentRoleId;
    return this;
  }

  /**
   * Get currentRoleId.
   * @return currentRoleId
   **/
  @Schema(description = "")
  public Integer getCurrentRoleId() {
    return currentRoleId;
  }

  /**
   * setCurrentRoleId.
   **/
  public void setCurrentRoleId(Integer currentRoleId) {
    this.currentRoleId = currentRoleId;
  }


  /**
   * roles.
   *
   * @return AssignableRoles
   **/
  public AssignableRoles roles(java.util.List<RoleSummary> roles) {
    this.roles = roles;
    return this;
  }
  
  /**
   * addRolesItem.
   *
   * @return AssignableRoles
   **/
  public AssignableRoles addRolesItem(RoleSummary rolesItem) {
    if (this.roles == null) {
      this.roles = new java.util.ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles.
   * @return roles
   **/
  @Schema(description = "")
  public java.util.List<RoleSummary> getRoles() {
    return roles;
  }

  /**
   * setRoles.
   **/
  public void setRoles(java.util.List<RoleSummary> roles) {
    this.roles = roles;
  }


  /**
   * resultSetSize.
   *
   * @return AssignableRoles
   **/
  public AssignableRoles resultSetSize(Integer resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

  /**
   * Get resultSetSize.
   * @return resultSetSize
   **/
  @Schema(description = "")
  public Integer getResultSetSize() {
    return resultSetSize;
  }

  /**
   * setResultSetSize.
   **/
  public void setResultSetSize(Integer resultSetSize) {
    this.resultSetSize = resultSetSize;
  }


  /**
   * startPosition.
   *
   * @return AssignableRoles
   **/
  public AssignableRoles startPosition(Integer startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Get startPosition.
   * @return startPosition
   **/
  @Schema(description = "")
  public Integer getStartPosition() {
    return startPosition;
  }

  /**
   * setStartPosition.
   **/
  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

  /**
   * Get endPosition.
   * @return endPosition
   **/
  @Schema(description = "")
  public Integer getEndPosition() {
    return endPosition;
  }


  /**
   * nextUri.
   *
   * @return AssignableRoles
   **/
  public AssignableRoles nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }

  /**
   * Get nextUri.
   * @return nextUri
   **/
  @Schema(description = "")
  public String getNextUri() {
    return nextUri;
  }

  /**
   * setNextUri.
   **/
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }


  /**
   * priorUri.
   *
   * @return AssignableRoles
   **/
  public AssignableRoles priorUri(String priorUri) {
    this.priorUri = priorUri;
    return this;
  }

  /**
   * Get priorUri.
   * @return priorUri
   **/
  @Schema(description = "")
  public String getPriorUri() {
    return priorUri;
  }

  /**
   * setPriorUri.
   **/
  public void setPriorUri(String priorUri) {
    this.priorUri = priorUri;
  }


  /**
   * totalRowCount.
   *
   * @return AssignableRoles
   **/
  public AssignableRoles totalRowCount(Integer totalRowCount) {
    this.totalRowCount = totalRowCount;
    return this;
  }

  /**
   * Get totalRowCount.
   * @return totalRowCount
   **/
  @Schema(description = "")
  public Integer getTotalRowCount() {
    return totalRowCount;
  }

  /**
   * setTotalRowCount.
   **/
  public void setTotalRowCount(Integer totalRowCount) {
    this.totalRowCount = totalRowCount;
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(currentRoleId, roles, resultSetSize, startPosition, endPosition, nextUri, priorUri, totalRowCount);
  }


  /**
   * Converts the given object to string.
   */
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

