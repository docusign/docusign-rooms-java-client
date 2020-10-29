package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TransactionSide
 */

public class TransactionSide {
  @JsonProperty("transactionSideId")
  private String transactionSideId = null;

  @JsonProperty("name")
  private String name = null;

  public TransactionSide transactionSideId(String transactionSideId) {
    this.transactionSideId = transactionSideId;
    return this;
  }

   /**
   * Get transactionSideId
   * @return transactionSideId
  **/
  @ApiModelProperty(value = "")
  public String getTransactionSideId() {
    return transactionSideId;
  }

  public void setTransactionSideId(String transactionSideId) {
    this.transactionSideId = transactionSideId;
  }

  public TransactionSide name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionSide transactionSide = (TransactionSide) o;
    return Objects.equals(this.transactionSideId, transactionSide.transactionSideId) &&
        Objects.equals(this.name, transactionSide.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionSideId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionSide {\n");
    
    sb.append("    transactionSideId: ").append(toIndentedString(transactionSideId)).append("\n");
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

