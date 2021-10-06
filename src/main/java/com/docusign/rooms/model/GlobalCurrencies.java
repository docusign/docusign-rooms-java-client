package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.Currency;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GlobalCurrencies.
 *
 */

public class GlobalCurrencies {
  @JsonProperty("currencies")
  private java.util.List<Currency> currencies = null;


  /**
   * currencies.
   *
   * @return GlobalCurrencies
   **/
  public GlobalCurrencies currencies(java.util.List<Currency> currencies) {
    this.currencies = currencies;
    return this;
  }
  
  /**
   * addCurrenciesItem.
   *
   * @return GlobalCurrencies
   **/
  public GlobalCurrencies addCurrenciesItem(Currency currenciesItem) {
    if (this.currencies == null) {
      this.currencies = new java.util.ArrayList<Currency>();
    }
    this.currencies.add(currenciesItem);
    return this;
  }

  /**
   * Get currencies.
   * @return currencies
   **/
  @ApiModelProperty(value = "")
  public java.util.List<Currency> getCurrencies() {
    return currencies;
  }

  /**
   * setCurrencies.
   **/
  public void setCurrencies(java.util.List<Currency> currencies) {
    this.currencies = currencies;
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
    GlobalCurrencies globalCurrencies = (GlobalCurrencies) o;
    return Objects.equals(this.currencies, globalCurrencies.currencies);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(currencies);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalCurrencies {\n");
    
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
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

