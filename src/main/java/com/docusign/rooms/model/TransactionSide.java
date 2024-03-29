package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * TransactionSide.
 *
 */

public class TransactionSide {
  @JsonProperty("transactionSideId")
  private String transactionSideId = null;

  @JsonProperty("name")
  private String name = null;


  /**
   * transactionSideId.
   *
   * @return TransactionSide
   **/
  public TransactionSide transactionSideId(String transactionSideId) {
    this.transactionSideId = transactionSideId;
    return this;
  }

  /**
   * Get transactionSideId.
   * @return transactionSideId
   **/
  @Schema(description = "")
  public String getTransactionSideId() {
    return transactionSideId;
  }

  /**
   * setTransactionSideId.
   **/
  public void setTransactionSideId(String transactionSideId) {
    this.transactionSideId = transactionSideId;
  }


  /**
   * name.
   *
   * @return TransactionSide
   **/
  public TransactionSide name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   * @return name
   **/
  @Schema(description = "")
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
    TransactionSide transactionSide = (TransactionSide) o;
    return Objects.equals(this.transactionSideId, transactionSide.transactionSideId) &&
        Objects.equals(this.name, transactionSide.name);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(transactionSideId, name);
  }


  /**
   * Converts the given object to string.
   */
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

