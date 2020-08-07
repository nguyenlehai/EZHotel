package com.cyan.hotel.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Option {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String optionName;

  private Long optionCost;

  @OneToMany(mappedBy = "option")
  Set<BookingOption> bookingOptions;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getOptionName() {
    return optionName;
  }

  public void setOptionName(String optionName) {
    this.optionName = optionName;
  }

  public Long getOptionCost() {
    return optionCost;
  }

  public void setOptionCost(Long optionCost) {
    this.optionCost = optionCost;
  }

  public Set<BookingOption> getBookingOptions() {
    return bookingOptions;
  }

  public void setBookingOptions(Set<BookingOption> bookingOptions) {
    this.bookingOptions = bookingOptions;
  }
}
