/*
 * DB-LOCK-POC
 * 라라벨에 스웨거 적용 테스트를 위한 프로젝트
 *
 * OpenAPI spec version: 1
 * Contact: juwonkim@me.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package kr.appkr.swagger_poc_api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaginatorLink
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-21T16:13:04.142+09:00")
public class PaginatorLink {
  @SerializedName("previous")
  private String previous = null;

  @SerializedName("next")
  private String next = null;

  public PaginatorLink previous(String previous) {
    this.previous = previous;
    return this;
  }

   /**
   * 다음 페이지
   * @return previous
  **/
  @ApiModelProperty(example = "http://host/path?page=3", value = "다음 페이지")
  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }

  public PaginatorLink next(String next) {
    this.next = next;
    return this;
  }

   /**
   * 이전 페이지
   * @return next
  **/
  @ApiModelProperty(example = "http://host/path?page=1", value = "이전 페이지")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatorLink paginatorLink = (PaginatorLink) o;
    return Objects.equals(this.previous, paginatorLink.previous) &&
        Objects.equals(this.next, paginatorLink.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previous, next);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatorLink {\n");
    
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

