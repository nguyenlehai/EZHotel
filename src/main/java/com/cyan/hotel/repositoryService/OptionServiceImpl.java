package com.cyan.hotel.repositoryService;

import com.cyan.hotel.model.Option;
import com.cyan.hotel.repository.OptionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class OptionServiceImpl implements OptionService {

  @Autowired
  private OptionRepository optionRepository;

  @Override
  public List<Option> findAll() {
    return optionRepository.findAll();
  }
}
