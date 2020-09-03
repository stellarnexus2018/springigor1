package ru.master.igor;

import org.springframework.stereotype.Component;

//@Component
public class MetalMusic implements IMusic {
  @Override
  public String getSong() {
    return "Inhale";
  }
}
