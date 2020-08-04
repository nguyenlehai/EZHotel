package com.cyan.hotel.dto;

public class OptionDTO {
  private Float optionCost;
  private String optionName;

  public OptionDTO(Float optionCost, String optionName) {
    this.optionCost = optionCost;
    this.optionName = optionName;
  }

  public OptionDTO() {

  }

  public Float getOptionCost() {
    return optionCost;
  }

  public void setOptionCost(Float optionCost) {
    this.optionCost = optionCost;
  }

  public String getOptionName() {
    return optionName;
  }

  public void setOptionName(String optionName) {
    this.optionName = optionName;
  }
}
