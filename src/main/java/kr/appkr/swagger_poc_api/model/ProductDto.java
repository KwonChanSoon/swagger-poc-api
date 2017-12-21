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
import kr.appkr.swagger_poc_api.model.NewProductRequest;
import org.threeten.bp.OffsetDateTime;

/**
 * ProductDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-21T18:16:07.108+09:00")
public class ProductDto {
  @SerializedName("title")
  private String title = null;

  @SerializedName("stock")
  private Integer stock = null;

  @SerializedName("price")
  private Long price = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public ProductDto title(String title) {
    this.title = title;
    return this;
  }

   /**
   * 상품명
   * @return title
  **/
  @ApiModelProperty(example = "[특가] 반짝반짝 빛나는 에폭시 스티커", required = true, value = "상품명")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ProductDto stock(Integer stock) {
    this.stock = stock;
    return this;
  }

   /**
   * 재고수량
   * @return stock
  **/
  @ApiModelProperty(example = "100", required = true, value = "재고수량")
  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }

  public ProductDto price(Long price) {
    this.price = price;
    return this;
  }

   /**
   * 가격
   * @return price
  **/
  @ApiModelProperty(example = "1600", required = true, value = "가격")
  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public ProductDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 상품 설명
   * @return description
  **/
  @ApiModelProperty(example = "라이언 캐릭터를 주제로 한 투명 에폭시 스티커..", required = true, value = "상품 설명")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductDto createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * 최초 생성 시각
   * @return createdAt
  **/
  @ApiModelProperty(example = "2017-03-01T00:00:00+0900", value = "최초 생성 시각")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ProductDto updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * 최종 수정 시각
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2017-03-01T00:00:00+0900", value = "최종 수정 시각")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDto productDto = (ProductDto) o;
    return Objects.equals(this.title, productDto.title) &&
        Objects.equals(this.stock, productDto.stock) &&
        Objects.equals(this.price, productDto.price) &&
        Objects.equals(this.description, productDto.description) &&
        Objects.equals(this.createdAt, productDto.createdAt) &&
        Objects.equals(this.updatedAt, productDto.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, stock, price, description, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDto {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

