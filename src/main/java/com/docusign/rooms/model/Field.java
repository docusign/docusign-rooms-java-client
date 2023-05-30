package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.CustomData;
import com.docusign.rooms.model.Field;
import com.docusign.rooms.model.FieldConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Field.
 *
 */

public class Field {
  @JsonProperty("fieldId")
  private java.util.UUID fieldId = null;

  @JsonProperty("fieldDefinitionId")
  private java.util.UUID fieldDefinitionId = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("apiName")
  private String apiName = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("fields")
  private java.util.List<Field> fields = null;

  @JsonProperty("configuration")
  private FieldConfiguration _configuration = null;

  @JsonProperty("customData")
  private CustomData customData = null;

  /**
   * Get fieldId.
   * @return fieldId
   **/
  @Schema(description = "")
  public java.util.UUID getFieldId() {
    return fieldId;
  }

  /**
   * Get fieldDefinitionId.
   * @return fieldDefinitionId
   **/
  @Schema(description = "")
  public java.util.UUID getFieldDefinitionId() {
    return fieldDefinitionId;
  }

  /**
   * Get title.
   * @return title
   **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  /**
   * Get apiName.
   * @return apiName
   **/
  @Schema(description = "")
  public String getApiName() {
    return apiName;
  }

  /**
   * Get type.
   * @return type
   **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  /**
   * Get fields.
   * @return fields
   **/
  @Schema(description = "")
  public java.util.List<Field> getFields() {
    return fields;
  }


  /**
   * _configuration.
   *
   * @return Field
   **/
  public Field _configuration(FieldConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * Get _configuration.
   * @return _configuration
   **/
  @Schema(description = "")
  public FieldConfiguration getConfiguration() {
    return _configuration;
  }

  /**
   * setConfiguration.
   **/
  public void setConfiguration(FieldConfiguration _configuration) {
    this._configuration = _configuration;
  }


  /**
   * customData.
   *
   * @return Field
   **/
  public Field customData(CustomData customData) {
    this.customData = customData;
    return this;
  }

  /**
   * Get customData.
   * @return customData
   **/
  @Schema(description = "")
  public CustomData getCustomData() {
    return customData;
  }

  /**
   * setCustomData.
   **/
  public void setCustomData(CustomData customData) {
    this.customData = customData;
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
    Field field = (Field) o;
    return Objects.equals(this.fieldId, field.fieldId) &&
        Objects.equals(this.fieldDefinitionId, field.fieldDefinitionId) &&
        Objects.equals(this.title, field.title) &&
        Objects.equals(this.apiName, field.apiName) &&
        Objects.equals(this.type, field.type) &&
        Objects.equals(this.fields, field.fields) &&
        Objects.equals(this._configuration, field._configuration) &&
        Objects.equals(this.customData, field.customData);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(fieldId, fieldDefinitionId, title, apiName, type, fields, _configuration, customData);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Field {\n");
    
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    fieldDefinitionId: ").append(toIndentedString(fieldDefinitionId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    customData: ").append(toIndentedString(customData)).append("\n");
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

