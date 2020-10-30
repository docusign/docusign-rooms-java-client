package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountSummary
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
    public static CompanyVersionEnum fromValue(String text) {
      for (CompanyVersionEnum b : CompanyVersionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
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
   * Get companyId
   * @return companyId
  **/
  @ApiModelProperty(value = "")
  public Integer getCompanyId() {
    return companyId;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

   /**
   * Get companyVersion
   * @return companyVersion
  **/
  @ApiModelProperty(value = "")
  public CompanyVersionEnum getCompanyVersion() {
    return companyVersion;
  }

   /**
   * Get docuSignAccountGuid
   * @return docuSignAccountGuid
  **/
  @ApiModelProperty(value = "")
  public String getDocuSignAccountGuid() {
    return docuSignAccountGuid;
  }

   /**
   * Get defaultFieldSetId
   * @return defaultFieldSetId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getDefaultFieldSetId() {
    return defaultFieldSetId;
  }

   /**
   * Get requireOfficeLibraryAssignments
   * @return requireOfficeLibraryAssignments
  **/
  @ApiModelProperty(value = "")
  public Boolean isRequireOfficeLibraryAssignments() {
    return requireOfficeLibraryAssignments;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(companyId, name, companyVersion, docuSignAccountGuid, defaultFieldSetId, requireOfficeLibraryAssignments);
  }


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

