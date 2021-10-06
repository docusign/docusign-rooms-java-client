package com.docusign.rooms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RoomPicture.
 *
 */

public class RoomPicture {
  @JsonProperty("url")
  private String url = null;


  /**
   * url.
   *
   * @return RoomPicture
   **/
  public RoomPicture url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url.
   * @return url
   **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  /**
   * setUrl.
   **/
  public void setUrl(String url) {
    this.url = url;
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
    RoomPicture roomPicture = (RoomPicture) o;
    return Objects.equals(this.url, roomPicture.url);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(url);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomPicture {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

