package com.example.portfolio_spring_boot.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "tbl_jobs")
public class Jobs {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  
  @Column(name = "logo")
  private String logo;

  @Column(name = "company")
  private String company;

  @Column(name = "title")
  private String title;

  @Column(name = "start_date")
  @JsonProperty("start_date")
  private LocalDate start_date;

  @Column(name = "end_date")
  @JsonProperty("end_date")
  private LocalDate end_date;

  @Column(name = "desc")
  private String desc;

  @Column(name = "created_at")
  private LocalDateTime createdAt;

  @Column(name = "updated_at")
  private LocalDateTime updatedAt;

  public Jobs() {  }

  public Jobs(Long id, String logo, String company, String title, LocalDate start_date, LocalDate end_date, String desc, LocalDateTime createdAt, LocalDateTime updatedAt ) {
    this.id = id;
    this.logo = logo;
    this.company = company;
    this.title = title;
    this.start_date = start_date;
    this.end_date = end_date;
    this.desc = desc;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public LocalDate getStartDate() {
    return start_date;
  }

  public void setStartDate(LocalDate start_date) {
    this.start_date = start_date;
  }

  public LocalDate getEndDate() {
    return end_date;
  }

  public void setEndDate(LocalDate endDate) {
    this.end_date = endDate;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
}
