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
 * NewReviewRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-23T00:35:43.003+09:00")
public class NewReviewRequest {
  @SerializedName("title")
  private String title = null;

  @SerializedName("content")
  private String content = null;

  public NewReviewRequest title(String title) {
    this.title = title;
    return this;
  }

   /**
   * 제목
   * @return title
  **/
  @ApiModelProperty(example = "접착력이 약해요", required = true, value = "제목")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public NewReviewRequest content(String content) {
    this.content = content;
    return this;
  }

   /**
   * 본문
   * @return content
  **/
  @ApiModelProperty(example = "한 번 붙였다가 다시 붙이려고 하면, 접착이 안되요~", required = true, value = "본문")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewReviewRequest newReviewRequest = (NewReviewRequest) o;
    return Objects.equals(this.title, newReviewRequest.title) &&
        Objects.equals(this.content, newReviewRequest.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewReviewRequest {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

