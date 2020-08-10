package com.cyan.hotel.dto;

public class OptionDTO {
  private Long optionCost;
  private String optionName;

  public OptionDTO(Long optionCost, String optionName) {
    this.optionCost = optionCost;
    this.optionName = optionName;
  }

  public OptionDTO() {

  }

  public Long getOptionCost() {
    return optionCost;
  }

  public void setOptionCost(Long optionCost) {
    this.optionCost = optionCost;
  }

  public String getOptionName() {
    return optionName;
  }

  public void setOptionName(String optionName) {
    this.optionName = optionName;
  }
}
