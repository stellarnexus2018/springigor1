package ru.master.igor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class MusicPlayer {

  @Value("${myprops.name}")
  private String name;
  @Value("${myprops.volume}")
  private int volume;
  @Value("${myprops.is_now}")
  private boolean is_now;

  public String getName() {
    return name;
  }

  public int getVolume() {
    return volume;
  }

  public boolean isIs_now() {
    return is_now;
  }

  private IMusic t_muse;
  private IMusic m_muse;

  public MusicPlayer(@Qualifier("tranceMusic") IMusic t_muse, @Qualifier("metalMusic") IMusic m_muse) {
    this.t_muse = t_muse;
    this.m_muse = m_muse;
  }

  public void PlaySound(){
    System.out.println("Playing music: " + t_muse.getSong() + ", " + m_muse.getSong());
  }

}