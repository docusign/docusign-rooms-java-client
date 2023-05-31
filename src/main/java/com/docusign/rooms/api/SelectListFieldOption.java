package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * SelectListFieldOption.
 *
 */

public class SelectListFieldOption {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("order")
  private Integer order = null;

  /**
   * Get id.
   * @return id
   **/
  @Schema(example="null", description="")
  public String getId() {
    return id;
  }

  /**
   * Get title.
   * @return title
   **/
  @Schema(example="null", description="")
  public String getTitle() {
    return title;
  }

  /**
   * Get order.
   * @return order
   **/
  @Schema(example="null", description="")
  public Integer getOrder() {
    return order;
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
    SelectListFieldOption selectListFieldOption = (SelectListFieldOption) o;
    return Objects.equals(this.id, selectListFieldOption.id) &&
        Objects.equals(this.title, selectListFieldOption.title) &&
        Objects.equals(this.order, selectListFieldOption.order);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, title, order);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectListFieldOption {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

