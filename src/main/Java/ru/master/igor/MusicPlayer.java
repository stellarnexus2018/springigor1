package ru.master.igor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mus_pl")
public class MusicPlayer {


  private IMusic imuse1;
  private IMusic imuse2;

  public MusicPlayer(@Qualifier("tranceMusic") IMusic imuse1, @Qualifier("metalMusic") IMusic imuse2) {
    this.imuse1 = imuse1;
    this.imuse2 = imuse2;
  }

  public void PlaySound(){
    System.out.println("Playing music: " + imuse1.getSong() + ", " + imuse2.getSong());
  }
}