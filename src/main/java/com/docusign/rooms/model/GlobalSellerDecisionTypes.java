package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.SellerDecisionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GlobalSellerDecisionTypes.
 *
 */

public class GlobalSellerDecisionTypes {
  @JsonProperty("sellerDecisionTypes")
  private java.util.List<SellerDecisionType> sellerDecisionTypes = null;


  /**
   * sellerDecisionTypes.
   *
   * @return GlobalSellerDecisionTypes
   **/
  public GlobalSellerDecisionTypes sellerDecisionTypes(java.util.List<SellerDecisionType> sellerDecisionTypes) {
    this.sellerDecisionTypes = sellerDecisionTypes;
    return this;
  }
  
  /**
   * addSellerDecisionTypesItem.
   *
   * @return GlobalSellerDecisionTypes
   **/
  public GlobalSellerDecisionTypes addSellerDecisionTypesItem(SellerDecisionType sellerDecisionTypesItem) {
    if (this.sellerDecisionTypes == null) {
      this.sellerDecisionTypes = new java.util.ArrayList<SellerDecisionType>();
    }
    this.sellerDecisionTypes.add(sellerDecisionTypesItem);
    return this;
  }

  /**
   * Get sellerDecisionTypes.
   * @return sellerDecisionTypes
   **/
  @ApiModelProperty(value = "")
  public java.util.List<SellerDecisionType> getSellerDecisionTypes() {
    return sellerDecisionTypes;
  }

  /**
   * setSellerDecisionTypes.
   **/
  public void setSellerDecisionTypes(java.util.List<SellerDecisionType> sellerDecisionTypes) {
    this.sellerDecisionTypes = sellerDecisionTypes;
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
    GlobalSellerDecisionTypes globalSellerDecisionTypes = (GlobalSellerDecisionTypes) o;
    return Objects.equals(this.sellerDecisionTypes, globalSellerDecisionTypes.sellerDecisionTypes);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(sellerDecisionTypes);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalSellerDecisionTypes {\n");
    
    sb.append("    sellerDecisionTypes: ").append(toIndentedString(sellerDecisionTypes)).append("\n");
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

