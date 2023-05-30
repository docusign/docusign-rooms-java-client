package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Envelope.
 *
 */

public class Envelope {
  @JsonProperty("eSignEnvelopeId")
  private String eSignEnvelopeId = null;


  /**
   * eSignEnvelopeId.
   *
   * @return Envelope
   **/
  public Envelope eSignEnvelopeId(String eSignEnvelopeId) {
    this.eSignEnvelopeId = eSignEnvelopeId;
    return this;
  }

  /**
   * Get eSignEnvelopeId.
   * @return eSignEnvelopeId
   **/
  @Schema(description = "")
  public String getESignEnvelopeId() {
    return eSignEnvelopeId;
  }

  /**
   * setESignEnvelopeId.
   **/
  public void setESignEnvelopeId(String eSignEnvelopeId) {
    this.eSignEnvelopeId = eSignEnvelopeId;
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
    Envelope envelope = (Envelope) o;
    return Objects.equals(this.eSignEnvelopeId, envelope.eSignEnvelopeId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(eSignEnvelopeId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Envelope {\n");
    
    sb.append("    eSignEnvelopeId: ").append(toIndentedString(eSignEnvelopeId)).append("\n");
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

