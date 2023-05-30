package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.ESignAccountRoleSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ESignPermissionProfile.
 *
 */

public class ESignPermissionProfile {
  @JsonProperty("eSignPermissionProfileId")
  private String eSignPermissionProfileId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("settings")
  private ESignAccountRoleSettings settings = null;


  /**
   * eSignPermissionProfileId.
   *
   * @return ESignPermissionProfile
   **/
  public ESignPermissionProfile eSignPermissionProfileId(String eSignPermissionProfileId) {
    this.eSignPermissionProfileId = eSignPermissionProfileId;
    return this;
  }

  /**
   * Get eSignPermissionProfileId.
   * @return eSignPermissionProfileId
   **/
  @Schema(description = "")
  public String getESignPermissionProfileId() {
    return eSignPermissionProfileId;
  }

  /**
   * setESignPermissionProfileId.
   **/
  public void setESignPermissionProfileId(String eSignPermissionProfileId) {
    this.eSignPermissionProfileId = eSignPermissionProfileId;
  }


  /**
   * name.
   *
   * @return ESignPermissionProfile
   **/
  public ESignPermissionProfile name(String name) {
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
   * settings.
   *
   * @return ESignPermissionProfile
   **/
  public ESignPermissionProfile settings(ESignAccountRoleSettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Get settings.
   * @return settings
   **/
  @Schema(description = "")
  public ESignAccountRoleSettings getSettings() {
    return settings;
  }

  /**
   * setSettings.
   **/
  public void setSettings(ESignAccountRoleSettings settings) {
    this.settings = settings;
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
    ESignPermissionProfile esignPermissionProfile = (ESignPermissionProfile) o;
    return Objects.equals(this.eSignPermissionProfileId, esignPermissionProfile.eSignPermissionProfileId) &&
        Objects.equals(this.name, esignPermissionProfile.name) &&
        Objects.equals(this.settings, esignPermissionProfile.settings);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(eSignPermissionProfileId, name, settings);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ESignPermissionProfile {\n");
    
    sb.append("    eSignPermissionProfileId: ").append(toIndentedString(eSignPermissionProfileId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

