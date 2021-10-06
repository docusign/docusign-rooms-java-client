package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SellerDecisionType.
 *
 */

public class SellerDecisionType {
  @JsonProperty("sellerDecisionTypeId")
  private String sellerDecisionTypeId = null;

  @JsonProperty("name")
  private String name = null;


  /**
   * sellerDecisionTypeId.
   *
   * @return SellerDecisionType
   **/
  public SellerDecisionType sellerDecisionTypeId(String sellerDecisionTypeId) {
    this.sellerDecisionTypeId = sellerDecisionTypeId;
    return this;
  }

  /**
   * Get sellerDecisionTypeId.
   * @return sellerDecisionTypeId
   **/
  @ApiModelProperty(value = "")
  public String getSellerDecisionTypeId() {
    return sellerDecisionTypeId;
  }

  /**
   * setSellerDecisionTypeId.
   **/
  public void setSellerDecisionTypeId(String sellerDecisionTypeId) {
    this.sellerDecisionTypeId = sellerDecisionTypeId;
  }


  /**
   * name.
   *
   * @return SellerDecisionType
   **/
  public SellerDecisionType name(String name) {
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
    SellerDecisionType sellerDecisionType = (SellerDecisionType) o;
    return Objects.equals(this.sellerDecisionTypeId, sellerDecisionType.sellerDecisionTypeId) &&
        Objects.equals(this.name, sellerDecisionType.name);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(sellerDecisionTypeId, name);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerDecisionType {\n");
    
    sb.append("    sellerDecisionTypeId: ").append(toIndentedString(sellerDecisionTypeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

