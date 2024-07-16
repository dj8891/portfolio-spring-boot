package com.example.portfolio_spring_boot.controller;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.portfolio_spring_boot.repository.ProjectsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.portfolio_spring_boot.model.Projects;


@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api")

public class ProjectsController {

  @Autowired
  ProjectsRepository projectsRepo;

  @GetMapping("/projects")
  public ResponseEntity<List<Projects>> getAllProjects() {
    try {
      List<Projects> projectsList = new ArrayList<Projects>();
      projectsRepo.findAll().forEach(projectsList::add);
      return new ResponseEntity<>(projectsList, HttpStatus.OK);  
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
}
