package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.FieldDataForCreate;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RoomForCreate
 */

public class RoomForCreate {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("roleId")
  private Integer roleId = null;

  @JsonProperty("transactionSideId")
  private String transactionSideId = null;

  @JsonProperty("ownerId")
  private Integer ownerId = null;

  @JsonProperty("templateId")
  private Integer templateId = null;

  @JsonProperty("officeId")
  private Integer officeId = null;

  @JsonProperty("fieldData")
  private FieldDataForCreate fieldData = null;

  public RoomForCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RoomForCreate roleId(Integer roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * Get roleId
   * @return roleId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  public RoomForCreate transactionSideId(String transactionSideId) {
    this.transactionSideId = transactionSideId;
    return this;
  }

   /**
   * Required for a real estate company; otherwise ignored.
   * @return transactionSideId
  **/
  @ApiModelProperty(value = "Required for a real estate company; otherwise ignored.")
  public String getTransactionSideId() {
    return transactionSideId;
  }

  public void setTransactionSideId(String transactionSideId) {
    this.transactionSideId = transactionSideId;
  }

  public RoomForCreate ownerId(Integer ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @ApiModelProperty(value = "")
  public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  public RoomForCreate templateId(Integer templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @ApiModelProperty(value = "")
  public Integer getTemplateId() {
    return templateId;
  }

  public void setTemplateId(Integer templateId) {
    this.templateId = templateId;
  }

  public RoomForCreate officeId(Integer officeId) {
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @ApiModelProperty(value = "")
  public Integer getOfficeId() {
    return officeId;
  }

  public void setOfficeId(Integer officeId) {
    this.officeId = officeId;
  }

  public RoomForCreate fieldData(FieldDataForCreate fieldData) {
    this.fieldData = fieldData;
    return this;
  }

   /**
   * Get fieldData
   * @return fieldData
  **/
  @ApiModelProperty(value = "")
  public FieldDataForCreate getFieldData() {
    return fieldData;
  }

  public void setFieldData(FieldDataForCreate fieldData) {
    this.fieldData = fieldData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomForCreate roomForCreate = (RoomForCreate) o;
    return Objects.equals(this.name, roomForCreate.name) &&
        Objects.equals(this.roleId, roomForCreate.roleId) &&
        Objects.equals(this.transactionSideId, roomForCreate.transactionSideId) &&
        Objects.equals(this.ownerId, roomForCreate.ownerId) &&
        Objects.equals(this.templateId, roomForCreate.templateId) &&
        Objects.equals(this.officeId, roomForCreate.officeId) &&
        Objects.equals(this.fieldData, roomForCreate.fieldData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, roleId, transactionSideId, ownerId, templateId, officeId, fieldData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomForCreate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    transactionSideId: ").append(toIndentedString(transactionSideId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    fieldData: ").append(toIndentedString(fieldData)).append("\n");
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

