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
import kr.appkr.swagger_poc_api.model.LoginRequest;

/**
 * NewUserRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-23T00:35:43.003+09:00")
public class NewUserRequest {
  @SerializedName("email")
  private String email = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("name")
  private String name = null;

  public NewUserRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 사용자 이메일
   * @return email
  **/
  @ApiModelProperty(example = "user@example.com", required = true, value = "사용자 이메일")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public NewUserRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * 사용자 비밀번호 (6 글자 이상)
   * @return password
  **/
  @ApiModelProperty(example = "secret", required = true, value = "사용자 비밀번호 (6 글자 이상)")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public NewUserRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 사용자 이름
   * @return name
  **/
  @ApiModelProperty(example = "User", value = "사용자 이름")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewUserRequest newUserRequest = (NewUserRequest) o;
    return Objects.equals(this.email, newUserRequest.email) &&
        Objects.equals(this.password, newUserRequest.password) &&
        Objects.equals(this.name, newUserRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, password, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUserRequest {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

