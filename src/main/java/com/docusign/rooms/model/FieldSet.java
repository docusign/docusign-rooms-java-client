package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.Field;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FieldSet.
 *
 */

public class FieldSet {
  @JsonProperty("fieldSetId")
  private java.util.UUID fieldSetId = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("fields")
  private java.util.List<Field> fields = null;

  /**
   * Get fieldSetId.
   * @return fieldSetId
   **/
  @ApiModelProperty(value = "")
  public java.util.UUID getFieldSetId() {
    return fieldSetId;
  }

  /**
   * Get title.
   * @return title
   **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  /**
   * Get fields.
   * @return fields
   **/
  @ApiModelProperty(value = "")
  public java.util.List<Field> getFields() {
    return fields;
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
    FieldSet fieldSet = (FieldSet) o;
    return Objects.equals(this.fieldSetId, fieldSet.fieldSetId) &&
        Objects.equals(this.title, fieldSet.title) &&
        Objects.equals(this.fields, fieldSet.fields);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(fieldSetId, title, fields);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldSet {\n");
    
    sb.append("    fieldSetId: ").append(toIndentedString(fieldSetId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

