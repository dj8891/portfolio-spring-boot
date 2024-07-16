package com.example.portfolio_spring_boot.controller;

import com.example.portfolio_spring_boot.model.Usage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.portfolio_spring_boot.repository.UsageRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api")

public class UsageController {

  @Autowired
  UsageRepository usageRepo;

  @GetMapping("/usages")
  public ResponseEntity<List<Object>> getAllUsages() {
    try {
      List<Usage> usages = usageRepo.findAll();
      List<Object> rtnObj = usages.stream().map(usage -> {
        return Map.of(
            "id", usage.getId(),
            "techTitle", usage.getTechTitle(),
            "tools", usage.getTools().stream().map(tool -> {
              return Map.of(
                "id", tool.getId(),
                "url", tool.getUrl(),
                "tool", tool.getTool(),
                "desc", tool.getTool(),
                "href", tool.getHref()
              );
            }).collect(Collectors.toList())
        );
      }).collect(Collectors.toList());
      return new ResponseEntity<>(rtnObj, HttpStatus.OK);
    }
    catch(Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
}
