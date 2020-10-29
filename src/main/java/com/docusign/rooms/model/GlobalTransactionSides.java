package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.TransactionSide;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GlobalTransactionSides
 */

public class GlobalTransactionSides {
  @JsonProperty("transactionSides")
  private java.util.List<TransactionSide> transactionSides = null;

  public GlobalTransactionSides transactionSides(java.util.List<TransactionSide> transactionSides) {
    this.transactionSides = transactionSides;
    return this;
  }

  public GlobalTransactionSides addTransactionSidesItem(TransactionSide transactionSidesItem) {
    if (this.transactionSides == null) {
      this.transactionSides = new java.util.ArrayList<TransactionSide>();
    }
    this.transactionSides.add(transactionSidesItem);
    return this;
  }

   /**
   * Get transactionSides
   * @return transactionSides
  **/
  @ApiModelProperty(value = "")
  public java.util.List<TransactionSide> getTransactionSides() {
    return transactionSides;
  }

  public void setTransactionSides(java.util.List<TransactionSide> transactionSides) {
    this.transactionSides = transactionSides;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalTransactionSides globalTransactionSides = (GlobalTransactionSides) o;
    return Objects.equals(this.transactionSides, globalTransactionSides.transactionSides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionSides);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalTransactionSides {\n");
    
    sb.append("    transactionSides: ").append(toIndentedString(transactionSides)).append("\n");
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

