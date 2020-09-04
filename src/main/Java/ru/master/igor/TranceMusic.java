package ru.master.igor;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class TranceMusic implements IMusic {

  /*private TranceMusic(){
    System.out.println("in ctor");
  }*/

  public static TranceMusic obtainNewInstance(){
    return new TranceMusic();
  }

  @PostConstruct
  public void doMyInit() {
    System.out.println("init bean");
  }

  @PreDestroy
  public void doMyDestroy() {
    System.out.println("destroy bean");
  }



  @Override
  public String getSong() {
    return "Mars4";
  }
}
