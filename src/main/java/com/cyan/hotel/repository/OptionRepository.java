package com.cyan.hotel.repository;

import com.cyan.hotel.model.Option;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OptionRepository extends JpaRepository<Option, Long> {
  List<Option> findAll();
}
