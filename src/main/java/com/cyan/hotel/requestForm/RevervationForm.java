package com.cyan.hotel.requestForm;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class RevervationForm {
  @NotEmpty(message = "Start date is required !")
  private String start_date;

  @NotNull(message = "End date is required !")
  private String end_date;

  public RevervationForm() {

  }

  public String getStart_date() {
	return start_date;
  }

  public void setStart_date(String start_date) {
	this.start_date = start_date;
  }

  public String getEnd_date() {
	return end_date;
  }

  public void setEnd_date(String end_date) {
	this.end_date = end_date;
  }
}
