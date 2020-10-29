package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.Country;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GlobalCountries
 */

public class GlobalCountries {
  @JsonProperty("countries")
  private java.util.List<Country> countries = null;

  public GlobalCountries countries(java.util.List<Country> countries) {
    this.countries = countries;
    return this;
  }

  public GlobalCountries addCountriesItem(Country countriesItem) {
    if (this.countries == null) {
      this.countries = new java.util.ArrayList<Country>();
    }
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * Get countries
   * @return countries
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Country> getCountries() {
    return countries;
  }

  public void setCountries(java.util.List<Country> countries) {
    this.countries = countries;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(countries);
  }


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

