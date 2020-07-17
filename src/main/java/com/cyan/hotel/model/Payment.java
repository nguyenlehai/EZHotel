package com.cyan.hotel.model;

import com.cyan.hotel.enumeration.PayType;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "paymentId")
  private Long paymentId;

  @Column(name = "paymentDate")
  private String paymentDate;

  @Enumerated(value = EnumType.STRING)
  private PayType payType;

  @Column(name = "paymentAmount")
  private Double paymentAmount;

  @ManyToOne
  @JoinColumn(name = "userId")
  private User user;

  public Payment() {

  }

  public Long getPaymentId() {
	return paymentId;
  }

  public void setPaymentId(Long paymentId) {
	this.paymentId = paymentId;
  }

  public PayType getPayType() {
	return payType;
  }

  public void setPayType(PayType payType) {
	this.payType = payType;
  }

  public Double getPaymentAmount() {
	return paymentAmount;
  }

  public void setPaymentAmount(Double paymentAmount) {
	this.paymentAmount = paymentAmount;
  }

  public User getUser() {
	return user;
  }

  public void setUser(User user) {
	this.user = user;
  }

  public String getPaymentDate() {
	return paymentDate;
  }

  public void setPaymentDate(String paymentDate) {
	this.paymentDate = paymentDate;
  }
}
