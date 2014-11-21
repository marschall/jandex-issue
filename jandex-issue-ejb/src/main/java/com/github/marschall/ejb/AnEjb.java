package com.github.marschall.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.sql.DataSource;

import com.github.marschall.jandexjdbc.JdbcTemplate;

@Singleton
@Startup
public class AnEjb {

  @Resource(name="myDataSource", lookup="java:comp/DefaultDataSource")
  private DataSource dataSource;

  @PostConstruct
  public void ejbCreate() {
    new JdbcTemplate(dataSource);
  }
  
}
