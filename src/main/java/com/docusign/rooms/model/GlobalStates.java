package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.rooms.model.State;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GlobalStates
 */

public class GlobalStates {
  @JsonProperty("states")
  private java.util.List<State> states = null;

  public GlobalStates states(java.util.List<State> states) {
    this.states = states;
    return this;
  }

  public GlobalStates addStatesItem(State statesItem) {
    if (this.states == null) {
      this.states = new java.util.ArrayList<State>();
    }
    this.states.add(statesItem);
    return this;
  }

   /**
   * Get states
   * @return states
  **/
  @ApiModelProperty(value = "")
  public java.util.List<State> getStates() {
    return states;
  }

  public void setStates(java.util.List<State> states) {
    this.states = states;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalStates globalStates = (GlobalStates) o;
    return Objects.equals(this.states, globalStates.states);
  }

  @Override
  public int hashCode() {
    return Objects.hash(states);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalStates {\n");
    
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
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

