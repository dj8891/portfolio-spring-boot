package com.example.portfolio_spring_boot.model;

import jakarta.persistence.*;
@Entity
@Table(name = "tbl_tools")
public class Tools {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name="url")
  private String url;

  @Column(name = "tool")
  private String tool;

  @Column(name = "desc") 
  private String desc;

  @Column(name = "href")
  private String href;

  @ManyToOne
  @JoinColumn(name = "usage_id")
  private Usage usage;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getTool() {
    return tool;
  }

  public void setTool(String tool) {
    this.tool = tool;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }
  public Tools() {}
  public Tools( long id, String url, String tool, String desc, String href ) {
    this.id = id;
    this.url = url;
    this.tool = tool;
    this.desc = desc;
    this.href = href;
  }
}


