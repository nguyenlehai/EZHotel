package com.cyan.hotel.requestForm;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ReservationForm {
  @NotEmpty(message = "Start date is required !")
  private String startDate;

  @NotNull(message = "End date is required !")
  private String endDate;

  public ReservationForm() {

  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }
}
