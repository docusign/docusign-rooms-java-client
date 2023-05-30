package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * EnvelopeForCreate.
 *
 */

public class EnvelopeForCreate {
  @JsonProperty("envelopeName")
  private String envelopeName = null;

  @JsonProperty("documentIds")
  private java.util.List<Integer> documentIds = null;


  /**
   * envelopeName.
   *
   * @return EnvelopeForCreate
   **/
  public EnvelopeForCreate envelopeName(String envelopeName) {
    this.envelopeName = envelopeName;
    return this;
  }

  /**
   * Get envelopeName.
   * @return envelopeName
   **/
  @Schema(description = "")
  public String getEnvelopeName() {
    return envelopeName;
  }

  /**
   * setEnvelopeName.
   **/
  public void setEnvelopeName(String envelopeName) {
    this.envelopeName = envelopeName;
  }


  /**
   * documentIds.
   *
   * @return EnvelopeForCreate
   **/
  public EnvelopeForCreate documentIds(java.util.List<Integer> documentIds) {
    this.documentIds = documentIds;
    return this;
  }
  
  /**
   * addDocumentIdsItem.
   *
   * @return EnvelopeForCreate
   **/
  public EnvelopeForCreate addDocumentIdsItem(Integer documentIdsItem) {
    if (this.documentIds == null) {
      this.documentIds = new java.util.ArrayList<>();
    }
    this.documentIds.add(documentIdsItem);
    return this;
  }

  /**
   * Get documentIds.
   * @return documentIds
   **/
  @Schema(description = "")
  public java.util.List<Integer> getDocumentIds() {
    return documentIds;
  }

  /**
   * setDocumentIds.
   **/
  public void setDocumentIds(java.util.List<Integer> documentIds) {
    this.documentIds = documentIds;
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
    EnvelopeForCreate envelopeForCreate = (EnvelopeForCreate) o;
    return Objects.equals(this.envelopeName, envelopeForCreate.envelopeName) &&
        Objects.equals(this.documentIds, envelopeForCreate.documentIds);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(envelopeName, documentIds);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeForCreate {\n");
    
    sb.append("    envelopeName: ").append(toIndentedString(envelopeName)).append("\n");
    sb.append("    documentIds: ").append(toIndentedString(documentIds)).append("\n");
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

