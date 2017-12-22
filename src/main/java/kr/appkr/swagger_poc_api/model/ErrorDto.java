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
 * ErrorDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-23T00:08:38.899+09:00")
public class ErrorDto {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("description")
  private String description = null;

  public ErrorDto code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * 에러 코드
   * @return code
  **/
  @ApiModelProperty(example = "400", required = true, value = "에러 코드")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ErrorDto message(String message) {
    this.message = message;
    return this;
  }

   /**
   * 에러 메시지
   * @return message
  **/
  @ApiModelProperty(example = "Bad Request", required = true, value = "에러 메시지")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 에러 디테일
   * @return description
  **/
  @ApiModelProperty(example = "필수값이 누락되었습니다", value = "에러 디테일")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDto errorDto = (ErrorDto) o;
    return Objects.equals(this.code, errorDto.code) &&
        Objects.equals(this.message, errorDto.message) &&
        Objects.equals(this.description, errorDto.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDto {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

