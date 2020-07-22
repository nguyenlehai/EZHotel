package com.cyan.hotel.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "service")
public class Service {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "service_name")
  private String service_name;

  @Column(name = "service_cost")
  private Float service_cost;

  @OneToMany(mappedBy = "service")
  Set<BookingService> bookingServices;

  public Long getId() {
	return id;
  }

  public void setId(Long id) {
	this.id = id;
  }

  public String getService_name() {
	return service_name;
  }

  public void setService_name(String service_name) {
	this.service_name = service_name;
  }

  public Float getService_cost() {
	return service_cost;
  }

  public void setService_cost(Float service_cost) {
	this.service_cost = service_cost;
  }
}