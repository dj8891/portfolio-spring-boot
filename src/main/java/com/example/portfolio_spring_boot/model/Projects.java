package com.example.portfolio_spring_boot.model;

import jakarta.persistence.*;

@Entity
@Table(name="tbl_projects")
public class Projects {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "uid")
  private String uid;

  @Column(name = "src")
  private String src;

  @Column(name = "title")
  private String title;

  @Column(name = "desc")
  private String desc;

  @Column(name = "url")
  private String url;

  public Projects() {}

  public Projects(long id, String uid, String src, String title, String desc, String url) {
    this.id = id;
    this.uid = uid;
    this.src = src;
    this.title = title;
    this.desc = desc;
    this.url = url;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
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

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
