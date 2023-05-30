package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * State.
 *
 */

public class State {
  @JsonProperty("stateId")
  private String stateId = null;

  @JsonProperty("name")
  private String name = null;


  /**
   * stateId.
   *
   * @return State
   **/
  public State stateId(String stateId) {
    this.stateId = stateId;
    return this;
  }

  /**
   * Get stateId.
   * @return stateId
   **/
  @Schema(description = "")
  public String getStateId() {
    return stateId;
  }

  /**
   * setStateId.
   **/
  public void setStateId(String stateId) {
    this.stateId = stateId;
  }


  /**
   * name.
   *
   * @return State
   **/
  public State name(String name) {
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
    State state = (State) o;
    return Objects.equals(this.stateId, state.stateId) &&
        Objects.equals(this.name, state.name);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(stateId, name);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class State {\n");
    
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
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

