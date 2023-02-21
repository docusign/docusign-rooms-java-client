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
 * RoomForCreate.
 *
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

  /**
   * Gets or Sets listingSource
   */
  public enum ListingSourceEnum {
    PUBLICRECORDS("PublicRecords"),
    
    MLS("MLS");

    private String value;

    ListingSourceEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ListingSourceEnum fromValue(String value) {
      for (ListingSourceEnum b : ListingSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("listingSource")
  private ListingSourceEnum listingSource = null;


  /**
   * name.
   *
   * @return RoomForCreate
   **/
  public RoomForCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   * @return name
   **/
  @ApiModelProperty(required = true, value = "")
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
   * roleId.
   *
   * @return RoomForCreate
   **/
  public RoomForCreate roleId(Integer roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Get roleId.
   * @return roleId
   **/
  @ApiModelProperty(required = true, value = "")
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
   * transactionSideId.
   *
   * @return RoomForCreate
   **/
  public RoomForCreate transactionSideId(String transactionSideId) {
    this.transactionSideId = transactionSideId;
    return this;
  }

  /**
   * Required for a real estate company; otherwise ignored..
   * @return transactionSideId
   **/
  @ApiModelProperty(value = "Required for a real estate company; otherwise ignored.")
  public String getTransactionSideId() {
    return transactionSideId;
  }

  /**
   * setTransactionSideId.
   **/
  public void setTransactionSideId(String transactionSideId) {
    this.transactionSideId = transactionSideId;
  }


  /**
   * ownerId.
   *
   * @return RoomForCreate
   **/
  public RoomForCreate ownerId(Integer ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId.
   * @return ownerId
   **/
  @ApiModelProperty(value = "")
  public Integer getOwnerId() {
    return ownerId;
  }

  /**
   * setOwnerId.
   **/
  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }


  /**
   * templateId.
   *
   * @return RoomForCreate
   **/
  public RoomForCreate templateId(Integer templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * Get templateId.
   * @return templateId
   **/
  @ApiModelProperty(value = "")
  public Integer getTemplateId() {
    return templateId;
  }

  /**
   * setTemplateId.
   **/
  public void setTemplateId(Integer templateId) {
    this.templateId = templateId;
  }


  /**
   * officeId.
   *
   * @return RoomForCreate
   **/
  public RoomForCreate officeId(Integer officeId) {
    this.officeId = officeId;
    return this;
  }

  /**
   * Get officeId.
   * @return officeId
   **/
  @ApiModelProperty(value = "")
  public Integer getOfficeId() {
    return officeId;
  }

  /**
   * setOfficeId.
   **/
  public void setOfficeId(Integer officeId) {
    this.officeId = officeId;
  }


  /**
   * fieldData.
   *
   * @return RoomForCreate
   **/
  public RoomForCreate fieldData(FieldDataForCreate fieldData) {
    this.fieldData = fieldData;
    return this;
  }

  /**
   * Get fieldData.
   * @return fieldData
   **/
  @ApiModelProperty(value = "")
  public FieldDataForCreate getFieldData() {
    return fieldData;
  }

  /**
   * setFieldData.
   **/
  public void setFieldData(FieldDataForCreate fieldData) {
    this.fieldData = fieldData;
  }


  /**
   * listingSource.
   *
   * @return RoomForCreate
   **/
  public RoomForCreate listingSource(ListingSourceEnum listingSource) {
    this.listingSource = listingSource;
    return this;
  }

  /**
   * Get listingSource.
   * @return listingSource
   **/
  @ApiModelProperty(value = "")
  public ListingSourceEnum getListingSource() {
    return listingSource;
  }

  /**
   * setListingSource.
   **/
  public void setListingSource(ListingSourceEnum listingSource) {
    this.listingSource = listingSource;
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
    RoomForCreate roomForCreate = (RoomForCreate) o;
    return Objects.equals(this.name, roomForCreate.name) &&
        Objects.equals(this.roleId, roomForCreate.roleId) &&
        Objects.equals(this.transactionSideId, roomForCreate.transactionSideId) &&
        Objects.equals(this.ownerId, roomForCreate.ownerId) &&
        Objects.equals(this.templateId, roomForCreate.templateId) &&
        Objects.equals(this.officeId, roomForCreate.officeId) &&
        Objects.equals(this.fieldData, roomForCreate.fieldData) &&
        Objects.equals(this.listingSource, roomForCreate.listingSource);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(name, roleId, transactionSideId, ownerId, templateId, officeId, fieldData, listingSource);
  }


  /**
   * Converts the given object to string.
   */
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
    sb.append("    listingSource: ").append(toIndentedString(listingSource)).append("\n");
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

