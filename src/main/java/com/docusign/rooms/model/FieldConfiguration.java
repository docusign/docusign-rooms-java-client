package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.DependsOn;
import com.docusign.rooms.model.SelectListFieldOption;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * FieldConfiguration.
 *
 */

public class FieldConfiguration {
  @JsonProperty("maxValue")
  private Double maxValue = null;

  @JsonProperty("minValue")
  private Double minValue = null;

  @JsonProperty("multipleOf")
  private Double multipleOf = null;

  @JsonProperty("maxLength")
  private Integer maxLength = null;

  @JsonProperty("minLength")
  private Integer minLength = null;

  @JsonProperty("pattern")
  private String pattern = null;

  @JsonProperty("isPublisher")
  private Boolean isPublisher = null;

  @JsonProperty("dependsOn")
  private java.util.List<DependsOn> dependsOn = null;

  @JsonProperty("options")
  private java.util.List<SelectListFieldOption> options = null;

  /**
   * Get maxValue.
   * @return maxValue
   **/
  @Schema(description = "")
  public Double getMaxValue() {
    return maxValue;
  }

  /**
   * Get minValue.
   * @return minValue
   **/
  @Schema(description = "")
  public Double getMinValue() {
    return minValue;
  }

  /**
   * Get multipleOf.
   * @return multipleOf
   **/
  @Schema(description = "")
  public Double getMultipleOf() {
    return multipleOf;
  }

  /**
   * Get maxLength.
   * @return maxLength
   **/
  @Schema(description = "")
  public Integer getMaxLength() {
    return maxLength;
  }

  /**
   * Get minLength.
   * @return minLength
   **/
  @Schema(description = "")
  public Integer getMinLength() {
    return minLength;
  }

  /**
   * Get pattern.
   * @return pattern
   **/
  @Schema(description = "")
  public String getPattern() {
    return pattern;
  }

  /**
   * Get isPublisher.
   * @return isPublisher
   **/
  @Schema(description = "")
  public Boolean isIsPublisher() {
    return isPublisher;
  }

  /**
   * Get dependsOn.
   * @return dependsOn
   **/
  @Schema(description = "")
  public java.util.List<DependsOn> getDependsOn() {
    return dependsOn;
  }

  /**
   * Get options.
   * @return options
   **/
  @Schema(description = "")
  public java.util.List<SelectListFieldOption> getOptions() {
    return options;
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
    FieldConfiguration fieldConfiguration = (FieldConfiguration) o;
    return Objects.equals(this.maxValue, fieldConfiguration.maxValue) &&
        Objects.equals(this.minValue, fieldConfiguration.minValue) &&
        Objects.equals(this.multipleOf, fieldConfiguration.multipleOf) &&
        Objects.equals(this.maxLength, fieldConfiguration.maxLength) &&
        Objects.equals(this.minLength, fieldConfiguration.minLength) &&
        Objects.equals(this.pattern, fieldConfiguration.pattern) &&
        Objects.equals(this.isPublisher, fieldConfiguration.isPublisher) &&
        Objects.equals(this.dependsOn, fieldConfiguration.dependsOn) &&
        Objects.equals(this.options, fieldConfiguration.options);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(maxValue, minValue, multipleOf, maxLength, minLength, pattern, isPublisher, dependsOn, options);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldConfiguration {\n");
    
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
    sb.append("    multipleOf: ").append(toIndentedString(multipleOf)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    isPublisher: ").append(toIndentedString(isPublisher)).append("\n");
    sb.append("    dependsOn: ").append(toIndentedString(dependsOn)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

