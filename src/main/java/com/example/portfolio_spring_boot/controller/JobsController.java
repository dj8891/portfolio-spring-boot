package com.example.portfolio_spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.portfolio_spring_boot.repository.JobsRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.portfolio_spring_boot.model.Jobs;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api")
public class JobsController {

  @Autowired
  JobsRepository jobsRepo;

  @GetMapping("/jobs")
  public ResponseEntity<List<Jobs>> getAllJobs() {
    try {
      List<Jobs> jobs = new ArrayList<Jobs>();
      jobsRepo.findAll().forEach(job -> jobs.add(job));
      return new ResponseEntity<>(jobs, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
}
