package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Currency.
 *
 */

public class Currency {
  @JsonProperty("currencyId")
  private String currencyId = null;

  @JsonProperty("name")
  private String name = null;


  /**
   * currencyId.
   *
   * @return Currency
   **/
  public Currency currencyId(String currencyId) {
    this.currencyId = currencyId;
    return this;
  }

  /**
   * Get currencyId.
   * @return currencyId
   **/
  @Schema(description = "")
  public String getCurrencyId() {
    return currencyId;
  }

  /**
   * setCurrencyId.
   **/
  public void setCurrencyId(String currencyId) {
    this.currencyId = currencyId;
  }


  /**
   * name.
   *
   * @return Currency
   **/
  public Currency name(String name) {
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
    Currency currency = (Currency) o;
    return Objects.equals(this.currencyId, currency.currencyId) &&
        Objects.equals(this.name, currency.name);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(currencyId, name);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Currency {\n");
    
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
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

