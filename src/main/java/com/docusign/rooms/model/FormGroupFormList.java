package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.FormGroupForm;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * FormGroupFormList.
 *
 */

public class FormGroupFormList {
  @JsonProperty("forms")
  private java.util.List<FormGroupForm> forms = null;

  @JsonProperty("resultSetSize")
  private Integer resultSetSize = null;

  @JsonProperty("startPosition")
  private Integer startPosition = null;

  @JsonProperty("endPosition")
  private Integer endPosition = null;

  @JsonProperty("nextUri")
  private String nextUri = null;

  @JsonProperty("priorUri")
  private String priorUri = null;

  @JsonProperty("totalRowCount")
  private Integer totalRowCount = null;


  /**
   * forms.
   *
   * @return FormGroupFormList
   **/
  public FormGroupFormList forms(java.util.List<FormGroupForm> forms) {
    this.forms = forms;
    return this;
  }
  
  /**
   * addFormsItem.
   *
   * @return FormGroupFormList
   **/
  public FormGroupFormList addFormsItem(FormGroupForm formsItem) {
    if (this.forms == null) {
      this.forms = new java.util.ArrayList<>();
    }
    this.forms.add(formsItem);
    return this;
  }

  /**
   * Get forms.
   * @return forms
   **/
  @Schema(description = "")
  public java.util.List<FormGroupForm> getForms() {
    return forms;
  }

  /**
   * setForms.
   **/
  public void setForms(java.util.List<FormGroupForm> forms) {
    this.forms = forms;
  }


  /**
   * resultSetSize.
   *
   * @return FormGroupFormList
   **/
  public FormGroupFormList resultSetSize(Integer resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

  /**
   * Get resultSetSize.
   * @return resultSetSize
   **/
  @Schema(description = "")
  public Integer getResultSetSize() {
    return resultSetSize;
  }

  /**
   * setResultSetSize.
   **/
  public void setResultSetSize(Integer resultSetSize) {
    this.resultSetSize = resultSetSize;
  }


  /**
   * startPosition.
   *
   * @return FormGroupFormList
   **/
  public FormGroupFormList startPosition(Integer startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Get startPosition.
   * @return startPosition
   **/
  @Schema(description = "")
  public Integer getStartPosition() {
    return startPosition;
  }

  /**
   * setStartPosition.
   **/
  public void setStartPosition(Integer startPosition) {
    this.startPosition = startPosition;
  }

  /**
   * Get endPosition.
   * @return endPosition
   **/
  @Schema(description = "")
  public Integer getEndPosition() {
    return endPosition;
  }


  /**
   * nextUri.
   *
   * @return FormGroupFormList
   **/
  public FormGroupFormList nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }

  /**
   * Get nextUri.
   * @return nextUri
   **/
  @Schema(description = "")
  public String getNextUri() {
    return nextUri;
  }

  /**
   * setNextUri.
   **/
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }


  /**
   * priorUri.
   *
   * @return FormGroupFormList
   **/
  public FormGroupFormList priorUri(String priorUri) {
    this.priorUri = priorUri;
    return this;
  }

  /**
   * Get priorUri.
   * @return priorUri
   **/
  @Schema(description = "")
  public String getPriorUri() {
    return priorUri;
  }

  /**
   * setPriorUri.
   **/
  public void setPriorUri(String priorUri) {
    this.priorUri = priorUri;
  }


  /**
   * totalRowCount.
   *
   * @return FormGroupFormList
   **/
  public FormGroupFormList totalRowCount(Integer totalRowCount) {
    this.totalRowCount = totalRowCount;
    return this;
  }

  /**
   * Get totalRowCount.
   * @return totalRowCount
   **/
  @Schema(description = "")
  public Integer getTotalRowCount() {
    return totalRowCount;
  }

  /**
   * setTotalRowCount.
   **/
  public void setTotalRowCount(Integer totalRowCount) {
    this.totalRowCount = totalRowCount;
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
    FormGroupFormList formGroupFormList = (FormGroupFormList) o;
    return Objects.equals(this.forms, formGroupFormList.forms) &&
        Objects.equals(this.resultSetSize, formGroupFormList.resultSetSize) &&
        Objects.equals(this.startPosition, formGroupFormList.startPosition) &&
        Objects.equals(this.endPosition, formGroupFormList.endPosition) &&
        Objects.equals(this.nextUri, formGroupFormList.nextUri) &&
        Objects.equals(this.priorUri, formGroupFormList.priorUri) &&
        Objects.equals(this.totalRowCount, formGroupFormList.totalRowCount);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(forms, resultSetSize, startPosition, endPosition, nextUri, priorUri, totalRowCount);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormGroupFormList {\n");
    
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    priorUri: ").append(toIndentedString(priorUri)).append("\n");
    sb.append("    totalRowCount: ").append(toIndentedString(totalRowCount)).append("\n");
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

