package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.Country;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * GlobalCountries.
 *
 */

public class GlobalCountries {
  @JsonProperty("countries")
  private java.util.List<Country> countries = null;


  /**
   * countries.
   *
   * @return GlobalCountries
   **/
  public GlobalCountries countries(java.util.List<Country> countries) {
    this.countries = countries;
    return this;
  }
  
  /**
   * addCountriesItem.
   *
   * @return GlobalCountries
   **/
  public GlobalCountries addCountriesItem(Country countriesItem) {
    if (this.countries == null) {
      this.countries = new java.util.ArrayList<>();
    }
    this.countries.add(countriesItem);
    return this;
  }

  /**
   * Get countries.
   * @return countries
   **/
  @Schema(description = "")
  public java.util.List<Country> getCountries() {
    return countries;
  }

  /**
   * setCountries.
   **/
  public void setCountries(java.util.List<Country> countries) {
    this.countries = countries;
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
    GlobalCountries globalCountries = (GlobalCountries) o;
    return Objects.equals(this.countries, globalCountries.countries);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(countries);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalCountries {\n");
    
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
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

