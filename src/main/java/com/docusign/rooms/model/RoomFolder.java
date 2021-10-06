package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RoomFolder.
 *
 */

public class RoomFolder {
  @JsonProperty("roomFolderId")
  private Integer roomFolderId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isDefault")
  private Boolean isDefault = null;


  /**
   * roomFolderId.
   *
   * @return RoomFolder
   **/
  public RoomFolder roomFolderId(Integer roomFolderId) {
    this.roomFolderId = roomFolderId;
    return this;
  }

  /**
   * Get roomFolderId.
   * @return roomFolderId
   **/
  @ApiModelProperty(value = "")
  public Integer getRoomFolderId() {
    return roomFolderId;
  }

  /**
   * setRoomFolderId.
   **/
  public void setRoomFolderId(Integer roomFolderId) {
    this.roomFolderId = roomFolderId;
  }


  /**
   * name.
   *
   * @return RoomFolder
   **/
  public RoomFolder name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   * @return name
   **/
  @ApiModelProperty(value = "")
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
   * isDefault.
   *
   * @return RoomFolder
   **/
  public RoomFolder isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Get isDefault.
   * @return isDefault
   **/
  @ApiModelProperty(value = "")
  public Boolean isIsDefault() {
    return isDefault;
  }

  /**
   * setIsDefault.
   **/
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
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
    RoomFolder roomFolder = (RoomFolder) o;
    return Objects.equals(this.roomFolderId, roomFolder.roomFolderId) &&
        Objects.equals(this.name, roomFolder.name) &&
        Objects.equals(this.isDefault, roomFolder.isDefault);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(roomFolderId, name, isDefault);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomFolder {\n");
    
    sb.append("    roomFolderId: ").append(toIndentedString(roomFolderId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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

