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
import kr.appkr.swagger_poc_api.model.Paginator;

/**
 * Meta
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-22T14:18:43.519+09:00")
public class Meta {
  @SerializedName("pagination")
  private Paginator pagination = null;

  public Meta pagination(Paginator pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(required = true, value = "")
  public Paginator getPagination() {
    return pagination;
  }

  public void setPagination(Paginator pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Meta meta = (Meta) o;
    return Objects.equals(this.pagination, meta.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Meta {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

