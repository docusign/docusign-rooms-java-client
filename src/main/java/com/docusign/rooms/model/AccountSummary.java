package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AccountSummary.
 *
 */

public class AccountSummary {
  @JsonProperty("companyId")
  private Integer companyId = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets companyVersion
   */
  public enum CompanyVersionEnum {
    V5("v5"),
    
    V6("v6");

    private String value;

    CompanyVersionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CompanyVersionEnum fromValue(String value) {
      for (CompanyVersionEnum b : CompanyVersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("companyVersion")
  private CompanyVersionEnum companyVersion = null;

  @JsonProperty("docuSignAccountGuid")
  private String docuSignAccountGuid = null;

  @JsonProperty("defaultFieldSetId")
  private java.util.UUID defaultFieldSetId = null;

  @JsonProperty("requireOfficeLibraryAssignments")
  private Boolean requireOfficeLibraryAssignments = null;

  /**
   * Get companyId.
   * @return companyId
   **/
  @Schema(description = "")
  public Integer getCompanyId() {
    return companyId;
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
   * companyVersion.
   *
   * @return AccountSummary
   **/
  public AccountSummary companyVersion(CompanyVersionEnum companyVersion) {
    this.companyVersion = companyVersion;
    return this;
  }

  /**
   * Get companyVersion.
   * @return companyVersion
   **/
  @Schema(description = "")
  public CompanyVersionEnum getCompanyVersion() {
    return companyVersion;
  }

  /**
   * setCompanyVersion.
   **/
  public void setCompanyVersion(CompanyVersionEnum companyVersion) {
    this.companyVersion = companyVersion;
  }

  /**
   * Get docuSignAccountGuid.
   * @return docuSignAccountGuid
   **/
  @Schema(description = "")
  public String getDocuSignAccountGuid() {
    return docuSignAccountGuid;
  }

  /**
   * Get defaultFieldSetId.
   * @return defaultFieldSetId
   **/
  @Schema(description = "")
  public java.util.UUID getDefaultFieldSetId() {
    return defaultFieldSetId;
  }

  /**
   * Get requireOfficeLibraryAssignments.
   * @return requireOfficeLibraryAssignments
   **/
  @Schema(description = "")
  public Boolean isRequireOfficeLibraryAssignments() {
    return requireOfficeLibraryAssignments;
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
    AccountSummary accountSummary = (AccountSummary) o;
    return Objects.equals(this.companyId, accountSummary.companyId) &&
        Objects.equals(this.name, accountSummary.name) &&
        Objects.equals(this.companyVersion, accountSummary.companyVersion) &&
        Objects.equals(this.docuSignAccountGuid, accountSummary.docuSignAccountGuid) &&
        Objects.equals(this.defaultFieldSetId, accountSummary.defaultFieldSetId) &&
        Objects.equals(this.requireOfficeLibraryAssignments, accountSummary.requireOfficeLibraryAssignments);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(companyId, name, companyVersion, docuSignAccountGuid, defaultFieldSetId, requireOfficeLibraryAssignments);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSummary {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    companyVersion: ").append(toIndentedString(companyVersion)).append("\n");
    sb.append("    docuSignAccountGuid: ").append(toIndentedString(docuSignAccountGuid)).append("\n");
    sb.append("    defaultFieldSetId: ").append(toIndentedString(defaultFieldSetId)).append("\n");
    sb.append("    requireOfficeLibraryAssignments: ").append(toIndentedString(requireOfficeLibraryAssignments)).append("\n");
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

