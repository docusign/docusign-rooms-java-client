package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Country.
 *
 */

public class Country {
  @JsonProperty("countryId")
  private String countryId = null;

  @JsonProperty("name")
  private String name = null;


  /**
   * countryId.
   *
   * @return Country
   **/
  public Country countryId(String countryId) {
    this.countryId = countryId;
    return this;
  }

  /**
   * Get countryId.
   * @return countryId
   **/
  @Schema(description = "")
  public String getCountryId() {
    return countryId;
  }

  /**
   * setCountryId.
   **/
  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }


  /**
   * name.
   *
   * @return Country
   **/
  public Country name(String name) {
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
    Country country = (Country) o;
    return Objects.equals(this.countryId, country.countryId) &&
        Objects.equals(this.name, country.name);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(countryId, name);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
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

