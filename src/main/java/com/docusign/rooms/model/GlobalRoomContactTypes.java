package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.RoomContactType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GlobalRoomContactTypes
 */

public class GlobalRoomContactTypes {
  @JsonProperty("roomContactTypes")
  private java.util.List<RoomContactType> roomContactTypes = null;

  public GlobalRoomContactTypes roomContactTypes(java.util.List<RoomContactType> roomContactTypes) {
    this.roomContactTypes = roomContactTypes;
    return this;
  }

  public GlobalRoomContactTypes addRoomContactTypesItem(RoomContactType roomContactTypesItem) {
    if (this.roomContactTypes == null) {
      this.roomContactTypes = new java.util.ArrayList<RoomContactType>();
    }
    this.roomContactTypes.add(roomContactTypesItem);
    return this;
  }

   /**
   * Get roomContactTypes
   * @return roomContactTypes
  **/
  @ApiModelProperty(value = "")
  public java.util.List<RoomContactType> getRoomContactTypes() {
    return roomContactTypes;
  }

  public void setRoomContactTypes(java.util.List<RoomContactType> roomContactTypes) {
    this.roomContactTypes = roomContactTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalRoomContactTypes globalRoomContactTypes = (GlobalRoomContactTypes) o;
    return Objects.equals(this.roomContactTypes, globalRoomContactTypes.roomContactTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomContactTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalRoomContactTypes {\n");
    
    sb.append("    roomContactTypes: ").append(toIndentedString(roomContactTypes)).append("\n");
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

