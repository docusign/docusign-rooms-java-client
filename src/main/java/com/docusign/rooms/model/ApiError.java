package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ApiError.
 *
 */

public class ApiError {
  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("referenceId")
  private String referenceId = null;


  /**
   * errorCode.
   *
   * @return ApiError
   **/
  public ApiError errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode.
   * @return errorCode
   **/
  @ApiModelProperty(value = "")
  public String getErrorCode() {
    return errorCode;
  }

  /**
   * setErrorCode.
   **/
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  /**
   * message.
   *
   * @return ApiError
   **/
  public ApiError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message.
   * @return message
   **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  /**
   * setMessage.
   **/
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * referenceId.
   *
   * @return ApiError
   **/
  public ApiError referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Get referenceId.
   * @return referenceId
   **/
  @ApiModelProperty(value = "")
  public String getReferenceId() {
    return referenceId;
  }

  /**
   * setReferenceId.
   **/
  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
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
    ApiError apiError = (ApiError) o;
    return Objects.equals(this.errorCode, apiError.errorCode) &&
        Objects.equals(this.message, apiError.message) &&
        Objects.equals(this.referenceId, apiError.referenceId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message, referenceId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiError {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
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

