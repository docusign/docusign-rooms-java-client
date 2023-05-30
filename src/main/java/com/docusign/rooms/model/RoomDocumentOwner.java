package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RoomDocumentOwner.
 *
 */

public class RoomDocumentOwner {
  @JsonProperty("userId")
  private Integer userId = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("imageSrc")
  private String imageSrc = null;


  /**
   * userId.
   *
   * @return RoomDocumentOwner
   **/
  public RoomDocumentOwner userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId.
   * @return userId
   **/
  @Schema(description = "")
  public Integer getUserId() {
    return userId;
  }

  /**
   * setUserId.
   **/
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  /**
   * firstName.
   *
   * @return RoomDocumentOwner
   **/
  public RoomDocumentOwner firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName.
   * @return firstName
   **/
  @Schema(description = "")
  public String getFirstName() {
    return firstName;
  }

  /**
   * setFirstName.
   **/
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   * lastName.
   *
   * @return RoomDocumentOwner
   **/
  public RoomDocumentOwner lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName.
   * @return lastName
   **/
  @Schema(description = "")
  public String getLastName() {
    return lastName;
  }

  /**
   * setLastName.
   **/
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   * companyName.
   *
   * @return RoomDocumentOwner
   **/
  public RoomDocumentOwner companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName.
   * @return companyName
   **/
  @Schema(description = "")
  public String getCompanyName() {
    return companyName;
  }

  /**
   * setCompanyName.
   **/
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  /**
   * imageSrc.
   *
   * @return RoomDocumentOwner
   **/
  public RoomDocumentOwner imageSrc(String imageSrc) {
    this.imageSrc = imageSrc;
    return this;
  }

  /**
   * Get imageSrc.
   * @return imageSrc
   **/
  @Schema(description = "")
  public String getImageSrc() {
    return imageSrc;
  }

  /**
   * setImageSrc.
   **/
  public void setImageSrc(String imageSrc) {
    this.imageSrc = imageSrc;
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
    RoomDocumentOwner roomDocumentOwner = (RoomDocumentOwner) o;
    return Objects.equals(this.userId, roomDocumentOwner.userId) &&
        Objects.equals(this.firstName, roomDocumentOwner.firstName) &&
        Objects.equals(this.lastName, roomDocumentOwner.lastName) &&
        Objects.equals(this.companyName, roomDocumentOwner.companyName) &&
        Objects.equals(this.imageSrc, roomDocumentOwner.imageSrc);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(userId, firstName, lastName, companyName, imageSrc);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomDocumentOwner {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    imageSrc: ").append(toIndentedString(imageSrc)).append("\n");
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

