package ru.master.igor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mus_pl")
public class MusicPlayer {

  private IMusic imuse;


  @Autowired
  public void setImuse(IMusic imuse) {
    this.imuse = imuse;
  }

  public void PlaySound(){
    System.out.println("Playing music: " + imuse.getSong());
  }
}