package com.example.portfolio_spring_boot.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_usage")
public class Usage {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "techTitle")
  private String techTitle;

  public Usage() {}
  public Usage(Long id, String techTitle) {
    this.id = id;
    this.techTitle = techTitle;
  }

  @OneToMany(mappedBy = "usage", cascade = CascadeType.ALL)
  private List<Tools> tools;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTechTitle() {
    return techTitle;
  }

  public void setTechTitle(String techTitle) {
    this.techTitle = techTitle;
  }

  public List<Tools> getTools() {
    return tools;
  }

  public void setTools(List<Tools> tools) {
    this.tools = tools;
  }
}
