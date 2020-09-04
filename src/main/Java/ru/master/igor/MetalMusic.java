package ru.master.igor;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
@Scope("prototype")
public class MetalMusic implements IMusic {
  @Override
  public String getSong() {
    return "Inhale";
  }


  @PostConstruct
  public void doMyInit() {
    System.out.println("init bean");
  }

  @PreDestroy
  public void doMyDestroy() {
    System.out.println("destroy bean");
  }








}
