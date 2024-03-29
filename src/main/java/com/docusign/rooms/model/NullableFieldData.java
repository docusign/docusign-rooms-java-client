package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * NullableFieldData
 */

public class NullableFieldData {
  @JsonProperty("data")
  private java.util.Map<String, Object> data = null;

  public NullableFieldData data(java.util.Map<String, Object> data) {
    this.data = data;
    return this;
  }

  public NullableFieldData putDataItem(String key, Object dataItem) {
    if (this.data == null) {
      this.data = new java.util.HashMap<String, Object>();
    }
    this.data.put(key, dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public java.util.Map<String, Object> getData() {
    return data;
  }

  public void setData(java.util.Map<String, Object> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NullableFieldData nullableFieldData = (NullableFieldData) o;
    return Objects.equals(this.data, nullableFieldData.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NullableFieldData {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

