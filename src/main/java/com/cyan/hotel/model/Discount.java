package com.cyan.hotel.model;

import javax.persistence.*;

@Entity
@Table(name = "discount")
public class Discount {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "discountId")
  private Long discountId;

  @Column(name = "discountPercentage")
  private Double discountPercentage;

  public Discount() {

  }

  public Long getDiscountId() {
	return discountId;
  }

  public void setDiscountId(Long discountId) {
	this.discountId = discountId;
  }

  public Double getDiscountPercentage() {
	return discountPercentage;
  }

  public void setDiscountPercentage(Double discountPercentage) {
	this.discountPercentage = discountPercentage;
  }
}
